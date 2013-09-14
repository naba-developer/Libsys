package libsys.listeners;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import libsys.general.LIBSYSSystem;

public class MyDocumentListener implements DocumentListener
{
		LIBSYSSystem LibrarySystem;
		
		public MyDocumentListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void insertUpdate(DocumentEvent de)
		{				
				if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						deleteBorrowers();
				}			
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getDocument())
				{
						deleteBorrowers();
				}				
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getDocument())
				{
						fineImpose();
				}
		}
		
		public void changedUpdate(DocumentEvent de)
		{				
				if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						deleteBorrowers();
				}			
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getDocument())
				{
						deleteBorrowers();
				}				
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getDocument())
				{
						fineImpose();
				}
		}
		
		public void removeUpdate(DocumentEvent de)
		{				
				if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getDocument())
				{
						insertBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getDocument())
				{
						insertBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getDocument())
				{
						updateSearchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getDocument())
				{
						deleteBorrowers();
				}			
				
				else if(de.getDocument() == LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getDocument())
				{
						deleteBorrowers();
				}				
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getDocument())
				{
						searchBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getDocument())
				{
						updateUpdateBooks();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				
				else if(de.getDocument() == LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getDocument())
				{
						updateUpdateBorrowers();
				}
				else if(de.getDocument() == LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getDocument())
				{
						fineImpose();
				}
		}
		
		private void fineImpose()
		{
				if(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText() == null || LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText().length() == 0)
				{
						LibrarySystem.itemDisabler.disableFineImposePanelItems();
				}
				else
				{
						LibrarySystem.itemEnabler.enableFineImposePanelItems();
				}
		}
		
		private void updateUpdateBorrowers()
		{
				if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText() != null && LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getText().length() > 0)
				{
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText() != null && LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getText().length() > 0)
						{
								LibrarySystem.itemEnabler.enableUpdateBorrowersUpdatePanel();
								return;
						}
						else
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
								return;
						}
				}
				else
				{
						LibrarySystem.itemDisabler.disableUpdateBorrowersUpdatePanel();
						return;
				}
		}
		
		private void updateUpdateBooks()
		{
				if(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText() != null && LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getText().length() > 0)
				{
						if(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText() != null && LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getText().length() > 0)
						{
								LibrarySystem.itemEnabler.enableUpdateBooksUpdatePanel();
								return;
						}						
						else
						{
								LibrarySystem.itemDisabler.disableUpdateBooksUpdatePanel();
								return;
						}
				}
				else
				{
						LibrarySystem.itemDisabler.disableUpdateBooksUpdatePanel();
						return;
				}
		}
		
		private void searchBorrowers()
		{
				if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
				{
						if(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableSearchBorrowersPanelItems();
								return;
						}
						else
						{
								LibrarySystem.itemEnabler.enableSearchBorrowersPanelItems();
								return;
						}
				}
				else
				{
						LibrarySystem.itemEnabler.enableSearchBorrowersPanelItems();
				}
		}
		
		private void deleteBorrowers()
		{
				if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getText().length() == 0)
				{
						if(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableDeleteBorrowersPanelItems();
								return;
						}
						else
						{
								LibrarySystem.itemEnabler.enableDeleteBorrowersPanelItems();
								return;
						}
				}
				else
				{
						LibrarySystem.itemEnabler.enableDeleteBorrowersPanelItems();
				}
				
		}
		
		private void updateSearchBorrowers()
		{
				if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getText().length() == 0)
				{
						if(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText() == null || LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getText().length() == 0)
						{
								LibrarySystem.itemDisabler.disableUpdateBorrowersSearchItems();
								
								return;
						}
						else
						{
								LibrarySystem.itemEnabler.enableUpdateBorrowersSearchItems();
								
								return;
						}
				}				
				else
				{
						LibrarySystem.itemEnabler.enableUpdateBorrowersSearchItems();
				}
		}
		
		private void insertBorrowers()
		{
				if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText() != null && LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getText().length() > 0)
				{
						if(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText() != null && LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getText().length() > 0)
						{
								LibrarySystem.itemEnabler.enableInsertBorrowerItems();
								
								return;
						}
						else
						{
								LibrarySystem.itemDisabler.disableInsertBorrowerItems();
								
								return;
						}
				}				
				else
				{
						LibrarySystem.itemDisabler.disableInsertBorrowerItems();
				}
		}
		
		private void insertBooks()
		{
				if(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText() != null && LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getText().length() > 0)
				{
						if(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText() != null && LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getText().length() > 0)
						{
								LibrarySystem.itemEnabler.enableInsertBookItems();
								
								return;
						}
						else
						{
								LibrarySystem.itemDisabler.disableInsertBookItems();
								
								return;
						}
				}				
				else
				{
						LibrarySystem.itemDisabler.disableInsertBookItems();
				}
		}
}
