package libsys.general;

import java.util.ArrayList;
import javax.swing.JCheckBox;
import libsys.listeners.utility.SelectAllCheckBoxListener;

public class ListenerAdder
{
		LIBSYSSystem LibrarySystem;
		
		public ListenerAdder(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void addListeners()
		{
				addTreeListeners();
				addButtonListeners();
				addKeyBoardListeners();
				addMainMenuBarListeners();
				addTextBoxListeners();
				addWindowListeners();
				addComponentListeners();
				addRadioButtonListeners();
				addSelectAllCheckBoxListeners();
				addItemStateListeners();
		}
		
		private void addItemStateListeners()
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox.addKeyListener(LibrarySystem.listeners.itemStateListener.genderComboBoxListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.addKeyListener(LibrarySystem.listeners.itemStateListener.genderComboBoxListener);
				
				LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.specificDatePanelItemListener);
				LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.specificDatePanelItemListener);
				LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.addChangeListener(LibrarySystem.listeners.itemStateListener.specificDatePanelItemListener);
				
				LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner.addChangeListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				
				LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox.addItemListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner.addChangeListener(LibrarySystem.listeners.itemStateListener.customDateRangePanelItemsListener);
				
				LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);				
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox.addItemListener(LibrarySystem.listeners.itemStateListener.systemLogCheckBoxListener);
		}
		
		private void addKeyBoardListeners()
		{
				LibrarySystem.FrameItems.calculatorFrameItems.result_txt.addKeyListener(LibrarySystem.listeners.keyBoardListeners.calculatorKeyBoardListener);
		}
		
		private void addSelectAllCheckBoxListeners()
		{
				ArrayList <JCheckBox> CheckBoxList = new ArrayList<JCheckBox>();
				
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox);
				
				LibrarySystem.listeners.selectAllCheckBoxListener = new SelectAllCheckBoxListener(LibrarySystem, CheckBoxList);
				
				LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox.addItemListener(LibrarySystem.listeners.selectAllCheckBoxListener);
				
				CheckBoxList = null;
				
				CheckBoxList = new ArrayList<JCheckBox>();
				
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.saveloginlogoffinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savelockopeninformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataentryinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataupdateinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatadeleteinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatasearchinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatabasequeryinformation_checkbox);
				CheckBoxList.add(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savesystemlogclearanceinformation_checkbox);
				
				LibrarySystem.listeners.selectAllCheckBoxListener = new SelectAllCheckBoxListener(LibrarySystem, CheckBoxList);
				
				LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.selectall_checkbox.addItemListener(LibrarySystem.listeners.selectAllCheckBoxListener);
		}
		
		private void addRadioButtonListeners()
		{
				LibrarySystem.FrameItems.transactionPanelItems.specificdate_radiobutton.addActionListener(LibrarySystem.listeners.transactionPanelRadioButtonGroupListener);
				LibrarySystem.FrameItems.transactionPanelItems.specificmonth_radiobutton.addActionListener(LibrarySystem.listeners.transactionPanelRadioButtonGroupListener);
				LibrarySystem.FrameItems.transactionPanelItems.specificyear_radiobutton.addActionListener(LibrarySystem.listeners.transactionPanelRadioButtonGroupListener);
				LibrarySystem.FrameItems.transactionPanelItems.customdaterange_radiobutton.addActionListener(LibrarySystem.listeners.transactionPanelRadioButtonGroupListener);
				LibrarySystem.FrameItems.transactionPanelItems.currenttransactions_radiobutton.addActionListener(LibrarySystem.listeners.transactionPanelRadioButtonGroupListener);
		}
		
		private void addComponentListeners()
		{
				LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox.addItemListener(LibrarySystem.listeners.FontItemsListener);
				LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.addItemListener(LibrarySystem.listeners.FontItemsListener);
				
				LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_spinner.addChangeListener(LibrarySystem.listeners.FontSpinnerListener);
				
				LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox.addItemListener(LibrarySystem.listeners.imposeFineCheckBoxListener);
		}
		
		private void addWindowListeners()
		{
				LibrarySystem.FrameList.CalculatorFrame.addWindowListener(LibrarySystem.listeners.CalculatorWindowHideListener);
				LibrarySystem.FrameList.SettingsFrame.addWindowListener(LibrarySystem.listeners.SettingsWindowHideListener);
				LibrarySystem.FrameList.AccountsManagerFrame.addWindowListener(LibrarySystem.listeners.AccountsWindowListener);
				LibrarySystem.FrameList.MySQLFrame.addWindowListener(LibrarySystem.listeners.MySQLWindowHideListener);
				LibrarySystem.FrameList.PrintPreviewFrame.addWindowListener(LibrarySystem.listeners.PreviewFrameWindowHideListener);
				LibrarySystem.FrameList.AboutLIBSYSFrame.addWindowListener(LibrarySystem.listeners.AboutFrameWindowHideListener);
				
				LibrarySystem.FrameList.LoginFrame.addWindowListener(LibrarySystem.listeners.LoginWindowExitListener);
				LibrarySystem.FrameList.NavigationFrame.addWindowListener(LibrarySystem.listeners.NavigationWindowExitListener);
				LibrarySystem.FrameList.AccountRegistrationFrame.addWindowListener(LibrarySystem.listeners.AccountRegistrationWindowExitListener);
		}
		
		private void addButtonListeners()
		{
				addBrowseButtonListeners();
				addCalculatorButtonListeners();
				addSettingsButtonListeners();
				addLoginButtonListeners();
				addAccountsManagerButtonListeners();
				addViewSystemLogButtonListeners();
				addCalendarButtonListeners();
				addNavigationPanelsButtonListeners();
				addMouseListeners();
				addAccountsManagerFrameListeners();
				addMySQLFrameListeners();
				addPrintPreviewButtonListeners();
		}
		
		private void addPrintPreviewButtonListeners()
		{
				LibrarySystem.FrameItems.printPreviewFrameItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.printPreviewButtonListeners);
		}
		
		private void addMySQLFrameListeners()
		{
				LibrarySystem.FrameItems.mysqlFrameItems.ok_btn.addActionListener(LibrarySystem.listeners.buttonListeners.mysqlFrameButtonListener);
				LibrarySystem.FrameItems.mysqlFrameItems.cancel_btn.addActionListener(LibrarySystem.listeners.buttonListeners.mysqlFrameButtonListener);
		}
		
		private void addAccountsManagerFrameListeners()
		{
				LibrarySystem.FrameItems.addAccountPanelItems.addaccount_btn.addActionListener(LibrarySystem.listeners.buttonListeners.addUserAccountButtonListener);
				LibrarySystem.FrameItems.addAccountPanelItems.cancel_btn.addActionListener(LibrarySystem.listeners.buttonListeners.addUserAccountButtonListener);
		}
		
		private void addMouseListeners()
		{
				//LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable.addMouseListener(LibrarySystem.listeners.myMouseListener);
		}
		
		private void addBrowseButtonListeners()
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.browse_btn.addActionListener(LibrarySystem.listeners.buttonListeners.browseButtonListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.browse_btn.addActionListener(LibrarySystem.listeners.buttonListeners.browseButtonListener);
		}
		
		private void addNavigationPanelsButtonListeners()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.newBorrowingsTransmitButtonListener);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.addActionListener(LibrarySystem.listeners.buttonListeners.newBorrowingsTransmitButtonListener);
				
				LibrarySystem.FrameItems.returnPanelItems.returnstransmit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.returnsPanelTransmitButtonListener);
				LibrarySystem.FrameItems.returnPanelItems.returnprint_btn.addActionListener(LibrarySystem.listeners.buttonListeners.returnsPanelTransmitButtonListener);
				
				LibrarySystem.FrameItems.insertBooksPanelItems.submit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.insertBooksSubmitButtonListener);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.addborrower_btn.addActionListener(LibrarySystem.listeners.buttonListeners.insertBorrowerSubmitButtonListener);
				
				LibrarySystem.FrameItems.updateBooksPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.updateBooksSearchButtonListener);
				LibrarySystem.FrameItems.updateBooksPanelItems.submit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.updateBooksSubmitButtonListener);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.updateBorrowersSearchButtonListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.submit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.updateBorrowersSubmitButtonListener);
				
				LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteBooksSearchButtonListener);
				LibrarySystem.FrameItems.deleteBooksPanelItems.deleteselected_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteBooksDeleteSelectedButtonListener);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteBorrowersSearchButtonListener);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteBorrowersDeleteSelectedButtonListener);
				
				LibrarySystem.FrameItems.searchBooksPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.searchBooksSearchButtonListener);
				LibrarySystem.FrameItems.searchBooksPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.searchBooksSearchButtonListener);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.searchBorrowersSearchButtonListener);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.searchBorrowersSearchButtonListener);
				
				LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn.addActionListener(LibrarySystem.listeners.buttonListeners.fineImposeImposeButtonListener);
				LibrarySystem.FrameItems.finesImposePanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.fineImposeImposeButtonListener);
				
				LibrarySystem.FrameItems.transactionPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.transactionsPanelButtonListener);
				
				LibrarySystem.FrameItems.allFinesPanelItems.displayfines_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allFinesButtonListener);
				LibrarySystem.FrameItems.allFinesPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allFinesButtonListener);
				
				LibrarySystem.FrameItems.specificDatePanelItems.displaytransactions_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allTransactionsDisplayButtonListener);
				LibrarySystem.FrameItems.specificMonthPanelItems.displaytransactions_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allTransactionsDisplayButtonListener);
				LibrarySystem.FrameItems.specificYearPanelItems.displaytransactions_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allTransactionsDisplayButtonListener);
				LibrarySystem.FrameItems.customDateRangePanelItems.display_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allTransactionsDisplayButtonListener);
				LibrarySystem.FrameItems.currentTransactionPanelItems.displaytransaction_button.addActionListener(LibrarySystem.listeners.buttonListeners.allTransactionsDisplayButtonListener);				
				
				LibrarySystem.FrameItems.allBooksPanelItems.display_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allBooksDisplayButtonListener);
				LibrarySystem.FrameItems.allBooksPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allBooksDisplayButtonListener);
				
				LibrarySystem.FrameItems.allBorrowersPanelItems.display_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allBorrowersDisplayButtonListeners);
				LibrarySystem.FrameItems.allBorrowersPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.allBorrowersDisplayButtonListeners);
				
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.search_btn.addActionListener(LibrarySystem.listeners.buttonListeners.borrowerRecordSearchButtonListener);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.borrowerRecordSearchButtonListener);
				
				LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_btn.addActionListener(LibrarySystem.listeners.buttonListeners.queryBrowserButtonListener);
				
				LibrarySystem.FrameItems.finesPaymentPanelItems.payfine_btn.addActionListener(LibrarySystem.listeners.buttonListeners.finePaymentButtonListener);
				LibrarySystem.FrameItems.finesPaymentPanelItems.print_btn.addActionListener(LibrarySystem.listeners.buttonListeners.finePaymentButtonListener);
				LibrarySystem.FrameItems.finesPaymentPanelItems.finedetailsprint_btn.addActionListener(LibrarySystem.listeners.buttonListeners.finePaymentButtonListener);
		}
		
		private void addCalendarButtonListeners()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.addActionListener(LibrarySystem.listeners.calendarGenerator);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.addActionListener(LibrarySystem.listeners.calendarGenerator);
				
				LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.addActionListener(LibrarySystem.listeners.calendarGenerator);
		}
		
		private void addViewSystemLogButtonListeners()
		{
				LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.addActionListener(LibrarySystem.listeners.viewSystemLogButtonListener);
				LibrarySystem.FrameItems.systemLogPanelItems.print_btn.addActionListener(LibrarySystem.listeners.viewSystemLogButtonListener);
		}
		
		private void addAccountsManagerButtonListeners()
		{
				LibrarySystem.FrameItems.accountRegistrationPanelItems.addaccount_btn.addActionListener(LibrarySystem.listeners.addAccountButtonListener);
				LibrarySystem.FrameItems.accountRegistrationPanelItems.cancel_btn.addActionListener(LibrarySystem.listeners.addAccountButtonListener);
				
				LibrarySystem.FrameItems.editAccountPanelItems.submit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.editAccountButtonListeners);
				LibrarySystem.FrameItems.editAccountPanelItems.forgotpassword_btn.addActionListener(LibrarySystem.listeners.buttonListeners.editAccountButtonListeners);
				LibrarySystem.FrameItems.editAccountPanelItems.cancel_btn.addActionListener(LibrarySystem.listeners.buttonListeners.editAccountButtonListeners);
		}
		
		private void addTreeListeners()
		{
				LibrarySystem.FrameItems.navigationFrameItems.navigation_tree.addTreeSelectionListener(LibrarySystem.listeners.treeListeners.navigationTreeListener);
				LibrarySystem.FrameItems.settingsFrameItems.settings_tree.addTreeSelectionListener(LibrarySystem.listeners.treeListeners.settingsTreeListener);
		}
		
		private void addLoginButtonListeners()
		{
				LibrarySystem.FrameItems.loginFrameItems.login_btn.addActionListener(LibrarySystem.listeners.buttonListeners.loginFrameButtonListener);
				LibrarySystem.FrameItems.loginFrameItems.forgotpassword_btn.addActionListener(LibrarySystem.listeners.buttonListeners.loginFrameButtonListener);
				LibrarySystem.FrameItems.loginFrameItems.exit_btn.addActionListener(LibrarySystem.listeners.buttonListeners.loginFrameButtonListener);
		}
		
		private void addSettingsButtonListeners()
		{			
				LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontcolor_btn.addActionListener(LibrarySystem.listeners.buttonListeners.settingsFontsAndColorsChangePanelButtonListener);
				LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.applychanges_btn.addActionListener(LibrarySystem.listeners.buttonListeners.settingsFontsAndColorsChangePanelButtonListener);
				
				LibrarySystem.FrameItems.changeColorPanelItems.changebackgroundcolor_btn.addActionListener((LibrarySystem.listeners.colorChangePanelButtonListener));
				LibrarySystem.FrameItems.changeColorPanelItems.changeforegroundcolor_btn.addActionListener((LibrarySystem.listeners.colorChangePanelButtonListener));
				LibrarySystem.FrameItems.changeColorPanelItems.apply_btn.addActionListener((LibrarySystem.listeners.colorChangePanelButtonListener));
				
				LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.clearpassword_btn.addActionListener(LibrarySystem.listeners.buttonListeners.settingsFrameButtonListener);
				
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.deleteselectedaccounts_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteAccountButtonListener);
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.forgotpassword_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteAccountButtonListener);
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.cancel_btn.addActionListener(LibrarySystem.listeners.buttonListeners.deleteAccountButtonListener);
		}
		
		private void addMainMenuBarListeners()
		{
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.logoff_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.lock_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.exit_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.addaccount_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.editaccount_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.deleteaccount_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.startdatabaseserver_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.stopdatabaseserver_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.connectdatabaseserver_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.backupbooksdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.backupborrowersdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.backuptransactionsdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.backupfinesdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.backupentiredatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.loadbooksdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.loadborrowersdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.loadtransactionsdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.loadfinesdatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.loadentiredatabase_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.querybrowser_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.calculator_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.settings_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);				
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.clearsystemlog_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.helpcontents_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
				LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar.aboutlibsys_menuitem.addActionListener(LibrarySystem.listeners.mainMenuBarListener);
		}	
		
		private void addTextBoxListeners()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.newBorrowingsBookAccNumberTextBoxListener);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.newBorrowingsBorrowerAccNumberTextBoxListener);
				
				LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.newReturnsBookAccNumberTextBoxListener);
				LibrarySystem.FrameItems.returnPanelItems.returnprint_btn.addFocusListener(LibrarySystem.listeners.textBoxListeners.newReturnsBookAccNumberTextBoxListener);
				
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.finesPaymentBorrowerAccNumberTextBoxListener);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.fineImposeBorrowerAccNumberTextBoxListener);
				
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.borrowerRecordsAccNumberTestBoxListener);
				
				LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);				
				LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.deleteAccountsTextBoxListener);
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password.addFocusListener(LibrarySystem.listeners.textBoxListeners.deleteAccountsTextBoxListener);
				
				LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.queryBrowserTextAreaListener);
				
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.myDocumentListener);
				
				LibrarySystem.FrameItems.loginFrameItems.username_txt.addFocusListener(LibrarySystem.listeners.textBoxListeners.loginFrametextBoxListener);
				
				LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.printPreviewDocumentListener);
				LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getDocument().addDocumentListener(LibrarySystem.listeners.textBoxListeners.printPreviewDocumentListener);
				
				LibrarySystem.FrameItems.loginFrameItems.password_password.addKeyListener(LibrarySystem.listeners.textBoxListeners.loginFramePasswordTextBoxListener);
		}
		
		private void addCalculatorButtonListeners()
		{
				LibrarySystem.FrameItems.calculatorFrameItems.zero_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.one_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.two_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.three_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.four_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.five_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.six_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.seven_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.eight_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.nine_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.plus_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.minus_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.multiply_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.divide_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.braceopen_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.braceclose_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.percentage_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.point_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.Clear_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.Backspace_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
				LibrarySystem.FrameItems.calculatorFrameItems.equal_btn.addActionListener(LibrarySystem.listeners.buttonListeners.calculatorButtonListener);
		}	
}

