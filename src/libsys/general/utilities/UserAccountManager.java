package libsys.general.utilities;

import libsys.general.LIBSYSSystem;

public class UserAccountManager
{
		LIBSYSSystem LibrarySystem;
		
		public UserAccountManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void setCurrentUser(String username)
		{
				LibrarySystem.current = username;
		}
		
		public String getCurrentUser()
		{
				return LibrarySystem.current;
		}
}
