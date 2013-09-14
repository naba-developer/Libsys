package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.AllBorrowersDisplayResultsTableModel;

public class AllBorrowersDisplayButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		public AllBorrowersDisplayButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Display Borrowers"))
				{
						String query = getQuery();
						
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								LibrarySystem.FrameItems.allBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
								LibrarySystem.itemDisabler.disableAllBorrowersPanelItems();
								return;
						}
						
						try 
						{
								if(resultSet.next() == false)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no borrowers entered in the database yet");
										LibrarySystem.FrameItems.allBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
										LibrarySystem.itemDisabler.disableAllBorrowersPanelItems();
										return;
										
								}
						} 
						catch (Exception ex) 
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
						
						createTable(resultSet);
						
						LibrarySystem.DatabaseManager.closeConnection();
						
						LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar.getMaximum());
				}
				
				if(ae.getActionCommand().equals("Print"))
				{
						if(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresultstable_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable.getModel());
						
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);	
				}
		}	
		
		private void createTable(ResultSet resultset)
		{
				LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable = new JTable(new AllBorrowersDisplayResultsTableModel(LibrarySystem, resultset));
				LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchresultstable_scrollpane.setViewportView(LibrarySystem.FrameItems.allBorrowersPanelItems.ResultsTable);
				LibrarySystem.itemEnabler.enableAllBorrowersPanelItems();
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		private String getQuery()
		{
				String query;
				
				query = "SELECT * FROM Borrowers";
				
				query = query + getOrder();
				
				return query;
		}
		
		private String getOrder()
		{
				if(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborroweraccnumber_checkbox.isSelected())
				{
						return " ORDER BY B_id";
				}
				
				if(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborrowername_checkbox.isSelected())
				{
						return " ORDER BY B_name";
				}
				
				return " ORDER BY B_id";
		}
}
