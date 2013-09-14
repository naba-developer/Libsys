package libsys.general;

import libsys.general.LIBSYSSystem;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;

public class PanelDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public NavigationPanelsDesigner navigationPanelsDesigner;
		public SettingsPanelsDesigner settingsPanelsDesigner;
		public AccountsManagerPanelDesigner accountsManagerPanelDesigner;
		public TransactionsPanelDesigner transactionPanelDesigner;
		public AccountRegistrationPanelDesigner accountRegistrationPanelDesigner;
		
		public PanelDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				
				navigationPanelsDesigner = new NavigationPanelsDesigner(LibrarySystem);
				settingsPanelsDesigner = new SettingsPanelsDesigner(LibrarySystem);
				accountsManagerPanelDesigner = new AccountsManagerPanelDesigner(LibrarySystem);
				transactionPanelDesigner = new TransactionsPanelDesigner(LibrarySystem);
				accountRegistrationPanelDesigner = new AccountRegistrationPanelDesigner(LibrarySystem);
		}	
}