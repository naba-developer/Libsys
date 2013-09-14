package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.UpdateBorrowersSearchResultsTableModel;

public class UpdateBorrowersSearchButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		BorrowersData borrowersData=new BorrowersData();
		String add = null;
		
		public UpdateBorrowersSearchButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Search"))
				{
						String query ="SELECT * FROM Borrowers WHERE";
						
						borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText();
						borrowersData.BorrowerName=LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText();
						
						if(check(borrowersData.BorrowerAccountNumber))
						{
								add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";								
						}
						
							
						if(check(borrowersData.BorrowerName))
						{
								if(add==null)
								{
										add=" B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
								else
								{
										add+=" and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
						}
						
						query = query + add + "ORDER BY B_id";
						
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
										LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
										LibrarySystem.FrameItems.updateBooksPanelItems.print_btn.setEnabled(false);
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "No Borrower exists in the database which qualifies the given search criteria");
										
										LibrarySystem.DatabaseManager.closeConnection();
										
										return;
								}
								
								createTable(resultSet);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar.getMaximum());
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
		}
		
		private void createTable(ResultSet resultset)
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable = new JTable(new UpdateBorrowersSearchResultsTableModel(LibrarySystem, resultset));
				LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane.setViewportView(LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable);
				LibrarySystem.FrameItems.updateBooksPanelItems.print_btn.setEnabled(true);
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
				String query ="SELECT * FROM Borrowers WHERE";
						
				borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText();
				borrowersData.BorrowerName=LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText();
						
				if(check(borrowersData.BorrowerAccountNumber))
				{
						add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";								
				}
				
				if(check(borrowersData.BorrowerName))
				{
						if(add==null)
						{
								add=" B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
						else
						{
								add+=" and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
				}
						
				query = query + add + "ORDER BY B_id";
						
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
								LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
								
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