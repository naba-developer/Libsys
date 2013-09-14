package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class SettingsFrameButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public SettingsFrameButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Clear My Password"))
				{
						LibrarySystem.loginManager.clearPassword(LibrarySystem.current, LibrarySystem.RememberFile);
						
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.SettingsFrame, "Password cleared!");
						
						return;
				}
		}
}
