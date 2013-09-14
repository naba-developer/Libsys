package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.AllTransactionsSearchResultsTableModel;

public class AllTransactionsDisplayButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String date1,year1,date2,year2;
		String query;
		int month1,month2;
		String option;
		ResultSet resultSet;
		String display="%d-%m-%Y";
		public AllTransactionsDisplayButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{				
				if((JButton)ae.getSource()==LibrarySystem.FrameItems.specificDatePanelItems.displaytransactions_btn)
				{
						date1=LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString();
						month1=LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.getSelectedIndex()+1;
						year1=LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.getValue().toString();
						query=formspecificdatequery(date1,month1,year1);
						System.out.println(query);
				}
				
				else if((JButton)ae.getSource()==LibrarySystem.FrameItems.specificMonthPanelItems.displaytransactions_btn)
				{
						month1=LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_combobox.getSelectedIndex()+1;
						year1=LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_spinner.getValue().toString();
						query=formspecificmonthquery(month1,year1);
						System.out.println(query);
				}
				
				else if((JButton)ae.getSource()==LibrarySystem.FrameItems.specificYearPanelItems.displaytransactions_btn)
				{
					
						year1=LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_spinner.getValue().toString();
						query=formspecificyearquery(year1);
						System.out.println(query);
				}
				
				else if((JButton)ae.getSource()==LibrarySystem.FrameItems.customDateRangePanelItems.display_btn)
				{					
						date1=LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.getSelectedItem().toString();
						month1=LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox.getSelectedIndex()+1;
						year1=LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner.getValue().toString();
						date2=LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.getSelectedItem().toString();
						month2=LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox.getSelectedIndex()+1;
						year2=LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner.getValue().toString();
						query=formcustomrangequery(date1,month1,year1,date2,month2,year2);
						System.out.println(query);
				}
				
				else if((JButton)ae.getSource()==LibrarySystem.FrameItems.currentTransactionPanelItems.displaytransaction_button)
				{
					
						option=LibrarySystem.FrameItems.currentTransactionPanelItems.transactionduration_combobox.getSelectedItem().toString();
						
						if(option.equals("Today"))
						{
								SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
								Date d=new Date();
								String day= format.format(d);
								query="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date=str_to_date('"+day+"','%d-%m-%Y')";
						}
						else if(option.equals("This Week"))
						{
								SimpleDateFormat format=new SimpleDateFormat("EEE");
								Date d=new Date();
								String week=format.format(d);
								int index=getIndex(week);
								
								int day1=1-index;
								String date1=getDate(day1);
								int day2=7-index;
								String date2=getDate(day2);
								
								query="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date between str_to_date('"+date1 +"','%d-%m-%Y') and  str_to_date('"+date2+"','%d-%m-%Y')";
						}
						
						else if(option.equals("This Month"))
						{
								SimpleDateFormat format=new SimpleDateFormat("yyyy-MM");
								Date d=new Date();
								String month= format.format(d);
								query="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date  like'"+month+"-__'";
						}
						
						else if(option.equals("This Year"))
						{
								SimpleDateFormat format=new SimpleDateFormat("yyyy");
								Date d=new Date();
								String year=format.format(d);
								query="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date like'"+year+"-%'";
							
						}		
					
						else if(option.equals("Entire Transaction Log"))
						{
								query="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id";
						}
				}
				
				resultSet =LibrarySystem.DatabaseManager.executeSelectQuery(query);
				
				if(resultSet == null)
				{
						LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane.setViewportView(null);
						LibrarySystem.itemDisabler.disableAllTransactionsPanelItems();
						return;
				}
				
				try
				{
						if(resultSet.next() == false)
						{
								LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane.setViewportView(null);
								LibrarySystem.itemDisabler.disableAllTransactionsPanelItems();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "There are no transactions recorded in the database during the given time period.");
								return;
						}
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				createTable(resultSet);
				
				LibrarySystem.DatabaseManager.closeConnection();
				
				LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar.getMaximum());
		}
		
		private void createTable(ResultSet resultSet)
		{
				LibrarySystem.FrameItems.transactionPanelItems.ResultsTable = new JTable(new AllTransactionsSearchResultsTableModel(LibrarySystem,resultSet));
				LibrarySystem.FrameItems.transactionPanelItems.ResultsTable.setAutoCreateRowSorter(true);
				LibrarySystem.FrameItems.transactionPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
				LibrarySystem.FrameItems.transactionPanelItems.ResultsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				LibrarySystem.FrameItems.transactionPanelItems.ResultsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane.setViewportView(LibrarySystem.FrameItems.transactionPanelItems.ResultsTable);
				LibrarySystem.itemEnabler.enableAllTransactionsPanelItems();
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		private String formspecificdatequery(String date1,int month1,String year1)
		{				
				String s="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date=str_to_date('"+date1+"-"+month1+"-"+year1+"','%d-%m-%Y')";
				return s;
		}
		
		private String formspecificmonthquery(int month1,String year1)
		{
				String s="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date like'"+year1+"-%"+month1+"%'";
				return s;
		}
		
		private String formspecificyearquery(String year1)
		{
				String s="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date like'"+year1+"%'";
				return s;
		}
		
		private String formcustomrangequery(String date1,int month1,String year1,String date2,int month2,String year2)
		{
				String day1=date1+"-"+month1+"-"+year1;
				String day2=date2+"-"+month2+"-"+year2;
				String s="SELECT  B.Book_id,B.Book_title,R.B_id,R.B_name,date_format(T.Borrow_date,'%d-%m-%Y'),date_format(T.Due_date,'%d-%m-%Y'),date_format(T.Return_date,'%d-%m-%Y') from Books B,Borrowers R,Transactions T where T.B_id=R.B_id and T.Book_id=B.Book_id and Borrow_date between str_to_date('"+day1 +"','%d-%m-%Y') and  str_to_date('"+day2+"','%d-%m-%Y')";
				return s;		
		}
		private int  getIndex(String s)
		{
				String day[]={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
				
				for(int i=0;i<7;i++)
				{
						if(day[i].equals(s))
						{
								return i+1;
						}
				}
				
				return 0;
		}
		
		private String getDate(int index)
		{
				Date d=new Date(System.currentTimeMillis()+index*24*60*60*1000);
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return format.format(d);
		}
		
}
