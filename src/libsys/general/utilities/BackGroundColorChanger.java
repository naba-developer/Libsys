package libsys.general.utilities;

import java.awt.Color;
import libsys.general.LIBSYSSystem;

public class BackGroundColorChanger
{
		LIBSYSSystem LibrarySystem;
		
		public BackGroundColorChanger(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void setBackgroundColor(Color BackGroundColor)
		{
				setNavigationFrameBackground(BackGroundColor);
				setSettingsFrameBackground( BackGroundColor);
				setAccountsRegistrationFrameBackground(BackGroundColor);
				setAccountsManagerFrameBackground(BackGroundColor);
				setCalculatorFrameBackground( BackGroundColor);
				setPrintPreviewFrameBackGround(BackGroundColor);
				setAboutFrameBackground(BackGroundColor);
				refreshFrameList();
		}
		
		private void setAboutFrameBackground(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.aboutFrameItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void setPrintPreviewFrameBackGround(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.printPreviewFrameItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void setNavigationFrameBackground(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.navigationFrameItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void setSettingsFrameBackground(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.settingsFrameItems.main_panel.setBackground(BackGroundColor);
				LibrarySystem.FrameItems.changeColorPanelItems.background_panel.setBackground(BackGroundColor);
		}
		
		private void setAccountsRegistrationFrameBackground(Color BackGroundColor)
		{
				//LibrarySystem.FrameItems.accountRegistrationPanelItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void setAccountsManagerFrameBackground(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void setCalculatorFrameBackground(Color BackGroundColor)
		{
				LibrarySystem.FrameItems.calculatorFrameItems.main_panel.setBackground(BackGroundColor);
		}
		
		private void refreshFrameList()
		{
				LibrarySystem.FrameList.LoginFrame.repaint();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				LibrarySystem.FrameList.CalculatorFrame.repaint();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				LibrarySystem.FrameList.AboutLIBSYSFrame.repaint();
				LibrarySystem.FrameList.PrintPreviewFrame.repaint();
		}
}
