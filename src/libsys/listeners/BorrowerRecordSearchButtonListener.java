package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.BorrowerRcordsSearchResultsTableModel;

public class BorrowerRecordSearchButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String accnum;
		String query;
		ResultSet resultSet;
		public BorrowerRecordSearchButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Search"))
				{
						accnum=LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt.getText();
						
						if(accnum == null || accnum.length() == 0)
						{				
								LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
								LibrarySystem.itemDisabler.disableBorrowerRecordsPanelItems();
								return;
						}
						
						if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox.isSelected())
						{
								 query="SELECT B.B_id, B.B_name, C.Book_id, C.Book_title, T.Borrow_date, T.Due_date,T.Return_date FROM Books C,Borrowers B,Transactions T where B.B_id=T.B_id and C.Book_id=T.Book_id and T.B_id='"+accnum+"'";
						}
						
						else if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox.isSelected())
						{
								 query="SELECT B.B_id, B.B_name, C.Book_id, C.Book_title, T.Borrow_date, T.Due_date, T.Return_date FROM Books C,Borrowers B,Transactions T where B.B_id=T.B_id and C.Book_id=T.Book_id and T.B_id='"+accnum+"' and T.Return_date is null";
						}
						
						else if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox.isSelected())
						{
								 query="SELECT B.B_id, B.B_name, C.Book_id, C.Book_title, T.Borrow_date, T.Due_date, T.Return_date FROM Books C,Borrowers B,Transactions T where B.B_id=T.B_id and C.Book_id=T.Book_id and T.B_id='"+accnum+"' and T.Return_date is  not null";
						}
						else
						{
								query="SELECT B.B_id, B.B_name, C.Book_id, C.Book_title, T.Borrow_date, T.Due_date,T.Return_date FROM Books C,Borrowers B,Transactions T where B.B_id=T.B_id and C.Book_id=T.Book_id and T.B_id='"+accnum+"'";
						}
						
						try
						{
								resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
								
								if(resultSet == null)
								{
										LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
										LibrarySystem.itemDisabler.disableBorrowerRecordsPanelItems();
										return;
								}
								
								if(resultSet.next() == false)
								{
										if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox.isSelected())
										{
												LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
												
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no transactions recorded against the borrower with Account Number : " + accnum);
												
												return;
										}
												
										if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox.isSelected())
										{
												LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
												
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no pending transactions recorded against the borrower with Account Number : " + accnum);
												
												return;
										}
												
										if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox.isSelected())
										{
												LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
												
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no completed transactions recorded against the borrower with Account Number : " + accnum);
												
												return;
										}
								}
								
								createTable(resultSet);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar.setValue(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar.getMaximum());
						}
						catch(Exception e)
						{
								e.printStackTrace();
										
						}
				}
				
				if(ae.getActionCommand().equals("Print"))
				{
						if(LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable.getModel());
						
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);	
				}
		}
		
		private void createTable(ResultSet resultSet)
		{
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable = new JTable(new BorrowerRcordsSearchResultsTableModel(LibrarySystem, resultSet));
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(LibrarySystem.FrameItems.borrowerRecordsPanelItems.ResultsTable);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.print_btn.setEnabled(true);
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
}

