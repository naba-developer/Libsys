package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.DeleteBorrowersSearchResultsTableModel;

public class DeleteBorrowersSearchButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String query,add;
		ResultSet resultSet;
		BorrowersData borrowersData=new BorrowersData();
		
		public DeleteBorrowersSearchButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Search"))
				{
						String query = "SELECT * FROM Borrowers WHERE";
						
						borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText();
						borrowersData.BorrowerName=LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText();
						
						if(check(borrowersData.BorrowerAccountNumber))
						{
								add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";
								
						}						
							
						if(check(borrowersData.BorrowerName))
						{
								if(add==null)
								{
										add = " B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
								else
								{
										add = add + " and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
						}
						
						query = query + add;
						
						try
						{
								resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
								
								if(resultSet == null)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								if(resultSet.next() == false)
								{
										LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane.setViewportView(null);
										
										LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn.setEnabled(false);
										LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn.setEnabled(false);
										
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "No Borrower exists in the database which qualifies the given search criteria");
										
										LibrarySystem.DatabaseManager.closeConnection();
										
										return;
								}
								
								createTable(resultSet);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar.getMaximum());
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
		}
		
		private void createTable(ResultSet resultSet)
		{
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable = new JTable(new DeleteBorrowersSearchResultsTableModel(LibrarySystem, resultSet));
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane.setViewportView(LibrarySystem.FrameItems.deleteBorrowersPanelItems.ResultsTable);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn.setEnabled(true);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn.setEnabled(true);
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		private  boolean check(String s)
		{
				if(s.compareTo("") == 0)
				{						
						return false;
				}
				
				return true;
		}
		
		public void refreshTableData()
		{
				String query = "SELECT * FROM Borrowers WHERE";
						
				borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText();
				borrowersData.BorrowerName=LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText();
						
				if(check(borrowersData.BorrowerAccountNumber))
				{
						add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";
						
				}						
						
				if(check(borrowersData.BorrowerName))
				{
						if(add==null)
						{
								add = " B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
						else
						{
								add = add + " and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
				}
				
				query = query + add;
				
				try
				{
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								LibrarySystem.DatabaseManager.closeConnection();
								return;
						}
						
						if(resultSet.next() == false)
						{
								LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane.setViewportView(null);
								LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn.setEnabled(false);
								LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn.setEnabled(false);
								//JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "No Borrower exists in the database which qualifies the given search criteria");
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								return;
						}
						
						createTable(resultSet);
						
						LibrarySystem.DatabaseManager.closeConnection();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
		}
}
