package libsys.general;

import libsys.general.LIBSYSSystem;
import libsys.listeners.NavigationTreeListener;
import libsys.listeners.SettingsTreeListener;

public class TreeListeners
{
		LIBSYSSystem LibrarySystem;
		
		NavigationTreeListener navigationTreeListener;
		SettingsTreeListener settingsTreeListener;
		
		public TreeListeners(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				
				navigationTreeListener = new NavigationTreeListener(LibrarySystem);
				settingsTreeListener = new SettingsTreeListener(LibrarySystem);
		}		
}