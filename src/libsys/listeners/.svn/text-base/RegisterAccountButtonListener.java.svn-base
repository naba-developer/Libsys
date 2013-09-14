package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class RegisterAccountButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public RegisterAccountButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Add Account"))
				{
						String Username = LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt.getText();
						String Password = new String(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password.getPassword());
						String PasswordConfirmation = new String(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password.getPassword());
						String Question = LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_txt.getText();
						String Answer = LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_txt.getText();
						
						if(checkInput() == false)
						{
								return;
						}
						
						try
						{
								boolean isRemembered = false;
								
								LibrarySystem.loginManager.addNewAccount(Username, Password, Question, Answer, LibrarySystem.UserAccountsFile, LibrarySystem.QuestionsFile, LibrarySystem.AnswersFile, LibrarySystem.RememberFile, LibrarySystem.GuestFile, isRemembered);
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}		
						
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.NavigationFrame);
						LibrarySystem.current = Username;
						
						addEventToLog();
						
						LibrarySystem.FrameList.NavigationFrame.setVisible(true);
						LibrarySystem.FrameList.AccountRegistrationFrame.setVisible(false);
				}
				
				else if(ae.getActionCommand().equals("Cancel"))
				{
						int choice = JOptionPane.showConfirmDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Are you Sure you want to exit LIBSYS?", "Confirm Exit", JOptionPane.YES_NO_CANCEL_OPTION);
						
						if(choice == JOptionPane.YES_OPTION)
						{
								System.exit(0);
						}
				}
		}
		
		private boolean checkInput()
		{
				if(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt.getText() == null || LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Username", "No Username", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password.getPassword() == null || LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password.getPassword().length == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Password", "No Password", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password.getPassword() == null || LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password.getPassword().length == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter the Password Confirm", "No Password Confirmation", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_txt.getText() == null || LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter a Security Question", "No Security Question", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				if(LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_txt.getText() == null || LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Enter an answer to the Security Question", "No Security Answer", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				String Password = new String(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password.getPassword());
				String PasswordConfirmation = new String(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password.getPassword());
				
				if(!Password.equals(PasswordConfirmation))
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountRegistrationFrame, "Password and Password Confirmation do not match", "Wrong Password Confirmation", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				return true;
		}
		
		private void addEventToLog()
		{
				SystemLogEvent Event = new SystemLogEvent();
				Date date = new Date();
				
				Event.EventID = 9;
				Event.EventName = "New User Account added";
				Event.Username = LibrarySystem.userAccountManager.getCurrentUser();
				Event.EventTime = date.toString();
				
				LibrarySystem.systemLogManager.addEventToLogFile(Event, LibrarySystem.SystemLogFile);
		}
}
