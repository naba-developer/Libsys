package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import javax.swing.event.DocumentListener;
import libsys.general.LIBSYSSystem;

public class DeleteBorrowersSearchTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public DeleteBorrowersSearchTextBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		
		
		public void focusLost(FocusEvent fe)
		{
				JTextField t = (JTextField)fe.getSource();
				
				if(t.getText() == null)
				{
						return;
				}
				else
				{
						if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableDeleteBorrowersPanelItems();
										return;
								}	
								
								LibrarySystem.itemEnabler.enableDeleteBorrowersPanelItems();
								return;
						}
						
						else if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableDeleteBorrowersPanelItems();
										return;
								}
								
								LibrarySystem.itemEnabler.enableDeleteBorrowersPanelItems();
								
								return;
						}
						
						LibrarySystem.itemEnabler.enableDeleteBorrowersPanelItems();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
