package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class DeleteAccountsButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public DeleteAccountsButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Delete Selected Accounts"))
				{
						String Username = LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt.getText();
						
						try
						{
								if(LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile) == false)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Incorrect Username. The given username does not exists.");
										return;
								}
								
								if(LibrarySystem.loginManager.isUserGuest(Username, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "User Access Control prevents you to delete registered LIBSYS accounts. Log in to the 'Admnistrator Account' to do so");
										return;
								}
								
								String Password = new String(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password.getPassword());
								
								if(LibrarySystem.loginManager.checkLogin(Username, Password, LibrarySystem.UserAccountsFile) == false)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Incorrect Username or password.");
										return;
								}
								
								int [] SelectedIndices = LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list.getSelectedIndices();
								
								if(LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list.getSelectedIndex() == -1)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Select an account to delete first and the press 'Delete Selected'.");
										return;
								}
								int choice = JOptionPane.showConfirmDialog(LibrarySystem.FrameList.AccountsManagerFrame, "Are you sure you want to delete the selected Guest Accounts?", "Confirm Delete", JOptionPane.YES_NO_CANCEL_OPTION);
								
								if(choice != JOptionPane.YES_OPTION)
								{
										return;
								}
								Object [] Guest = LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list.getSelectedValues();
								
								for(int i = 0; i < Guest.length;  i++)
								{
										LibrarySystem.loginManager.deleteUserAccount(Guest[i].toString(), LibrarySystem.UserAccountsFile, LibrarySystem.QuestionsFile, LibrarySystem.AnswersFile, LibrarySystem.RememberFile, LibrarySystem.GuestFile);
								}
								
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.AccountsManagerFrame, "The selected accounts have been deleted succesfully");
								LibrarySystem.systemResetter.resetDeleteAccountPanel();
								return;
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}
				}
				
				else if(ae.getActionCommand().equals("Forgot Password"))
				{
						String Username = LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt.getText();
						
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
												
												LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password.setText(password);
												
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
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.AccountsManagerFrame);
						LibrarySystem.systemResetter.resetDeleteAccountPanel();
				}
		}
}
