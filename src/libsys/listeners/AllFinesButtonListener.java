package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.AllFinesDisplayResultsTableModel;

public class AllFinesButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public AllFinesButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Display Fines"))
				{
						String query;
						
						if(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.isSelected() == true)
						{
								query = "SELECT * FROM Fines WHERE Fine_paid = 'Not Paid'";
						}
						
						else if(LibrarySystem.FrameItems.allFinesPanelItems.allpaidfines_checkbox.isSelected() == true)
						{
								query = "SELECT * FROM Fines WHERE Fine_paid = 'Paid'";
						}
						
						else if(LibrarySystem.FrameItems.allFinesPanelItems.allfines_checkbox.isSelected() == true)
						{
								query = "SELECT * FROM Fines";
						}
						
						else
						{
								query = "SELECT * FROM Fines";
						}
						
						ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setViewportView(null);
								return;
						}
						
						try
						{
								LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setViewportView(null);
								
								if(resultSet.next() == false)
								{
										if(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.isSelected() == true)
										{
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no imposed fines recorded in the database. ");
												return;
										}
														
										if(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.isSelected() == true)
										{
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no unpaid fines recorded in the database. ");
												return;
										}
												
										if(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.isSelected() == true)
										{
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no imposed fines recorded in the database. ");
												return;
										}
										
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no imposed fines recorded in the database. ");
										return;
								}
								
								createTable(resultSet);
								
								LibrarySystem.DatabaseManager.closeConnection();
								
								LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar.getMaximum());
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
				
				if(ae.getActionCommand().equals("Print"))
				{
						if(LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable.getModel());
						
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);
				}
		}
		
		private void createTable(ResultSet resultset)
		{
				LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable = new JTable(new AllFinesDisplayResultsTableModel(LibrarySystem,resultset));
				LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setViewportView(LibrarySystem.FrameItems.allFinesPanelItems.ResultsTable);
				LibrarySystem.itemEnabler.enableAllFinesPanelItems();
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
}
