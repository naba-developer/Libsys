package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class InsertBorrowerSubmitButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		BorrowersData borrowersData = new BorrowersData();
		int result;
		
		public InsertBorrowerSubmitButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Add Borrower"))
				{						
						borrowersData.BorrowerAddress=LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_textarea.getText();
						borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText();
						
						borrowersData.BorrowerEMail=LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt.getText();
						borrowersData.BorrowerName=LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText();
						borrowersData.BorrowerPhone=LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt.getText();
						borrowersData.BorrowerSex=LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox.getSelectedItem().toString();
						
						setData();
						
						if(checkPhoneNumber() == false)
						{
								return;
						}
						
						try
						{
								ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery("SELECT *FROM Borrowers WHERE B_id = '" + borrowersData.BorrowerAccountNumber + "'");
								
								if(resultSet == null)
								{
										return;
								}
								
								if(resultSet.next() == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The database already contains a borrower with Account Number : " + borrowersData.BorrowerAccountNumber + ". Enter a different Account Number or delete the existing borrower to continue");
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								String query ="INSERT INTO BORROWERS VALUES('"+borrowersData.BorrowerAccountNumber+"','"+borrowersData.BorrowerName+"','"+borrowersData.BorrowerEMail+"','"+borrowersData.BorrowerPhone+"','"+borrowersData.BorrowerAddress+"','"+borrowersData.BorrowerSex+"')";
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query);
								
								if(result == -1 || result == -2)
								{
										return;
								}
								
								if(!LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.getText().equals(""))
								{
										File f = new File(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.getText());
										
										if(f.exists() == true)
										{
												FileInputStream fimage=LibrarySystem.imageManager.getImageFileInputStream(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.getText());
												result = LibrarySystem.DatabaseManager.executeImageInsertQuery(fimage,borrowersData.BorrowerAccountNumber);
												
												if(result == -1 || result == -2)
												{
														return;
												}
												
												LibrarySystem.DatabaseManager.closeConnection();
										}									
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The borrower has been successfully inserted into the database");
										
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								LibrarySystem.systemResetter.resetInsertBorrowersPanel();
								LibrarySystem.DatabaseManager.closeConnection();
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
										
								event.EventID = 4;
								event.EventName = "New Borrower : " + borrowersData.BorrowerAccountNumber + " inserted into database.";
								event.EventTime = d.toString();
								event.Username = LibrarySystem.current;
										
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
										
								return;
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
		}
		
		private boolean checkPhoneNumber()
		{
				return true;
		}
		
		private void setData()
		{
				if(borrowersData.BorrowerAddress == null || borrowersData.BorrowerAddress.length() == 0)
				{
						borrowersData.BorrowerAddress = "Not Available";
				}
				
				if(borrowersData.BorrowerEMail == null || borrowersData.BorrowerEMail.length() == 0)
				{
						borrowersData.BorrowerEMail = "Not Available";
				}
				
				if(borrowersData.BorrowerPhone == null || borrowersData.BorrowerPhone.length() == 0)
				{
						borrowersData.BorrowerPhone = "Not Available";
				}
		}
}
