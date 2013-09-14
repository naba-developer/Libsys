package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class DeleteBooksDeleteSelectedtButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String query1,query2,prefix1,prefix2,add;
		
		public DeleteBooksDeleteSelectedtButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Delete Selected"))
				{
						if(checkSelection() == false)
						{
								return;
						}
						
						int [] SelectedRows = LibrarySystem.FrameItems.deleteBooksPanelItems.ResultsTable.getSelectedRows();
						
						prefix1 = "DELETE FROM Books where Book_id = '";
						prefix2 = "DELETE FROM Transactions where Book_id = '";
						
						int i = 0;
						
						while(i < SelectedRows.length)
						{
								add = LibrarySystem.FrameItems.deleteBooksPanelItems.ResultsTable.getValueAt(SelectedRows[i], 0).toString() + "'";
								
								query1 = prefix1 + add;
								query2 = prefix2 + add;
								
								int result = LibrarySystem.DatabaseManager.executeOtherQuery(query2);
								
								if(result == -1 || result == -2)
								{
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query1);
								
								if(result == -1 || result == -2)
								{
										return;
								}
								
								i++;
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
									
								event.EventID = 4;
								event.EventName = "Existing Book : " + add + " deleted from database.";
								event.EventTime = d.toString();
								event.Username = LibrarySystem.current;
										
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
						}
						
						if(SelectedRows.length == 1)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The selected book has been successfully deleted");
						}
						else if(SelectedRows.length > 1)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The selected books have been successfully deleted");
						}
						
						LibrarySystem.listeners.buttonListeners.deleteBooksSearchButtonListener.refreshTableData();					
				}
		}
		
		private boolean checkSelection()
	       {
			       if(LibrarySystem.FrameItems.deleteBooksPanelItems.ResultsTable.getSelectedRow() == -1)
			       {
					       JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Select some records first and then press delete");
					       return false;
			       }
			       
			       return true;
	       }
		
		private void refreshTableData()
		{
				LibrarySystem.listeners.buttonListeners.deleteBooksSearchButtonListener.actionPerformed(new ActionEvent(LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn, 1, "Search"));
		}
}
