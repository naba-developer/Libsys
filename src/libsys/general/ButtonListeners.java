package libsys.general;

import libsys.general.LIBSYSSystem;
import libsys.listeners.AddUserAccountButtonListener;
import libsys.listeners.AllBooksDisplayButtonListener;
import libsys.listeners.AllBorrowersDisplayButtonListener;
import libsys.listeners.AllFinesButtonListener;
import libsys.listeners.AllTransactionsDisplayButtonListener;
import libsys.listeners.BorrowerRecordSearchButtonListener;
import libsys.listeners.CalculatorButtonListener;
import libsys.listeners.DeleteAccountsButtonListener;
import libsys.listeners.DeleteBooksDeleteSelectedtButtonListener;
import libsys.listeners.DeleteBooksSearchButtonListener;
import libsys.listeners.DeleteBorrowersDeleteSelectedtButtonListener;
import libsys.listeners.DeleteBorrowersSearchButtonListener;
import libsys.listeners.EditAccountButtonListener;
import libsys.listeners.FineImposeImposeButtonListener;
import libsys.listeners.FinePaymentButtonListener;
import libsys.listeners.InsertBooksSubmitButtonListener;
import libsys.listeners.InsertBorrowerSubmitButtonListener;
import libsys.listeners.LoginFrameButtonListener;
import libsys.listeners.MySQLFrameButtonListener;
import libsys.listeners.NewBorrowingsTransmitButtonListener;
import libsys.listeners.PrintPreviewButtonListener;
import libsys.listeners.QueryBrowserButtonListener;
import libsys.listeners.ReturnsPanelTransmitButtonListener;
import libsys.listeners.SearchBooksSearchButtonListener;
import libsys.listeners.SearchBorrowersSearchButtonListener;
import libsys.listeners.SettingsFontsAndColorsChangePanelButtonListener;
import libsys.listeners.SettingsFrameButtonListener;
import libsys.listeners.TransactionsPanelButtonListener;
import libsys.listeners.UpdateBooksSearchButtonListener;
import libsys.listeners.UpdateBooksSubmitButtonListener;
import libsys.listeners.UpdateBorrowersSearchButtonListener;
import libsys.listeners.UpdateBorrowersSubmitButtonListener;
import libsys.listeners.utility.BrowseButtonListener;

public class ButtonListeners
{
		LIBSYSSystem LibrarySystem;
		
		public LoginFrameButtonListener loginFrameButtonListener;
		
		public CalculatorButtonListener calculatorButtonListener;
		public SettingsFontsAndColorsChangePanelButtonListener settingsFontsAndColorsChangePanelButtonListener;
		
		public NewBorrowingsTransmitButtonListener newBorrowingsTransmitButtonListener;
		public ReturnsPanelTransmitButtonListener returnsPanelTransmitButtonListener;
		
		public InsertBooksSubmitButtonListener insertBooksSubmitButtonListener;
		public InsertBorrowerSubmitButtonListener insertBorrowerSubmitButtonListener;
		
		public UpdateBooksSearchButtonListener updateBooksSearchButtonListener;
		public UpdateBooksSubmitButtonListener updateBooksSubmitButtonListener;
		
		public UpdateBorrowersSearchButtonListener updateBorrowersSearchButtonListener;
		public UpdateBorrowersSubmitButtonListener updateBorrowersSubmitButtonListener;
		
		public DeleteBooksSearchButtonListener deleteBooksSearchButtonListener;
		public DeleteBooksDeleteSelectedtButtonListener deleteBooksDeleteSelectedButtonListener;
		
		public DeleteBorrowersSearchButtonListener deleteBorrowersSearchButtonListener;
		public DeleteBorrowersDeleteSelectedtButtonListener deleteBorrowersDeleteSelectedButtonListener;
		
		public SearchBooksSearchButtonListener searchBooksSearchButtonListener;
		public SearchBorrowersSearchButtonListener searchBorrowersSearchButtonListener;
		
		public FineImposeImposeButtonListener fineImposeImposeButtonListener;
		
		public AllTransactionsDisplayButtonListener allTransactionsDisplayButtonListener;
		public AllBooksDisplayButtonListener allBooksDisplayButtonListener;
		public AllBorrowersDisplayButtonListener allBorrowersDisplayButtonListeners;
		public BorrowerRecordSearchButtonListener borrowerRecordSearchButtonListener;
		public AllFinesButtonListener allFinesButtonListener;
		
		public QueryBrowserButtonListener queryBrowserButtonListener;
		
		public AddUserAccountButtonListener addUserAccountButtonListener;
		
		public BrowseButtonListener browseButtonListener;
		
		public FinePaymentButtonListener finePaymentButtonListener;
		
		public EditAccountButtonListener editAccountButtonListeners;
		public DeleteAccountsButtonListener deleteAccountButtonListener;
		
		public MySQLFrameButtonListener mysqlFrameButtonListener;
		
		public TransactionsPanelButtonListener transactionsPanelButtonListener;
		
		public PrintPreviewButtonListener printPreviewButtonListeners;
		
		public SettingsFrameButtonListener settingsFrameButtonListener;
			
		public ButtonListeners(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				
				calculatorButtonListener = new CalculatorButtonListener(LibrarySystem);
				settingsFontsAndColorsChangePanelButtonListener = new SettingsFontsAndColorsChangePanelButtonListener(LibrarySystem);
				loginFrameButtonListener = new LoginFrameButtonListener(LibrarySystem);
				
				newBorrowingsTransmitButtonListener = new NewBorrowingsTransmitButtonListener(LibrarySystem);
				returnsPanelTransmitButtonListener = new ReturnsPanelTransmitButtonListener(LibrarySystem);
				
				insertBooksSubmitButtonListener = new InsertBooksSubmitButtonListener(LibrarySystem);
				insertBorrowerSubmitButtonListener = new InsertBorrowerSubmitButtonListener(LibrarySystem);
				
				updateBooksSearchButtonListener = new UpdateBooksSearchButtonListener(LibrarySystem);
				updateBooksSubmitButtonListener = new UpdateBooksSubmitButtonListener(LibrarySystem);
				
				updateBorrowersSearchButtonListener = new UpdateBorrowersSearchButtonListener(LibrarySystem);
				updateBorrowersSubmitButtonListener = new UpdateBorrowersSubmitButtonListener(LibrarySystem);
				
				deleteBooksSearchButtonListener = new DeleteBooksSearchButtonListener(LibrarySystem);
				deleteBooksDeleteSelectedButtonListener = new DeleteBooksDeleteSelectedtButtonListener(LibrarySystem);
				
				deleteBorrowersSearchButtonListener = new DeleteBorrowersSearchButtonListener(LibrarySystem);
				deleteBorrowersDeleteSelectedButtonListener = new DeleteBorrowersDeleteSelectedtButtonListener(LibrarySystem);
				
				searchBooksSearchButtonListener = new SearchBooksSearchButtonListener(LibrarySystem);
				searchBorrowersSearchButtonListener = new SearchBorrowersSearchButtonListener(LibrarySystem);
				
				fineImposeImposeButtonListener = new FineImposeImposeButtonListener(LibrarySystem);				
				
				allTransactionsDisplayButtonListener = new AllTransactionsDisplayButtonListener(LibrarySystem);
				allBooksDisplayButtonListener = new AllBooksDisplayButtonListener(LibrarySystem);
				allBorrowersDisplayButtonListeners = new AllBorrowersDisplayButtonListener(LibrarySystem);
				borrowerRecordSearchButtonListener = new BorrowerRecordSearchButtonListener(LibrarySystem);
				allFinesButtonListener = new AllFinesButtonListener(LibrarySystem);
				
				queryBrowserButtonListener = new QueryBrowserButtonListener(LibrarySystem);
				
				addUserAccountButtonListener = new AddUserAccountButtonListener(LibrarySystem);
				
				browseButtonListener = new BrowseButtonListener(LibrarySystem);
				
				finePaymentButtonListener = new FinePaymentButtonListener(LibrarySystem);
				
				editAccountButtonListeners = new EditAccountButtonListener(LibrarySystem);
				deleteAccountButtonListener = new DeleteAccountsButtonListener(LibrarySystem);
				
				mysqlFrameButtonListener = new MySQLFrameButtonListener(LibrarySystem);
				
				transactionsPanelButtonListener = new TransactionsPanelButtonListener(LibrarySystem);
				
				printPreviewButtonListeners = new PrintPreviewButtonListener(LibrarySystem);
				
				settingsFrameButtonListener = new SettingsFrameButtonListener(LibrarySystem);
		}	
}

