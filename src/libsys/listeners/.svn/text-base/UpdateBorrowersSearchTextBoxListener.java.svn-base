package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class UpdateBorrowersSearchTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public UpdateBorrowersSearchTextBoxListener(LIBSYSSystem LibrarySystem)
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
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableUpdateBorrowersSearchItems();
										return;
								}	
								
								LibrarySystem.itemEnabler.enableUpdateBorrowersSearchItems();
								return;
						}
						
						else if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableUpdateBorrowersSearchItems();
										return;
								}
								
								LibrarySystem.itemEnabler.enableUpdateBorrowersSearchItems();
								
								return;
						}
						
						LibrarySystem.itemEnabler.enableUpdateBorrowersSearchItems();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
