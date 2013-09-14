package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SearchBorrowersSearchResultsTableModel;
import libsys.general.utilities.SystemLogEvent;

public class SearchBorrowersSearchButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		String query;
		String add = null;
		BorrowersData borrowersData=new BorrowersData();
		
		public SearchBorrowersSearchButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Search"))
				{
						String query ="SELECT * FROM Borrowers WHERE";
						
						borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText();
						borrowersData.BorrowerName=LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText();
						
						if(check(borrowersData.BorrowerAccountNumber))
						{
								add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";								
						}
						
							
						if(check(borrowersData.BorrowerName))
						{
								if(add==null)
								{
										add =" B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
								else
								{
										add = add + " and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
								}
						}
						
						query = query + add + "ORDER BY B_id";

						try
						{
								resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
								
								if(resultSet == null)
								{
										LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
										
										LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setEnabled(false);
										refreshTableData();
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								if(resultSet.next() == false)
								{
										LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
										
										LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setEnabled(false);
										refreshTableData();
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "No Borrower exists in the database which qualifies the given search criteria");
										
										LibrarySystem.DatabaseManager.closeConnection();
										
										return;
								}
								
								createTable(resultSet);
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
									
								event.EventID = 4;
								event.EventName = "Borrower  search from database recorded.";
								event.EventTime = d.toString();
								event.Username = LibrarySystem.current;
										
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar.getMaximum());
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
				
				if(ae.getActionCommand().equals("Print"))
				{
						LibrarySystem.systemResetter.resetPrintPreviewFrame();
						
						if(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable.getModel());
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);					
				}
		}
		
		private void refreshTableData()
		{
				String query ="SELECT * FROM Borrowers WHERE";
						
				borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText();
				borrowersData.BorrowerName=LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText();
						
				if(check(borrowersData.BorrowerAccountNumber))
				{
						add = " B_id like'"+borrowersData.BorrowerAccountNumber+"%'";								
				}
				
				if(check(borrowersData.BorrowerName))
				{
						if(add==null)
						{
								add =" B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
						else
						{
								add = add + " and "+" B_name LIKE '"+borrowersData.BorrowerName+"%'";
						}
				}
						
				query = query + add + "ORDER BY B_id";
				try
				{
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
								
								LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setEnabled(false);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								return;
						}
						
						if(resultSet.next() == false)
						{
								LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
								
								LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setEnabled(false);
								
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
		
		private void createTable(ResultSet resultset)
		{
				LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable = new JTable(new SearchBorrowersSearchResultsTableModel(LibrarySystem, resultset));
				LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(LibrarySystem.FrameItems.searchBorrowerPanelItems.ResultsTable);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setEnabled(true);
				
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
}