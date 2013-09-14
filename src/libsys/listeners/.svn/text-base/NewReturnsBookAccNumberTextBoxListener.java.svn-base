package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import libsys.general.BooksData;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.MySQLManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



public class NewReturnsBookAccNumberTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		public NewReturnsBookAccNumberTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				BooksData bookData = new BooksData();
				BorrowersData borrowersData=new BorrowersData();
						
				bookData.BookAccountNumber = LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.getText();
				
				if(bookData.BookAccountNumber == null || bookData.BookAccountNumber.length() == 0)
				{
						return;
				}
						
				try
				{					
						String query = getQuery(bookData.BookAccountNumber);
							
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);	
							
						if(resultSet == null)
						{
								return;
						}
								
						if(resultSet.next() == false)
						{
								resultSet = LibrarySystem.DatabaseManager.executeSelectQuery("SELECT * FROM Books WHERE Book_id = '" + bookData.BookAccountNumber + "'");
										
								if(resultSet.next() == false)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"No Book exists in the database with Account Number : " + bookData.BookAccountNumber);
												
										LibrarySystem.systemResetter.resetReturnsPanel();
										
										return;
								}
										
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"The Book with Account Number : " + bookData.BookAccountNumber + " is not borrowed by anyone at present.");
										
								LibrarySystem.systemResetter.resetReturnsPanel();
										
								return;
						}							
								
						bookData.BookTitle=resultSet.getObject("Book_title").toString();
						bookData.BookAuthors=resultSet.getObject("Book_author").toString();
						bookData.BookEdition=resultSet.getObject("Book_edition").toString();
						bookData.BookPrice=resultSet.getObject("Book_price").toString();
						bookData.BookPublishers=resultSet.getObject("Book_publisher").toString();
								
						borrowersData.BorrowerAccountNumber=resultSet.getObject("Borrowers.B_id").toString();
						borrowersData.BorrowerAddress=resultSet.getObject("B_address").toString();
						borrowersData.BorrowerEMail=resultSet.getObject("B_email").toString();
						borrowersData.BorrowerName=resultSet.getObject("B_name").toString();
						borrowersData.BorrowerPhone=resultSet.getObject("B_phno").toString();
						borrowersData.BorrowerSex=resultSet.getObject("B_sex").toString();
						
						String borrowdate=resultSet.getObject("Borrow_date").toString();
						String duedate=resultSet.getObject("Due_date").toString();
						
						borrowdate = getFormattedDate(borrowdate);
						duedate = getFormattedDate(duedate);
						
						LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.setText(bookData.BookAuthors);
						LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.setText(bookData.BookEdition);
						LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.setText(bookData.BookPrice);
						LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.setText(bookData.BookPublishers);
						LibrarySystem.FrameItems.returnPanelItems.bookname_txt.setText(bookData.BookTitle);	
								
						LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.setText(borrowersData.BorrowerAddress);
						LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.setText(borrowersData.BorrowerSex);
						LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.setText(borrowersData.BorrowerEMail);
						LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.setText(borrowersData.BorrowerPhone);
						LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.setText(borrowersData.BorrowerAccountNumber);
						LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.setText(borrowersData.BorrowerName);
						
						LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.setText(borrowdate);
						LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.setText(duedate);
						
						query = "SELECT image from Images where B_id = '"+borrowersData.BorrowerAccountNumber+"'";
						
						resultSet=LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						ImageIcon icon = null;
						
						if(resultSet.next() == true)
						{
								icon = LibrarySystem.imageManager.createImageIcon(resultSet);
						}
						
						LibrarySystem.imageManager.setImageToLabel(icon, LibrarySystem.FrameItems.returnPanelItems.imagedestination_label);						
						
						LibrarySystem.DatabaseManager.closeConnection();
						
						LibrarySystem.deleteTemporaryImageFile();
							
						if(LibrarySystem.FrameItems.returnPanelItems.bookname_txt.getText() == null || LibrarySystem.FrameItems.returnPanelItems.bookname_txt.getText().length() == 0)
						{
								return;
						}
								
						if(LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.getText().length() == 0)
						{
								return;
						}
								
						LibrarySystem.itemEnabler.enableReturnsPanelItems();
				}
				catch(Exception e)
				{
						e.printStackTrace();								
				}
		}
		
		private String getFormattedDate(String date)
		{
				StringTokenizer DateTokenizer = new StringTokenizer(date, "-");
				
				String year = DateTokenizer.nextToken();
				String month = DateTokenizer.nextToken();
				String day = DateTokenizer.nextToken();
				
				String FormattedDate = day + "-" + month + "-" + year;
				
				return FormattedDate;
		}
		
		private String getQuery(String AccNumber)
		{
				String query = "SELECT * FROM BOOKS,TRANSACTIONS,BORROWERS WHERE Books.Book_id = Transactions.Book_id and Transactions.Return_date is null and Borrowers.B_id=(SELECT B_id FROM TRANSACTIONS  WHERE Transactions.Return_date is null and Transactions.Book_id='" + AccNumber+"') and Transactions.Book_id='"+AccNumber + "'";
				
				return query;
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
