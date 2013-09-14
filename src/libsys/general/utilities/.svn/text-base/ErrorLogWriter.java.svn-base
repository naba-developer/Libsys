

package libsys.general.utilities;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import libsys.general.LIBSYSSystem;

public class ErrorLogWriter 
{
		LIBSYSSystem LibrarySystem;
	
		public ErrorLogWriter(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void addErrorLog(String errorlog, String filename)
		{
				try
				{
						System.out.println("Error");
						FileOutputStream fout=new FileOutputStream(filename,true);						
						PrintWriter printer = new PrintWriter(fout, true);
						
						Date d = new Date();
						
						printer.println();
						printer.println();
						
						String time = "Error occurred at : " + d.toString() + " during session by user : " + LibrarySystem.current;				
						
						printer.println(time);						
						
						printer.println(errorlog);
						printer.println();
				
						fout.close();
				}
				catch(Exception ex)
				{
						return;
				}			
		}
}
