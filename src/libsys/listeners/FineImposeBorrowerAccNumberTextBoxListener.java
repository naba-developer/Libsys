package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;

public class FineImposeBorrowerAccNumberTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		ResultSet resultSet;
		
		
		public FineImposeBorrowerAccNumberTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe) 
		{
				if(LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.getText().compareTo("") == 0)
				{								
						return;
				}
						
				BorrowersData borrowerData = new BorrowersData();
				
				borrowerData.BorrowerAccountNumber = LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.getText();
											
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
										
								LibrarySystem.systemResetter.resetFineImposePanel();
								LibrarySystem.itemDisabler.disableFineImposePanelItems();
								LibrarySystem.DatabaseManager.closeConnection();
								return;
						}
								
						borrowerData.BorrowerAddress=resultSet.getObject(5).toString();
						borrowerData.BorrowerEMail=resultSet.getObject(3).toString();
						borrowerData.BorrowerName=resultSet.getObject(2).toString();
						borrowerData.BorrowerPhone=resultSet.getObject(4).toString();
						borrowerData.BorrowerSex=resultSet.getObject(6).toString();
						
						LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.setText(borrowerData.BorrowerSex);
						LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.setText(borrowerData.BorrowerName);
						LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.setText(borrowerData.BorrowerAddress);
						LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt.setText(borrowerData.BorrowerPhone);
						LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.setText(borrowerData.BorrowerEMail); 
						
						query="SELECT image  FROM Images where B_id='"+borrowerData.BorrowerAccountNumber+"'";
						
						resultSet=LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								return;
						}
						
						ImageIcon icon = null;
						
						if(resultSet.next())
						{
								icon = LibrarySystem.imageManager.createImageIcon(resultSet);
						}
						
						LibrarySystem.imageManager.setImageToLabel(icon, LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label);
						
						LibrarySystem.DatabaseManager.closeConnection();							
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}				
		}
		
		private String getQuery(String AccNumber)
		{
				String query = "SELECT * FROM BORROWERS WHERE B_id = " + AccNumber;
				
				return query;
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
