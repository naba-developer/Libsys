package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;

public class BorrowerRecordsBorrowerAccNumberTextBoxListener  implements FocusListener
{	
		LIBSYSSystem LibrarySystem;
		BorrowersData borrowersData=new BorrowersData();
		ResultSet resultSet;
		public BorrowerRecordsBorrowerAccNumberTextBoxListener(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}		
		
		public void focusLost(FocusEvent fe) 
		{
				borrowersData.BorrowerAccountNumber=LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt.getText();
				
				if(borrowersData.BorrowerAccountNumber == null || borrowersData.BorrowerAccountNumber.length() == 0)
				{
						LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
						LibrarySystem.itemDisabler.disableBorrowerRecordsPanelItems();
						return;
				}
				
				String query ="SELECT *  FROM Borrowers where B_id= '"+borrowersData.BorrowerAccountNumber+"'";
								
				try
				{
						resultSet=LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								return;
						}
						
						if(resultSet.next() == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "No record exists in the database with Account Number : " + borrowersData.BorrowerAccountNumber);
								LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
								LibrarySystem.itemDisabler.disableBorrowerRecordsPanelItems();
								return;
						}
						
						LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_txt.setText(resultSet.getObject(2).toString());
						LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_txt.setText(resultSet.getObject(3).toString());
						LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowersex_txt.setText(resultSet.getObject(6).toString());
						LibrarySystem.FrameItems.borrowerRecordsPanelItems.address_textarea.setText(resultSet.getObject(5).toString());
						
						query="SELECT image FROM Images where B_id='"+borrowersData.BorrowerAccountNumber+"'";
						
						resultSet = LibrarySystem.DatabaseManager.executeSelectQuery(query);
						
						if(resultSet == null)
						{
								return;
						}
						
						ImageIcon icon = null;
						
						if(resultSet.next() == true)
						{
								icon = LibrarySystem.imageManager.createImageIcon(resultSet);
						}
						
						LibrarySystem.imageManager.setImageToLabel(icon, LibrarySystem.FrameItems.borrowerRecordsPanelItems.imagedestination_label);
						LibrarySystem.itemEnabler.enableBorrowerRecordsPanelItems();
						LibrarySystem.DatabaseManager.closeConnection();
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
