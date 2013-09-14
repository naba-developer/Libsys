package libsys.general.utilities;

import libsys.general.LIBSYSSystem;

public class ItemEnabler
{
		LIBSYSSystem LibrarySystem;
		
		public ItemEnabler(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void enableLIBSYSItems()
		{
				enableNavigationFrameItems();		
				enableAccountsManagerFrameItems();
		}
		
		public void enableAccountsManagerFrameItems()
		{
				enableAddAccountsPanelItems();
				enableEditAccountsPanelItems();
				enableDeleteAccountsPanelItems();
		}
		
		public void enableAddAccountsPanelItems()
		{
				LibrarySystem.FrameItems.addAccountPanelItems.addaccount_btn.setEnabled(true);
				
		}
		
		public void enableEditAccountsPanelItems()
		{
				LibrarySystem.FrameItems.editAccountPanelItems.submit_btn.setEnabled(true);
				LibrarySystem.FrameItems.editAccountPanelItems.forgotpassword_btn.setEnabled(true);
		}
		
		public void enableDeleteAccountsPanelItems()
		{
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.deleteselectedaccounts_btn.setEnabled(true);
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.forgotpassword_btn.setEnabled(true);
		}
		
		public void enableNavigationFrameItems()
		{
				enableBorrowingsPanelItems();
				enableReturnsPanelItems();
				enableInsertBookItems();
				enableInsertBorrowerItems();
				enableUpdateBooksPanelItems();
				enableUpdateBorrowersPanelItems();
				enableDeleteBooksPanelItems();
				enableDeleteBorrowersPanelItems();
				enableSearchBooksPanelItems();
				enableSearchBorrowersPanelItems();
				enableFineImposePanelItems();
				enableFinePaymentPanelItems();
				enableAllTransactionsPanelItems();
				enableAllBooksPanelItems();
				enableAllBorrowersPanelItems();
				enableBorrowerRecordsPanelItems();
				enableAllFinesPanelItems();
				enableSystemLogPanelItems();
				enableQueryBrowserPanelItems();
		}
		
		public void enableQueryBrowserPanelItems()
		{
				LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_btn.setEnabled(true);
		}
		
		public void enableSystemLogPanelItems()
		{
				LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
				LibrarySystem.FrameItems.systemLogPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableAllBooksPanelItems()
		{
				LibrarySystem.FrameItems.allBooksPanelItems.display_btn.setEnabled(true);
				LibrarySystem.FrameItems.allBooksPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableAllBorrowersPanelItems()
		{
				LibrarySystem.FrameItems.allBorrowersPanelItems.display_btn.setEnabled(true);
				LibrarySystem.FrameItems.allBorrowersPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableBorrowerRecordsPanelItems()
		{
				//LibrarySystem.FrameItems.borrowerRecordsPanelItems.print_btn.setEnabled(true);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.search_btn.setEnabled(true);
		}
		
		public void enableAllFinesPanelItems()
		{
				LibrarySystem.FrameItems.allFinesPanelItems.displayfines_btn.setEnabled(true);
				LibrarySystem.FrameItems.allFinesPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableAllTransactionsPanelItems()
		{
				LibrarySystem.FrameItems.transactionPanelItems.deleteselected_btn.setEnabled(true);
				LibrarySystem.FrameItems.transactionPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableFinePaymentPanelItems()
		{
				LibrarySystem.FrameItems.finesPaymentPanelItems.finedetailsprint_btn.setEnabled(true);
				//LibrarySystem.FrameItems.finesPaymentPanelItems.print_btn.setEnabled(true);
				LibrarySystem.FrameItems.finesPaymentPanelItems.payfine_btn.setEnabled(true);
		}
		
		public void enableFineImposePanelItems()
		{
				LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn.setEnabled(true);
				//LibrarySystem.FrameItems.finesImposePanelItems.print_btn.setEnabled(true);
		}
		
		public void enableSearchBorrowersPanelItems()
		{
				LibrarySystem.FrameItems.searchBorrowerPanelItems.search_btn.setEnabled(true);
		}
		
		public void enableSearchBooksPanelItems()
		{
				LibrarySystem.FrameItems.searchBooksPanelItems.search_btn.setEnabled(true);
		}
		
		public void enableDeleteBorrowersPanelItems()
		{
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.search_btn.setEnabled(true);
		}
		
		public void enableDeleteBooksPanelItems()
		{
				LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn.setEnabled(true);
		}
		
		public void enableUpdateBorrowersPanelItems()
		{
				enableUpdateBorrowersSearchItems();
				enableUpdateBorrowersUpdatePanel();
		}
		
		public void enableUpdateBorrowersUpdatePanel()
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.submit_btn.setEnabled(true);
				//LibrarySystem.FrameItems.updateBorrowerPanelItems.printupdate_btn.setEnabled(true);
		}
		
		public void enableUpdateBorrowersSearchItems()
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.search_btn.setEnabled(true);
				//LibrarySystem.FrameItems.updateBorrowerPanelItems.printsearchresults_btn.setEnabled(true);
		}
		
		public void enableUpdateBooksPanelItems()
		{
				enableUpdateBooksSearchItems();
				enableUpdateBooksUpdatePanel();
		}
		
		public void enableUpdateBooksUpdatePanel()
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.submit_btn.setEnabled(true);
		}
		
		public void enableUpdateBooksSearchItems()
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.search_btn.setEnabled(true);
				//LibrarySystem.FrameItems.updateBooksPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableInsertBorrowerItems()
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.addborrower_btn.setEnabled(true);
				//LibrarySystem.FrameItems.insertBorrowersPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableInsertBookItems()
		{
				LibrarySystem.FrameItems.insertBooksPanelItems.submit_btn.setEnabled(true);
				//LibrarySystem.FrameItems.insertBooksPanelItems.print_btn.setEnabled(true);
		}
		
		public void enableReturnsPanelItems()
		{
				LibrarySystem.FrameItems.returnPanelItems.returnstransmit_btn.setEnabled(true);
				//LibrarySystem.FrameItems.returnPanelItems.returnprint_btn.setEnabled(true);
		}
		
		public void enableBorrowingsPanelItems()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn.setEnabled(true);
				//LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.setEnabled(true);
		}
}
