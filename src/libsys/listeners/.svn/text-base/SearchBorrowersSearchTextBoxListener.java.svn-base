package libsys.listeners;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class SearchBorrowersSearchTextBoxListener implements FocusListener
{
		LIBSYSSystem LibrarySystem;
		
		public SearchBorrowersSearchTextBoxListener(LIBSYSSystem LibrarySystem)
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
						if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableSearchBorrowersPanelItems();
										return;
								}	
								
								LibrarySystem.itemEnabler.enableSearchBorrowersPanelItems();
								return;
						}
						
						else if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText().length() == 0)
						{
								if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
								{
										LibrarySystem.itemDisabler.disableSearchBorrowersPanelItems();
										return;
								}
								
								LibrarySystem.itemEnabler.enableSearchBorrowersPanelItems();
								
								return;
						}
						
						LibrarySystem.itemEnabler.enableSearchBorrowersPanelItems();
						
						return;
				}
		}
		
		public void focusGained(FocusEvent fe)
		{
				
		}
}
