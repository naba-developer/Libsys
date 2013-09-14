package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class UpdateBooksUpdateTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public UpdateBooksUpdateTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				JTextField t = (JTextField)fe.getSource();
				
				if(t == LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt)
				{
						if(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						if(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText() == null || LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						LibrarySystem.itemEnabler.enableUpdateBorrowersUpdatePanel();
				}
				
				if(t == LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt)
				{
						if(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText() == null || LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						if(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "All fields marked with (*) are compulsory. Please fill in all the mandatory details to proceed.");
								return;
						}
						
						LibrarySystem.itemEnabler.enableUpdateBorrowersUpdatePanel();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
