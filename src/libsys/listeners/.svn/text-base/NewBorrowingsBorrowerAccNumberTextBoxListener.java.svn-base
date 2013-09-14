package libsys.listeners;

import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import javax.swing.ImageIcon;
import libsys.general.*;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.MySQLManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import libsys.general.BooksData;


public class NewBorrowingsBorrowerAccNumberTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		public NewBorrowingsBorrowerAccNumberTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}		
		
		public void focusLost(FocusEvent fe)
		{
				if(LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.getText().compareTo("") == 0)
				{			
						LibrarySystem.systemResetter.resetBorrowingsBorrowerItems();
						return;
				}
						
				BorrowersData borrowerData = new BorrowersData();
						
				borrowerData.BorrowerAccountNumber = LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.getText();
												
				try
				{					
						String query = getQuery(borrowerData.BorrowerAccountNumber);
						
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								return;
						}
						
						if(resultSet.next() == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"No Borrower exists in the database with Account Number : " + borrowerData.BorrowerAccountNumber);
								
								LibrarySystem.systemResetter.resetBorrowingsBorrowerItems();
								
								return;
						}
								
						borrowerData.BorrowerAddress=resultSet.getObject(5).toString();
						borrowerData.BorrowerEMail=resultSet.getObject(3).toString();
						borrowerData.BorrowerName=resultSet.getObject(2).toString();
						borrowerData.BorrowerPhone=resultSet.getObject(4).toString();
						borrowerData.BorrowerSex=resultSet.getObject(6).toString();
								
						query = "SELECT image FROM Images where B_id='"+borrowerData.BorrowerAccountNumber+"'";
								
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								return;
						}
							
						ImageIcon icon = null;
						
						if(resultSet.next())
						{
								icon = LibrarySystem.imageManager.createImageIcon(resultSet);
						}
							
						LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt.setText(borrowerData.BorrowerSex);
						LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.setText(borrowerData.BorrowerName);
						LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_textarea.setText(borrowerData.BorrowerAddress);
						LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt.setText(borrowerData.BorrowerPhone);
						LibrarySystem.FrameItems.borrowingPanelItems.email_txt.setText(borrowerData.BorrowerEMail);
						
						LibrarySystem.imageManager.setImageToLabel(icon, LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label);
						
						LibrarySystem.DatabaseManager.closeConnection();							
						
						LibrarySystem.deleteTemporaryImageFile();
						
						if(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.getText() == null || LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.getText().length() == 0)
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
				String query = "SELECT * FROM BORROWERS WHERE B_id = '" + AccNumber + "'";
				
				return query;
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
