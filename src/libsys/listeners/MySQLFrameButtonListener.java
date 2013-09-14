package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class MySQLFrameButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public MySQLFrameButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("OK"))
				{
						if(checkInput() == false)
						{
								return;
						}
						
						String Username = LibrarySystem.FrameItems.mysqlFrameItems.username_txt.getText();
						String password = new String(LibrarySystem.FrameItems.mysqlFrameItems.password_password.getPassword());
						
						File f = new File(LibrarySystem.MySQLFile);
						
						boolean create = false;
						
						if(f.exists() == false)
						{
								create  = true;
						}
						try
						{
								LibrarySystem.loginManager.mysqlAccount(Username, password, LibrarySystem.MySQLFile);
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
						}			
						
						if(testConnection() == true)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.MySQLFrame, "Database Account registered successfully");
						}
						else
						{
								return;
						}
						
						LibrarySystem.FrameList.MySQLFrame.setVisible(false);
						
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.MySQLFrame);
						
						LibrarySystem.systemResetter.resetMySQLFrame();					
				}
				
				if(ae.getActionCommand().equals("Cancel"))
				{
						LibrarySystem.FrameList.MySQLFrame.setVisible(false);
						
						LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.MySQLFrame);
				}
		}
		
		private boolean testConnection()
		{
				return LibrarySystem.DatabaseManager.testMySQLConnection();
		}
		
		private boolean checkInput()
		{
				if(LibrarySystem.FrameItems.mysqlFrameItems.username_txt.getText() == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.MySQLFrame, "Enter the MySQL Username");
						return false;
				}
				
				String password = new String(LibrarySystem.FrameItems.mysqlFrameItems.password_password.getPassword());
				
				if(password == null)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.MySQLFrame, "Enter the MySQL Password");
						return false;
				}
				
				return true;
		}
}
