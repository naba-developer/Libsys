package libsys.general.utilities;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import libsys.general.LIBSYSSystem;

public class SystemLogManager
{
		LIBSYSSystem LibrarySystem;
		
		public SystemLogManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void addEventToLogFile(SystemLogEvent Event, String FileName)
		{
				try
				{
						String line = getEventLine(Event);
						FileOutputStream fout = new FileOutputStream(FileName, true);
				
						PrintWriter p = new PrintWriter(fout, true);
				
						p.println(line);
				
						fout.close();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}				
		}
		
		private String getEventLine(SystemLogEvent Event)
		{
				String line = "" + Event.EventID + "`" + Event.Username + "`" + Event.EventName + "`" + Event.EventTime;
				
				return line;
		}
}
