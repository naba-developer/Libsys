package libsys.general.utilities;


import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MySQLManager
{
		private String JDBC_DRIVER = "com.mysql.jdbc.Driver";        
		private String DATABASE_URL = "jdbc:mysql://localhost/libsys";
		private Statement statement;
		private Connection con = null;
		
		private ResultSet resultSet;
		
		LIBSYSSystem LibrarySystem;
		
		public MySQLManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public boolean testMySQLConnection()
		{
				try
				{
						String [] account = LibrarySystem.loginManager.mysqlUser(LibrarySystem.MySQLFile);
						
						LibrarySystem.CommandExecutor.startDatabaseServer();
						
						Thread.currentThread().sleep(1000);
						
						LibrarySystem.CommandExecutor.createMySQLDatabase(LibrarySystem.LIBSYSDatabaseScriptFile);
						
						Class.forName( JDBC_DRIVER );
						
						con = DriverManager.getConnection( "jdbc:mysql://localhost/information_schema", account[0], account[1]);
						
						System.gc();
				}
				catch(Exception e)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Please start the MySQL Server first.");
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
						return false;
				}				
				
				return true;
		}
		
		private Connection getConnection()
		{
				File f = new File(LibrarySystem.MySQLFile);
				
				if(f.exists() == false)
				{
						LibrarySystem.FrameList.MySQLFrame.setVisible(true);
						
						if(LibrarySystem.VisibleFrameList.contains(LibrarySystem.FrameList.MySQLFrame) == false)
						{
								LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.MySQLFrame);
						}
						
						return null;						
				}			
				
				try
				{						
						String [] account = LibrarySystem.loginManager.mysqlUser(LibrarySystem.MySQLFile);
						
						Class.forName( JDBC_DRIVER );
						
						con = DriverManager.getConnection( DATABASE_URL, account[0], account[1]);
						
						System.gc();
				}
				catch(Exception e)
				{
						if(e.toString().indexOf("Unknown database 'libsys'") != -1)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Please register your MySQL user account first.");
								
								LibrarySystem.FrameList.MySQLFrame.setVisible(true);
						
								if(LibrarySystem.VisibleFrameList.contains(LibrarySystem.FrameList.MySQLFrame) == false)
								{
										LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.MySQLFrame);
								}
						}
						else
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Please start the MySQL Server first.");
						}
						
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
						return null;
				}				
				
				return con;
		}
		
		public  ResultSet executeSelectQuery(String query)
		{
				try
				{
						con = getConnection();
						
						if(con == null)
						{
								System.out.println("Not found exception");
								return null;
						}
						
						statement = con.createStatement();
						
						resultSet = statement.executeQuery(query);
				}
				catch(Exception e)
				{
					
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Error in syntax of select query");
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
						return null;
				}
				
				return resultSet;
		}
		public  int executeImageInsertQuery(FileInputStream fimage,String accountnumber)
		{
				int result = -1;
				
				try
				{
						con = getConnection();
						
						PreparedStatement prepst=con.prepareStatement("INSERT INTO Images values(?,?)");
						
						prepst.setString(1,accountnumber);
						prepst.setBinaryStream(2,fimage,fimage.available());
						
						result = prepst.executeUpdate();
				}
				
				catch(Exception e)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Error in reading image file");
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
						return -1;
				}
				
				return result;
		}
		
		public int executeOtherQuery(String query)
		{
				int val = 1;
				
				try
				{
						con = getConnection();
						
						if(con == null)
						{
								return -2;
						}
				
						statement=con.createStatement();						
								 
						val = statement.executeUpdate(query);
				}
				catch(Exception e)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Error in syntax of update query");
						LibrarySystem.errorLogWriter.addErrorLog(e.toString(), LibrarySystem.ErrorLogFile);
						
						return -1;
				}
				
				return val;				
		}
		
		public void closeConnection()
		{
				/*try
				{
						con.close();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}*/
		}
}
