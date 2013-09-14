package libsys.general;

import libsys.gui.MyFrame;

public class AllFrameList
{
		public MyFrame LoginFrame;
		public MyFrame NavigationFrame;
		public MyFrame CalculatorFrame;
		public MyFrame SettingsFrame;
		public MyFrame AccountsManagerFrame;
		public MyFrame AccountRegistrationFrame;
		public MyFrame MySQLFrame;
		public MyFrame PrintPreviewFrame;
		public MyFrame AboutLIBSYSFrame;
		
		public AllFrameList()
		{
				LoginFrame = new MyFrame("Login");
				NavigationFrame = new MyFrame("1.0");
				CalculatorFrame = new MyFrame("Calculator");
				SettingsFrame = new MyFrame("Settings");
				AccountsManagerFrame = new MyFrame("User Accounts Manager");
				AccountRegistrationFrame = new MyFrame("Register Administrator Account");
				MySQLFrame = new MyFrame("MySQL Account Details");
				PrintPreviewFrame = new MyFrame("Print Preview");
				AboutLIBSYSFrame = new MyFrame("About LibrarySystem");
		}
		
		public void hideAllFrames()
		{
				LoginFrame.setVisible(false);
				NavigationFrame.setVisible(false);
				CalculatorFrame.setVisible(false);
				SettingsFrame.setVisible(false);
				AccountsManagerFrame.setVisible(false);
				AccountRegistrationFrame.setVisible(false);
				MySQLFrame.setVisible(false);
				PrintPreviewFrame.setVisible(false);
				AboutLIBSYSFrame.setVisible(false);
		}
}