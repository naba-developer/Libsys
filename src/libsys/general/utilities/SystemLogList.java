package libsys.general.utilities;

import java.util.ArrayList;
import libsys.general.LIBSYSSystem;

public class SystemLogList
{
		private LIBSYSSystem LibrarySystem;
		
		public ArrayList<SystemLogEvent>LogList;
		
		public SystemLogList(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				LogList = new ArrayList<SystemLogEvent>();
		}
}
