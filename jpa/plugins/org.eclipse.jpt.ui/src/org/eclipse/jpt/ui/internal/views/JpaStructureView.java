/*******************************************************************************
 *  Copyright (c) 2006 Oracle. All rights reserved. This
 *  program and the accompanying materials are made available under the terms of
 *  the Eclipse Public License v1.0 which accompanies this distribution, and is
 *  available at http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors: Oracle. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jpt.ui.internal.views;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jpt.core.internal.IJpaContentNode;
import org.eclipse.jpt.core.internal.IJpaFile;
import org.eclipse.jpt.ui.internal.IJpaPlatformUi;
import org.eclipse.jpt.ui.internal.IPreferenceConstants;
import org.eclipse.jpt.ui.internal.JptUiMessages;
import org.eclipse.jpt.ui.internal.PlatformRegistry;
import org.eclipse.jpt.ui.internal.jface.NullLabelProvider;
import org.eclipse.jpt.ui.internal.jface.NullTreeContentProvider;
import org.eclipse.jpt.ui.internal.selection.Selection;
import org.eclipse.jpt.ui.internal.structure.IJpaStructureProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.PartInitException;

public class JpaStructureView extends AbstractJpaView 
{
	private boolean linkedWithEditor;
	
	private StructureComposite structureComposite;
	
	
	public JpaStructureView() {
		super(JptUiMessages.JpaStructureView_viewNotAvailable);
	}
	
	
	/* @see IViewPart#init(IViewSite, IMemento) */
	public void init(IViewSite site, IMemento memento) throws PartInitException {
		if (memento != null) {
			Integer i = memento.getInteger(
					IPreferenceConstants.LINK_STRUCTURE_VIEW_TO_EDITOR);
			
			setLinkedWithEditor(i != null && i.intValue() == 1);
		}
		
		super.init(site, memento);
	}
	
	@Override
	public void subcreatePartControl(Composite parent) {
		structureComposite = 
			new StructureComposite(pageBook, SWT.NULL);
		
		IActionBars actionBars = ((IViewSite) getSite()).getActionBars();
		IToolBarManager toolBarManager= actionBars.getToolBarManager();
		if (toolBarManager != null) {
			toolBarManager.add(new ToggleLinkingAction());
		}
	}
	
	/* @see IPersistable#saveState(IMemento) */
	public void saveState(IMemento memento) {
		memento.putInteger(
				IPreferenceConstants.LINK_STRUCTURE_VIEW_TO_EDITOR, 
				linkedWithEditor ? 1 : 0);
		super.saveState(memento);
	}
	
	public boolean isLinkedWithEditor() {
		return linkedWithEditor;
	}

	public void setLinkedWithEditor(boolean newValue) {
		linkedWithEditor = newValue;
	}
	
	public Selection getSelection() {
		if (structureComposite.isVisible()) {
			return structureComposite.getSelection(); 
		}
		else {
			return Selection.NULL_SELECTION;
		}
	}
	
	@Override
	public void select(Selection newSelection) {
		Selection currentSelection = getSelection();
		
		if (newSelection.equals(currentSelection)) {
			return;
		}
		
		if (newSelection == Selection.NULL_SELECTION) {
			showDefaultPage();
		}
		else {
			pageBook.showPage(structureComposite);
		}
		
		structureComposite.select(newSelection);
	}
	
	
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		structureComposite.viewer.addSelectionChangedListener(listener);
	}
	
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		structureComposite.viewer.removeSelectionChangedListener(listener);
	}
	
	
	private class StructureComposite extends Composite 
	{
		/* key: String file content id,  value: IJpaStructureProvider */
		private Map structureProviders;
		
		private TreeViewer viewer;
		
		private StructureComposite(Composite parent, int style) {
			super(parent, style);
			
			structureProviders = new HashMap();
			
			this.setLayout(new FillLayout());
			
			viewer = new TreeViewer(this, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
			viewer.setAutoExpandLevel(2);
			initContextMenu();
		}
		
	    protected void initContextMenu() {
	        // Create dynamic menu mgr.  Dynamic is currently required to
	        // support action contributions.
	        MenuManager mgr = new MenuManager();
	        mgr.setRemoveAllWhenShown(true);
	        mgr.addMenuListener(new IMenuListener() {
	            public void menuAboutToShow(IMenuManager mgr) {
	                fillContextMenu(mgr);
	            }
	        });
	        Menu menu = mgr.createContextMenu(viewer.getControl());
	        viewer.getControl().setMenu(menu);
	        getSite().registerContextMenu(mgr, viewer);
	       	        
	    }	
	    
	    /**
	     * Called when the context menu is about to open.
	     * Delegates to the action group using the viewer's selection as the action context.
	     * @since 2.0
	     */
	    protected void fillContextMenu(IMenuManager manager) {
	        manager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
	    }
	    
		private Selection getSelection() {
			ITreeSelection viewerSelection = (ITreeSelection) viewer.getSelection();
			
			if (viewerSelection.isEmpty() || viewerSelection.size() > 1) {
				if (viewer.getInput() == null) {
					return Selection.NULL_SELECTION;
				}
				else {
					return new Selection((IJpaContentNode) viewer.getInput());
				}
			}
			
			else {
				return new Selection((IJpaContentNode) viewerSelection.getFirstElement());
			}
			
		}
		
		private void select(Selection selection) {
			// note: checks for null and equals() selection have already been performed
			
			if (selection.equals(Selection.NULL_SELECTION)) {
				clearViewer();
				return;
			}
			
			Selection currentSelection = getSelection();
			IJpaContentNode newNode = selection.getSelectedNode();
			IJpaFile newFile = newNode.getJpaFile();
			IJpaContentNode currentNode = 
				(currentSelection == Selection.NULL_SELECTION) ?
						null : getSelection().getSelectedNode();
			IJpaFile currentFile = 
				(currentNode == null) ? 
						null : currentNode.getJpaFile();
			
			if (newFile.equals(currentFile)) {
				viewer.setSelection(new StructuredSelection(newNode), true);
			}
			else if (currentFile != null &&  newFile.getContentId().equals(currentFile.getContentId())) {
				viewer.setInput(newFile.getContent());
				viewer.setSelection(new StructuredSelection(newNode), true);
			}
			else {
				// new content type
				// replace composite and set selection of tree
				IJpaStructureProvider provider = getStructureProvider(newNode);
				
				if (provider == null) {
					clearViewer();
				}
				else {
					viewer.setContentProvider(provider.buildContentProvider());
					viewer.setLabelProvider(provider.buildLabelProvider());
					viewer.setInput(newFile.getContent());
				}
			}
		}
		
		private void clearViewer() {
			viewer.setContentProvider(NullTreeContentProvider.INSTANCE);
			viewer.setLabelProvider(NullLabelProvider.INSTANCE);
			viewer.setInput(null);
		}
		
		private IJpaStructureProvider getStructureProvider(IJpaContentNode contentNode) {
			String contentId = contentNode.getJpaFile().getContentId();
			IJpaStructureProvider provider = 
				(IJpaStructureProvider) structureProviders.get(contentId);
			
			if (provider == null) {
				String vendorId = contentNode.getJpaProject().getPlatform().getId();
				IJpaPlatformUi jpaPlatformUI = PlatformRegistry.INSTANCE.getJpaPlatform(vendorId);
				for (IJpaStructureProvider p : jpaPlatformUI.structureProviders()) {
					if (p.fileContentType().equals(contentId)) {
						provider = p;
						break;
					}
				}
				
				//TODO this view and the detailsProviders Map is not created on a per project basis.
				//the detailsProviders and their fileContentTypes could overlap across project, this would cause problems with storing this map.				
				if (provider != null) {
					structureProviders.put(contentId, provider);
				}
			}
			
			return provider;	
		}
	}
	
	private class ToggleLinkingAction extends Action 
	{
		public ToggleLinkingAction() {
			super(JptUiMessages.JpaStructureView_linkWithEditorText);
			setDescription(JptUiMessages.JpaStructureView_linkWithEditorDesc);
			setToolTipText(JptUiMessages.JpaStructureView_linkWithEditorTooltip);
			//TODO shouldn't be accessing this
			JavaPluginImages.setLocalImageDescriptors(this, "synced.gif"); //$NON-NLS-1$		
			// PlatformUI.getWorkbench().getHelpSystem().setHelp(this,
			// IJavaHelpContextIds.LINK_EDITOR_ACTION);
			setChecked(isLinkedWithEditor());
		}
	
		/**
		 * Runs the action.
		 */
		public void run() {
			setLinkedWithEditor(isChecked());
		}
	}
}
