package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class InsertBooksTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public InsertBooksTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				JTextField t = (JTextField)fe.getSource();
				
				if(t == LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt)
				{
						if(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText() == null || LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBookItems();
								return;
						}
						
						if(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText() == null || LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBookItems();
								return;
						}
						
						LibrarySystem.itemEnabler.enableInsertBookItems();
				}
				
				if(t == LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt)
				{
						if(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText() == null || LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBookItems();
								return;
						}
						
						if(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText() == null || LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBookItems();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "All fields marked with (*) are compulsory. Please fill in all the mandatory details to proceed.");
								return;
						}
						
						LibrarySystem.itemEnabler.enableInsertBookItems();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
