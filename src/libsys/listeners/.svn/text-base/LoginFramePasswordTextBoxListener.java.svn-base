package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.event.DocumentListener;
import libsys.general.*;

public class LoginFramePasswordTextBoxListener implements KeyListener
{
		LIBSYSSystem LibrarySystem;
		
		public LoginFramePasswordTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void keyReleased(KeyEvent ke)
		{
				
		}
		
		public void keyPressed(KeyEvent ke)
		{
				if(ke.getKeyCode()==KeyEvent.VK_ENTER)
				{
						LibrarySystem.listeners.buttonListeners.loginFrameButtonListener.actionPerformed(new ActionEvent(LibrarySystem.FrameItems.loginFrameItems.login_btn, 1, "Login"));
				}
		}
		
		public void keyTyped(KeyEvent ke)
		{
				
		}
}
