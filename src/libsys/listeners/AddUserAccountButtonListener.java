package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class AddUserAccountButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public AddUserAccountButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Add Account"))
				{
						if(checkInput() == false)
						{
								return;
						}
						
						String username = LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt.getText();
						String password = new String(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password.getPassword());
						String question = LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt.getText();
						String answer = LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt.getText();
																		
						try
						{
								LibrarySystem.loginManager.addNewAccount(username, password, question, answer, LibrarySystem.UserAccountsFile, LibrarySystem.QuestionsFile, LibrarySystem.AnswersFile, LibrarySystem.RememberFile, LibrarySystem.GuestFile, false);
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
						
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "The new Guest Account has been registered successfully!");
						
						LibrarySystem.FrameList.AccountsManagerFrame.setVisible(false);
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.AccountsManagerFrame);
						LibrarySystem.systemResetter.resetAddAccountPanel();
				}
				
				else if(ae.getActionCommand().equals("Cancel"))
				{
						LibrarySystem.FrameList.AccountsManagerFrame.setVisible(false);
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.AccountsManagerFrame);
						LibrarySystem.systemResetter.resetAddAccountPanel();
				}
		}
		
		private boolean checkInput()
		{
				if(LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt.getText() == null || LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Username", "No Username", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password.getPassword() == null || LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password.getPassword().length == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Password", "No Password", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password.getPassword() == null || LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password.getPassword().length == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Password Confirm", "No Password Confirmation", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt.getText() == null || LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter a Security Question", "No Security Question", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt.getText() == null || LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter an answer to the Security Question", "No Security Answer", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				String Password = new String(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password.getPassword());
				String PasswordConfirmation = new String(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password.getPassword());
				
				if(!Password.equals(PasswordConfirmation))
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Password and Password Confirmation do not match", "Wrong Password Confirmation", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				return true;
		}
}
