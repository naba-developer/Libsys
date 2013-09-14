package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.BooksData;
import java.sql.ResultSet;
import libsys.general.utilities.MySQLManager;
import libsys.general.utilities.SystemLogEvent;

public class InsertBooksSubmitButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		BooksData bookData;
		
		public InsertBooksSubmitButtonListener(LIBSYSSystem LibraryStystem)
		{
				this.LibrarySystem = LibraryStystem;
				bookData = new BooksData();
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Submit"))
				{					
						bookData.BookAccountNumber = LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText();
						bookData.BookAuthors=LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_textarea.getText();
						bookData.BookTitle=LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText();
						bookData.BookPrice=LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.getText();
						bookData.BookPublishers=LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt.getText();
						bookData.BookEdition=LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_spinner.getValue().toString();
						
						setBookData();
						
						if(checkPrice() == false)
						{
								return;
						}
						
						try
						{			
								ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery("SELECT * FROM Books WHERE Book_id = '" + bookData.BookAccountNumber + "'");
								
								if(resultSet.next() == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The database already contains a book with Account Number : " + bookData.BookAccountNumber + ". Enter a different Account Number or delete the existing book to continue");
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								String query = "INSERT INTO BOOKS VALUES('"+bookData.BookAccountNumber+"','"+bookData.BookTitle+"','"+bookData.BookAuthors+"','"+bookData.BookPublishers+"','"+bookData.BookEdition+"','"+bookData.BookPrice+"','Yes')";
								
								int result = LibrarySystem.DatabaseManager.executeOtherQuery(query);	
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								else
								{										
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The book has been successfully inserted into the database");
										
										LibrarySystem.itemDisabler.disableInsertBookItems();
										LibrarySystem.systemResetter.resetInsertBooksPanel();
										LibrarySystem.DatabaseManager.closeConnection();
										
										Date d = new Date();
										SystemLogEvent event = new SystemLogEvent();
										
										event.EventID = 4;
										event.EventName = "New Book : " + bookData.BookAccountNumber+ " inserted into database.";
										event.EventTime = d.toString();
										event.Username = LibrarySystem.current;
										
										LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
										
										return;
								}
						}
						catch(Exception e)
						{
								e.printStackTrace();
						}
				}
				
				return;
		}
		
		private boolean checkPrice()
		{
				if(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.getText() == null || LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.getText().length() == 0)
				{
						return true;
				}
				
				try
				{
						Double.parseDouble(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.getText());
				}
				catch(Exception ex)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Enter a valid price of the book in figures. Do not type Rs/p etc. ");
						return false;
				}
				
				return true;
		}
		
		private void setBookData()
		{
				if(bookData.BookAuthors == null || bookData.BookAuthors.length() == 0)
				{
						bookData.BookAuthors = "Not Available";
				}
				
				if(bookData.BookPrice == null || bookData.BookPrice.length() == 0)
				{
						bookData.BookPrice = "Not Available";
				}
				
				if(bookData.BookPublishers == null || bookData.BookPublishers.length() == 0)
				{
						bookData.BookPublishers = "Not Available";
				}
				
				if(bookData.BookEdition == null || bookData.BookEdition.length() == 0)
				{
						bookData.BookEdition = "Not Available";
				}
		}
}
