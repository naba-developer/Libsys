package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;
import libsys.general.LIBSYSSystem;

public class DeleteAccountsTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public DeleteAccountsTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				String Username = LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt.getText();
				String Password = new String(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password.getPassword());
				
				if(Username == null || Username.length() == 0)
				{
						return;
				}
				
				if(Password == null || Password.length() == 0)
				{
						return;
				}
				
				try
				{
						if(LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "The given username does not exists.");
								return;
						}
						
						if(LibrarySystem.loginManager.isUserGuest(Username, LibrarySystem.GuestFile) == true)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "User Access Control prevents you to delete registered LIBSYS accounts. Log in to the 'Admnistrator Account' to do so");
								return;
						}
						
						if(LibrarySystem.loginManager.checkLogin(Username, Password, LibrarySystem.UserAccountsFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Incorrect Username or Password");
								return;
						}
						
						String [] Guest = LibrarySystem.loginManager.getGuestList(LibrarySystem.GuestFile);
						
						if(Guest == null)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "There are no guest accounts registered to LIBSYS");
								LibrarySystem.systemResetter.resetDeleteAccountPanel();
								return;
						}
						
						LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list = new JList(Guest);
						
						LibrarySystem.FrameItems.deleteUserAccountPanelItems.SelectedUserScrollPane.setViewportView(LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list);
						
						LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
