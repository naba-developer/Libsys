package libsys.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;
import libsys.gui.MyFrame;

public class WindowExitListener extends WindowAdapter
{
		public LIBSYSSystem LibrarySystem;
		public MyFrame f;
		
		public WindowExitListener(LIBSYSSystem LibrarySystem, MyFrame f)
		{
				this.LibrarySystem = LibrarySystem;
				this.f = f;
		}
		
		public void windowClosed(WindowEvent we)
		{
				if(LibrarySystem.FrameItems.loginFrameItems.username_txt.isEditable() == false)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Cannot shutdown LibrarySystem without unlocking.");
						return;
				}
				
				int choice = JOptionPane.showConfirmDialog(f, "Are you sure you want to exit LibrarySystem?", "Confirm Exit", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(choice == JOptionPane.YES_OPTION)
				{
						SystemLogEvent event = new SystemLogEvent();
						Date d = new Date();
						
						event.EventID = 1;
						event.EventName = "LibrarySystem Exit.";
						event.Username = LibrarySystem.current;
						event.EventTime = d.toString();
						
						LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
						
						System.exit(0);
				}
		}
		
		public void windowClosing(WindowEvent we)
		{
				if(LibrarySystem.FrameItems.loginFrameItems.username_txt.isEditable() == false)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.LoginFrame, "Cannot shutdown LibrarySystem without unlocking.");
						return;
				}
				
				int choice = JOptionPane.showConfirmDialog(f, "Are you sure you want to exit LibrarySystem?", "Confirm Exit", JOptionPane.YES_NO_CANCEL_OPTION);
				
				if(choice == JOptionPane.YES_OPTION)
				{
						SystemLogEvent event = new SystemLogEvent();
						Date d = new Date();
						
						event.EventID = 1;
						event.EventName = "LibrarySystem exit.";
						event.Username = LibrarySystem.current;
						event.EventTime = d.toString();
						
						LibrarySystem.systemLogManager.addEventToLogFile(event, LibrarySystem.SystemLogFile);
						
						System.exit(0);
				}
		}
}
