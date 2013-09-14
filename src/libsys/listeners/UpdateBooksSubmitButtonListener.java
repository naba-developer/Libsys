package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.BooksData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class UpdateBooksSubmitButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		BooksData bookData;
		
		public UpdateBooksSubmitButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				bookData = new BooksData();
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Submit"))
				{
						bookData.BookAccountNumber=LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText();
						bookData.BookAuthors=LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthor_txt.getText();
						bookData.BookEdition=LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_spinner.getValue().toString();
						bookData.BookPublishers=LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt.getText();
						bookData.BookTitle=LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText();
						bookData.BookPrice=LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.getText();
						
						setBookData();
						
						if(checkPrice() == false)
						{
								return;
						}					
						
						String previousAccountNumber = LibrarySystem.FrameItems.updateBooksPanelItems.ResultsTable.getValueAt(LibrarySystem.FrameItems.updateBooksPanelItems.ResultsTable.getSelectedRow(), 0).toString();
						
						try
						{
								if(!bookData.BookAccountNumber.equals( previousAccountNumber))
								{
										ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery("SELECT * FROM Books WHERE Book_id = '" + bookData.BookAccountNumber+"'");
										
										if(resultSet == null)
										{
												LibrarySystem.DatabaseManager.closeConnection();
												return;
										}
										
										if(resultSet.next() == true)
										{
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The database already contains a book with Account Number : " + bookData.BookAccountNumber + ". Enter a different Account Number or delete the existing book to continue");
												LibrarySystem.DatabaseManager.closeConnection();
												return;
										}
								}
								
								String query1="UPDATE Books SET Book_id='"+bookData.BookAccountNumber+"',Book_title='"+bookData.BookTitle+"',Book_author='"+bookData.BookAuthors+"',Book_publisher='"+bookData.BookPublishers+"',Book_edition='"+bookData.BookEdition+"',Book_price='"+bookData.BookPrice+"' where Book_id='"+previousAccountNumber+"'";
								String query2="UPDATE Transactions SET Book_id='"+bookData.BookAccountNumber+"' where Book_id='"+previousAccountNumber+"'";
								
								int result = LibrarySystem.DatabaseManager.executeOtherQuery(query2);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query1);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The book details have been updated to the database successfully");
								
								LibrarySystem.listeners.buttonListeners.updateBooksSearchButtonListener.refreshTableData();
								
								LibrarySystem.itemDisabler.disableUpdateBooksUpdatePanel();
								LibrarySystem.systemResetter.resetUpdateBooksUpdatePanel();
								LibrarySystem.DatabaseManager.closeConnection();
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
										
								event.EventID = 4;
								event.EventName = "Existing Book : " + bookData.BookAccountNumber+ " updated to database.";
								event.EventTime = d.toString();
								event.Username = LibrarySystem.current;
										
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
		}
		
		private boolean checkPrice()
		{
				if(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.getText() == null || LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.getText().length() == 0)
				{
						return true;
				}
				
				if(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.getText().equals("Not Available"))
				{
						return true;
				}
				
				try
				{
						Double.parseDouble(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.getText());
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