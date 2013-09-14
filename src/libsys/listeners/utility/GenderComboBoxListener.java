package libsys.listeners.utility;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import libsys.general.LIBSYSSystem;

public class GenderComboBoxListener implements KeyListener
{
		LIBSYSSystem LibrarySystem;
		
		public GenderComboBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void keyPressed(KeyEvent ke)
		{
				
		}
		
		public void keyReleased(KeyEvent ke)
		{
				
		}
		
		public void keyTyped(KeyEvent ke)
		{
				char key = ke.getKeyChar();
				
				JComboBox combo = (JComboBox)ke.getSource();
				
				if(key == 'M' || key == 'm')
				{
						combo.setSelectedItem("Male");
				}
				
				else if(key == 'F' || key == 'f')
				{
						combo.setSelectedItem("Female");
				}
		}
}
