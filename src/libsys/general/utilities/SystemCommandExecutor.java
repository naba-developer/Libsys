package libsys.general.utilities;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class SystemCommandExecutor 
{
		LIBSYSSystem LibrarySystem;
		String username, password;
		
		public SystemCommandExecutor(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		private void getPassword(String filename)
		{
				String[] store=new String[2];
				username=store[1];
				password=store[2];
		}
		
		public boolean startDatabaseServer()
		{
				if(isMySQLServerRunning() == true)
				{
						return true;
				}
				
				String  s= "sc start mysql";
				String message = commandRunner(s);
				System.out.println(message);
				
				if(message == null)
				{
						return false;
				}
				
				if(message.indexOf("The specified service does not exist")!=-1)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"Install mysql server first");
						return false;
				}
				
				if(message.indexOf("Access is denied") != -1)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"Unable to start database server due to lack of access priveleges.Please consult the help file for manual start");
						return false;
				}
				
				return true;
		}
		
		public boolean isMySQLServerRunning()
		{
				String s = "sc query mysql";
				
				String message = commandRunner(s);
				
				message = message.toUpperCase();
				
				if(message.indexOf("RUNNING") != -1)
				{
						return true;
				}
				
				return false;
		}
		
		public boolean stopDatabaseServer()
		{
				String s="sc stop mysql";
				String message = commandRunner(s);	
				
				if(message == null)
				{
						return false;
				}
				
				if(message.indexOf("The specified service does not exist")!=-1)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"Install MySQL server first");
						return false;
				}
				
				if(message.indexOf("Access is denied") != -1)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame,"Unable to stop database server due to lack of access priveleges. Please consult the help file for manual shutdown");
						return false;
				}
				
				return true;
		}
				
		public void backupDatabase(String filename)
		{
				try
				{
						String [] account = LibrarySystem.loginManager.mysqlUser(LibrarySystem.MySQLFile);
						
						File f = new File(filename);
						
						String path = f.getAbsolutePath();
						
						path = "\"" + path + "\"";
						
						String s="mysqldump -u "+ account[0] + " -t  --password=" + account[1] + " libsys >" + path;
						
						commandRunner(s);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}		
		}
		
		public void loadBackup(String filename)
		{
				try
				{
						String [] account = LibrarySystem.loginManager.mysqlUser(LibrarySystem.MySQLFile);
						
						File f = new File(filename);
						
						String path = f.getAbsolutePath();
						
						path = "\"" + path + "\"";
						
						String s = "mysql -u "+ account[0] + " --password=" + account[1] + "  --force libsys <" + path;						
						
						commandRunner(s);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}	
				
		}
		
		public void createMySQLDatabase(String filename)
		{
				try
				{
						String [] account = LibrarySystem.loginManager.mysqlUser(LibrarySystem.MySQLFile);
						
						File f = new File(filename);
						
						String path = f.getAbsolutePath();
						
						path = "\"" + path + "\"";
						
						String s="mysql  -u "+ account[0] + " --password=" + account[1] + " < " + path + "";
				
						commandRunner(s);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
		}
		
		public void runHelpFile(String filename)
		{
				File f = new File(filename);
						
				String path = f.getAbsolutePath();
						
				path = "\"" + path + "\"";
						
				String s = "hh " + path;
				
				commandRunner(s);
		}
		
		private String commandRunner(String s)
		{
				try
				{
						ProcessBuilder pb = new ProcessBuilder("cmd", "/c", s);
						Process proc=pb.start();
						
						BufferedInputStream scan;
						byte [] b = new byte[10];
						
						if(s.indexOf("hh ") == -1)
						{
								scan =new BufferedInputStream(proc.getInputStream());
								
								b = new byte[1000];
						
								scan.read(b, 0, b.length-1);
						}
						
						return new String(b);
						
				}
				catch(Exception e)
				{
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return null;
		}
}
