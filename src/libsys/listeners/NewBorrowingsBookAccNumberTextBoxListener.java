package libsys.listeners;


import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import libsys.general.BooksData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.MySQLManager;

public class NewBorrowingsBookAccNumberTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		public NewBorrowingsBookAccNumberTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe) 
		{
				if(LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.getText().compareTo("")==0)
				{		
						LibrarySystem.systemResetter.resetBorrowingsBookItems();
						return;
				}
					
				BooksData bookData = new BooksData();
												
				bookData.BookAccountNumber = LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.getText();
								
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
										
										LibrarySystem.systemResetter.resetBorrowingsBookItems();
								
										return;
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"The Book with Account Number : " + bookData.BookAccountNumber + " is not available for Borrowing at present.");
								
								LibrarySystem.systemResetter.resetBorrowingsBookItems();
									
								return;
						}							
							
						bookData.BookTitle=resultSet.getObject(2).toString();
						bookData.BookAuthors=resultSet.getObject(3).toString();
						bookData.BookEdition=resultSet.getObject(5).toString();
						bookData.BookPrice=resultSet.getObject(6).toString();
						bookData.BookPublishers=resultSet.getObject(4).toString();
							
						LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt.setText(bookData.BookAuthors);
						LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt.setText(bookData.BookEdition);
						LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt.setText(bookData.BookPrice);
						LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt.setText(bookData.BookPublishers);
						LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.setText(bookData.BookTitle);		
						
						LibrarySystem.DatabaseManager.closeConnection();
						
						if(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.getText() == null || LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.getText().length() == 0)
						{
								return;
						}
						
						if(LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.getText().length() == 0)
						{
								return;
						}
						
						LibrarySystem.itemEnabler.enableBorrowingsPanelItems();
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
		}
		
		private String getQuery(String AccNumber)
		{
				String query = "SELECT * FROM BOOKS WHERE Book_id = '" + AccNumber+"'  and Book_availaible='Yes'";
				
				return query;
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
