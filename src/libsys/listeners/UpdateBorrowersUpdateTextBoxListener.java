package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class UpdateBorrowersUpdateTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public UpdateBorrowersUpdateTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void focusLost(FocusEvent fe)
		{
				JTextField t = (JTextField)fe.getSource();
				
				if(t == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt)
				{
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						LibrarySystem.itemEnabler.enableUpdateBorrowersUpdatePanel();
				}
				if(t == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt)
				{
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
						
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText().length() == 0)
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
