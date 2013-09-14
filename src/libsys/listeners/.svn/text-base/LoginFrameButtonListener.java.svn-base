package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;
import libsys.general.utilities.DataFormatter;
public class LoginFrameButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public LoginFrameButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Login"))
				{
						String Username = LibrarySystem.FrameItems.loginFrameItems.username_txt.getText();
						String Password = new String(LibrarySystem.FrameItems.loginFrameItems.password_password.getPassword());
						
						if(checkInput() == true)
						{
								if(checkLogin(Username, Password)== true)
								{
										LibrarySystem.current = Username;
										Date d = new Date();
										
										SystemLogEvent event = new SystemLogEvent();
										
										event.EventID = 1;
										event.EventName = "LIBSYS Log In.";
										event.EventTime = d.toString();
										event.Username = Username;
										
										LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
										
										LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.NavigationFrame);
										
										LibrarySystem.FrameItems.loginFrameItems.username_txt.setEditable(true);
										
										if(LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox.isSelected() == true)
										{
												try
												{
														File f=new File(LibrarySystem.RememberFile);
														
														if(f.exists())
														{
																if(LibrarySystem.loginManager.isUsernameRemembered(Username, LibrarySystem.RememberFile) == false)
																{
																		LibrarySystem.loginManager.rememberPassword(Username, LibrarySystem.RememberFile);
																}
																
														}
														else
														{
																LibrarySystem.loginManager.rememberPassword(Username, LibrarySystem.RememberFile);
														}
												}
												catch(Exception ex)
												{
														LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
												}
										}
										else
										{
												try
												{
														if(LibrarySystem.loginManager.isUsernameRemembered(Username, LibrarySystem.RememberFile) == true)
														{
																System.out.println("error");
																LibrarySystem.loginManager.clearPassword(Username, LibrarySystem.RememberFile);
														}
												}
												catch(Exception ex)
												{
														
												}
										}
										
										LibrarySystem.FrameList.NavigationFrame.setVisible(true);
										LibrarySystem.FrameList.LoginFrame.setVisible(false);
										
										LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.NavigationFrame);
										LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.LoginFrame);
								}
						}
				}
				
				else if(ae.getActionCommand().equals("Forgot Password"))
				{
						String Username = LibrarySystem.FrameItems.loginFrameItems.username_txt.getText();
						
						launchSpecialLogin(Username);
				}
				
				else if(ae.getActionCommand().equals("Exit"))
				{
						if(LibrarySystem.FrameItems.loginFrameItems.username_txt.isEditable() == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Cannot shutdown LIBSYS without unlocking.");
								return;
						}
						int choice = JOptionPane.showConfirmDialog(LibrarySystem.FrameList.LoginFrame, "Are you sure you want to exit LIBSYS?", "Confirm Exit", JOptionPane.YES_NO_CANCEL_OPTION);
				
						if(choice == JOptionPane.YES_OPTION)
						{
								SystemLogEvent event = new SystemLogEvent();
								Date d = new Date();
								
								event.EventID = 1;
								event.EventName = "LIBSYS Exit.";
								event.Username = LibrarySystem.current;
								event.EventTime = d.toString();
								
								LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
								
								System.exit(0);
						}
				}
		}
		
		private void launchSpecialLogin(String Username)
		{
				if(LibrarySystem.FrameItems.loginFrameItems.username_txt.getText() == null || LibrarySystem.FrameItems.loginFrameItems.username_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Enter the Username", "No Username", JOptionPane.WARNING_MESSAGE);
						return ;
				}
				
				try
				{						
						if(LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Incorrect Username. The Username : " + Username + " does not exist.");
								return;
						}
						
						String Question = LibrarySystem.loginManager.getQuestion(Username, LibrarySystem.QuestionsFile);
						
						String Answer = JOptionPane.showInputDialog(LibrarySystem.FrameList.LoginFrame, Question, "Answer the Security Question", JOptionPane.OK_CANCEL_OPTION);
						
						if(Answer == null || Answer.length() == 0)
						{
								return;
						}
						
						if(LibrarySystem.loginManager.verifyAnswer(Username, Answer, LibrarySystem.AnswersFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Incorrect Answer", "Incorrect Answer", JOptionPane.WARNING_MESSAGE);
								return;
						}
						
						String password = LibrarySystem.loginManager.getPassword(Username, LibrarySystem.UserAccountsFile);
						
						LibrarySystem.FrameItems.loginFrameItems.password_password.setText(password);
						
						if(LibrarySystem.loginManager.isUsernameRemembered(Username, LibrarySystem.RememberFile) == true)
						{
								LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox.setSelected(true);
						}
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
		}
		
		private boolean checkInput()
		{
				if(LibrarySystem.FrameItems.loginFrameItems.username_txt.getText() == null || LibrarySystem.FrameItems.loginFrameItems.username_txt.getText().length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Enter the Username", "No Username", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				String password = new String(LibrarySystem.FrameItems.loginFrameItems.password_password.getPassword());
				
				if( password== null || password.length() == 0)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Enter the Password", "No Password", JOptionPane.WARNING_MESSAGE);
						return false;
				}
				
				return true;
		}
		
		private boolean checkLogin(String Username, String Password)
		{
				try
				{
						if(LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Authentication Failed. Username " + Username + " does not exist");
								return false;
						}
						
						if(LibrarySystem.loginManager.checkLogin(Username, Password, LibrarySystem.UserAccountsFile) == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Authentication Failed. Incorrect Password");
								return false;
						}
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return true;
		}
}
