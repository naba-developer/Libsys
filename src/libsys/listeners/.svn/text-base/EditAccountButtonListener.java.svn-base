package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class EditAccountButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public EditAccountButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Submit"))
				{
						String Username = LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt.getText();
						String Password = new String(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password.getPassword());
						String NewUsername = LibrarySystem.FrameItems.editAccountPanelItems.newusername_txt.getText();
						String NewPassword = new String(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_password.getPassword());
						String NewQuestion = LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_txt.getText();
						String NewAnswer = LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_txt.getText();
						
						if(checkInput() == false)
						{
								return;
						}
						
						try
						{
								if(LibrarySystem.loginManager.checkLogin(Username, Password, LibrarySystem.UserAccountsFile) == false)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Incorrect Username or Password");
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
						
						try
						{
								LibrarySystem.loginManager.editUserAccount(Username, LibrarySystem.UserAccountsFile, LibrarySystem.QuestionsFile, LibrarySystem.AnswersFile, LibrarySystem.RememberFile, LibrarySystem.GuestFile, NewUsername, NewPassword, NewQuestion, NewAnswer);
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "The account has been successfully edited.");
								
								LibrarySystem.current = NewUsername;
								
								LibrarySystem.FrameList.AccountsManagerFrame.setVisible(false);
								LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.AccountsManagerFrame);
								LibrarySystem.systemResetter.resetEditAccountPanel();
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
				
				else if(ae.getActionCommand().equals("Forgot Password"))
				{
						String Username = LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt.getText();
						
						if(Username == null || Username.length() == 0)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the username");
								return;
						}
						
						try
						{
								boolean exists = LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile);
								
								if(exists == true)
								{
										String Question = LibrarySystem.loginManager.getQuestion(Username, LibrarySystem.QuestionsFile);
										
										String answer = JOptionPane.showInputDialog(LibrarySystem.FrameList.AccountsManagerFrame, Question, "Answer the Security Question", JOptionPane.QUESTION_MESSAGE);
										
										if(LibrarySystem.loginManager.verifyAnswer(Username, answer, LibrarySystem.AnswersFile) == true)
										{
												String password = LibrarySystem.loginManager.getPassword(Username, LibrarySystem.UserAccountsFile);
												
												LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password.setText(password);
												
												return;
										}
										
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Incorrect Answer");
										
										return;
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter a correct username. The give username does not exists");
								return;
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
				
				else if(ae.getActionCommand().equals("Cancel"))
				{
						LibrarySystem.FrameList.AccountsManagerFrame.setVisible(false);
						LibrarySystem.systemResetter.resetEditAccountPanel();
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.AccountsManagerFrame);
				}
		}
		
		private boolean checkInput()
		{
				String Username = LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt.getText();
				String Password = new String(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password.getPassword());
				String ConfirmNewPassword = new String(LibrarySystem.FrameItems.editAccountPanelItems.confirmnewpassword_password.getPassword());
				String NewUsername = LibrarySystem.FrameItems.editAccountPanelItems.newusername_txt.getText();
				String NewPassword = new String(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_password.getPassword());
				String NewQuestion = LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_txt.getText();
				String NewAnswer = LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_txt.getText();
				
				if(Username == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the username");
						return false;
				}
				
				if(Password == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the password");
						return false;
				}
				
				if(NewUsername == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the new ");
						return false;
				}
				
				if(NewPassword == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the new password");
						return false;
				}
				
				if(ConfirmNewPassword == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the password confirmation");
						return false;
				}
				
				if(NewQuestion == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the new security question");
						return false;
				}
				
				if(NewAnswer == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Enter the new answer to the security question");
						return false;
				}
				
				if(!NewPassword.equals(ConfirmNewPassword))
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "The new Password and the confirmation do not match");
						return false;
				}
				
				return true;
		}
}
