package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class DeleteBorrowersDeleteSelectedtButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		BorrowersData borrowersData=new BorrowersData();
		int result;
		String query1,query2,prefix1,prefix2,prefix3,add,query3,query4,prefix4;
		public DeleteBorrowersDeleteSelectedtButtonListener(LIBSYSSystem LibrarySystem)
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
						
						int [] SelectedRows = LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.getSelectedRows();
						
						prefix1 = "DELETE FROM Borrowers where B_id='";
						prefix2 = "DELETE FROM Transactions where B_id='";
						prefix3="DELETE FROM Images where B_id='";
						prefix4="DELETE  FROM Fines where B_id='";
						
						int i = 0;
						
						while(i < SelectedRows.length)
						{
								add = LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.getValueAt(SelectedRows[i], 0).toString() + "'";
								
								query1=prefix1+add;
								query2=prefix2+add;
								query3=prefix3+add;
								query4=prefix4+add;
								LibrarySystem.DatabaseManager.executeOtherQuery(query2);
								LibrarySystem.DatabaseManager.executeOtherQuery(query3);
								LibrarySystem.DatabaseManager.executeOtherQuery(query4);
								LibrarySystem.DatabaseManager.executeOtherQuery(query1);
								
								i++;
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
									
								event.EventID = 4;
								event.EventName = "Existing Borrower : " + add + " deleted from database.";
								event.EventTime = d.toString();
								event.Username = LibrarySystem.current;
										
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
						}
						
						LibrarySystem.listeners.buttonListeners.deleteBorrowersSearchButtonListener.refreshTableData();
				}
				
		}
		
		private boolean checkSelection()
	       {
			       if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.getSelectedRow() == -1)
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
