package libsys.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import libsys.general.LIBSYSSystem;
import libsys.gui.MyFrame;

public class WindowHideListener extends WindowAdapter
{
		public LIBSYSSystem LibrarySystem;
		public MyFrame f;
		
		public WindowHideListener(LIBSYSSystem LibrarySystem, MyFrame f)
		{
				this.LibrarySystem = LibrarySystem;
				this.f = f;
		}
		
		public void windowClosed(WindowEvent we)
		{
				LibrarySystem.VisibleFrameList.remove(f);
				f.setVisible(false);
				
				resetFrame();
		}
		
		public void windowClosing(WindowEvent we)
		{
				LibrarySystem.VisibleFrameList.remove(f);
				f.setVisible(false);
				
				resetFrame();
		}
		
		private void resetFrame()
		{
				if(f == LibrarySystem.FrameList.AccountsManagerFrame)
				{
						LibrarySystem.systemResetter.resetAccountsManagerFrame();
				}
				
				else if(f == LibrarySystem.FrameList.SettingsFrame)
				{
						LibrarySystem.systemResetter.resetSettingsFrame();
				}
				
				else if(f == LibrarySystem.FrameList.CalculatorFrame)
				{
						LibrarySystem.systemResetter.resetCalculatorFrame();
				}
				
				else if(f == LibrarySystem.FrameList.PrintPreviewFrame)
				{
						LibrarySystem.systemResetter.resetPrintPreviewFrame();
				}
				
				else if(f == LibrarySystem.FrameList.AboutLIBSYSFrame)
				{
						
				}
		}
}