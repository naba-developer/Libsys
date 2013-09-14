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

public class UpdateBorrowersSubmitButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		int result;
		BorrowersData borrowersData=new BorrowersData();
		
		public UpdateBorrowersSubmitButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Submit"))
				{
						borrowersData.BorrowerAddress=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_textarea.getText();
						borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText();
						
						borrowersData.BorrowerEMail=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt.getText();
						borrowersData.BorrowerName=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText();
						borrowersData.BorrowerPhone=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt.getText();
						borrowersData.BorrowerSex=LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.getSelectedItem().toString();
						
						setData();
						
						if(checkPhoneNumber() == false)
						{
								return;
						}
						
						String previousAccountNumber = LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.getValueAt(LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.getSelectedRow(), 0).toString();
						
						try
						{
								if(!previousAccountNumber .equals( borrowersData.BorrowerAccountNumber))
								{
										ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery("SELECT *FROM Borrowers WHERE B_id = '" + borrowersData.BorrowerAccountNumber + "'");
										
										if(resultSet == null)
										{
												LibrarySystem.DatabaseManager.closeConnection();
												return;
										}
										
										if(resultSet.next() == true)
										{
												JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The database already contains a borrower with Account Number : " + borrowersData.BorrowerAccountNumber + ". Enter a different Account Number or delete the existing borrower to continue");
												LibrarySystem.DatabaseManager.closeConnection();
												return;
										}
								}							
								
								String query1="UPDATE  Transactions SET B_id='"+borrowersData.BorrowerAccountNumber+"' where B_id='"+previousAccountNumber+"'";
								String query2="UPDATE  Borrowers  SET B_id='"+borrowersData.BorrowerAccountNumber+"',B_name='"+borrowersData.BorrowerName+"',B_email='"+borrowersData.BorrowerEMail+"',B_phno='"+borrowersData.BorrowerPhone+"',B_address='"+borrowersData.BorrowerAddress+"',B_sex='"+borrowersData.BorrowerSex+"' where B_id='"+previousAccountNumber+"'";
								String query3="UPDATE Images SET B_id='"+borrowersData.BorrowerAccountNumber+"'  where B_id='"+previousAccountNumber+"'";
								String query5="UPDATE Fines SET B_id='"+borrowersData.BorrowerAccountNumber+"'  where B_id='"+previousAccountNumber+"'";
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query1);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query3);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query5);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query5);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								result = LibrarySystem.DatabaseManager.executeOtherQuery(query2);
								
								if(result == -1 || result == -2)
								{
										LibrarySystem.DatabaseManager.closeConnection();
										return;
								}
								
								if(!LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.getText().equals(""))
								{
										File f = new File(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.getText());
										
										if(f.exists() == true)
										{
												String query4 = "SELECT B_id FROM Images where B_id='"+borrowersData.BorrowerAccountNumber+"'";
												
												ResultSet resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query4);
												
												if(resultSet == null)
												{
														LibrarySystem.DatabaseManager.closeConnection();
														return;
												}
												
												if(resultSet.next() == true)
												{
														result = LibrarySystem.DatabaseManager.executeOtherQuery("DELETE FROM Images where B_id='"+borrowersData.BorrowerAccountNumber+"'");
														
														if(result == -1 || result == -2)
														{
																LibrarySystem.DatabaseManager.closeConnection();
																return;
														}
												}
												
												FileInputStream fimage = LibrarySystem.imageManager.getImageFileInputStream(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.getText());																							
																			
												result = LibrarySystem.DatabaseManager.executeImageInsertQuery(fimage,borrowersData.BorrowerAccountNumber);
												
												if(result == -1 || result == -2)
												{
														LibrarySystem.DatabaseManager.closeConnection();
														return;
												}
										}
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The borrower details have been successfully update to the database");
								
								LibrarySystem.listeners.buttonListeners.updateBorrowersSearchButtonListener.refreshTableData();
								
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								LibrarySystem.systemResetter.resetUpdateBorrowerUpdatePanel();
								LibrarySystem.DatabaseManager.closeConnection();
								
								Date d = new Date();
								SystemLogEvent event = new SystemLogEvent();
										
								event.EventID = 4;
								event.EventName = "Existing Borrower : " + borrowersData.BorrowerAccountNumber + " updated to database.";
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