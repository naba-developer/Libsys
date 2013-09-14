package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class InsertBorrowersTextBoxListener  implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public InsertBorrowersTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;				
		}
		
		public void focusLost(FocusEvent fe)
		{
				JTextField t = (JTextField)fe.getSource();
				
				if(t == LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt)
				{
						if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								return;
						}
						
						if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								return;
						}
						
						LibrarySystem.itemEnabler.enableInsertBorrowerItems();
				}
				if(t == LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt)
				{
						if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								return;
						}
						
						if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "All fields marked with (*) are compulsory. Please fill in all the mandatory details to proceed.");
								return;
						}
						
						LibrarySystem.itemEnabler.enableInsertBorrowerItems();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
