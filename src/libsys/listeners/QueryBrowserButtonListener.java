package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.QueryBrowserSearchResultsTableModel;

public class QueryBrowserButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		public QueryBrowserButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Execute Query"))
				{
						String query = LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getText();
						
						if(query == null || query.length() == 0)
						{
								return;
						}
						
						query = query.toUpperCase();
						
						if(query.startsWith("SELECT") == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Only \"SELECT\" queries are allowed in the Query Browser");
								return;
						}
						
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						/*try
						{
								System.out.println(resultSet.next());
						}
						catch(Exception ex)
						{
								ex.printStackTrace();;
						}*/
						if(resultSet == null)
						{
								return;
						}
						
						try
						{
								if(resultSet.next() == false)
								{
										LibrarySystem.FrameItems.queryBrowserPanelItems.tables_scrollpane.setViewportView(null);
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no records qualifying the SQL Query");
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								
								return;
						}
						
						
						createTable(resultSet);
				}
		}
		
		private void createTable(ResultSet resultset)
		{
				try
				{
				System.out.println(resultset.isClosed());
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable = new JTable(new QueryBrowserSearchResultsTableModel(LibrarySystem, resultset));
				LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.queryBrowserPanelItems.tables_scrollpane.setViewportView(LibrarySystem.FrameItems.queryBrowserPanelItems.ResultsTable);
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
}
