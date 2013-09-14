package libsys.listeners;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import libsys.general.LIBSYSSystem;

public class QueryBrowserTextAreaListener implements DocumentListener
{
		LIBSYSSystem LibrarySystem;
		
		public QueryBrowserTextAreaListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void insertUpdate(DocumentEvent de)
		{
				if(LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText() == null || LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText().length() == 0)
				{
						LibrarySystem.itemDisabler.disableQueryBrowserPanelItems();
						return;
				}
				
				LibrarySystem.itemEnabler.enableQueryBrowserPanelItems();
		}
		
		public void changedUpdate(DocumentEvent de)
		{
				if(LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText() == null || LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText().length() == 0)
				{
						LibrarySystem.itemDisabler.disableQueryBrowserPanelItems();
						return;
				}
				
				LibrarySystem.itemEnabler.enableQueryBrowserPanelItems();
		}
		
		public void removeUpdate(DocumentEvent de)
		{
				if(LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText() == null || LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText().length() == 0)
				{
						LibrarySystem.itemDisabler.disableQueryBrowserPanelItems();
						return;
				}
				
				LibrarySystem.itemEnabler.enableQueryBrowserPanelItems();
		}
}
