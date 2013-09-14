package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import libsys.general.LIBSYSSystem;

public class LoginFrameTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public LoginFrameTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				String Username = LibrarySystem.FrameItems.loginFrameItems.username_txt.getText();
				
				if(Username == null || Username.length() == 0)
				{
						LibrarySystem.systemResetter.resetLoginFrame();
						
						return;
				}
				
				try
				{
						if(LibrarySystem.loginManager.isUsernameExists(Username, LibrarySystem.UserAccountsFile) == false)
						{
								return;
						}
						
						if(LibrarySystem.loginManager.isUsernameRemembered(Username, LibrarySystem.RememberFile) == false)
						{
								return;
						}
						
						else
						{
								String Password = LibrarySystem.loginManager.getPassword(Username, LibrarySystem.UserAccountsFile);
								
								LibrarySystem.FrameItems.loginFrameItems.password_password.setText(Password);
								LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox.setSelected(true);
								
								return;
						}
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
