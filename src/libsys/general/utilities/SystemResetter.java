package libsys.general.utilities;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import libsys.general.LIBSYSSystem;

public class SystemResetter
{
		LIBSYSSystem LibrarySystem;
		
		public SystemResetter(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void resetLIBSYS()
		{
				resetLoginFrame();
				resetAccountsManagerFrame();
				resetNavigationFrame();	
				resetCalculatorFrame();
				resetSettingsFrame();
				resetMySQLFrame();
				resetPrintPreviewFrame();
		}
		
		public void resetPrintPreviewFrame()
		{
				LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(null);
				LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.setText(null);
				LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.setText(null);
		}
		
		public void resetMySQLFrame()
		{
				LibrarySystem.FrameItems.mysqlFrameItems.username_txt.setText("root");
				LibrarySystem.FrameItems.mysqlFrameItems.password_password.setText(null);
		}
		
		public void resetSettingsFrame()
		{
				
		}
		
		public void resetCalculatorFrame()
		{
				LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
		}
		
		public void resetNavigationFrame()
		{
				resetBorrowingsPanel();
				resetReturnsPanel();
				resetInsertBooksPanel();
				resetInsertBorrowersPanel();
				resetUpdateBooksPanel();
				resetUpdateBorrowersPanel();
				resetDeleteBooksPanel();
				resetDeleteBorrowersPanel();
				resetSearchBooksPanel();
				resetSearchBorrowersPanel();
				resetFinesPaymentPanel();
				resetFineImposePanel();
				resetAllTransactionsPanel();
				resetAllBooksPanel();
				resetAllBorrowersPanel();
				resetBorrowerRecordsPanel();
				resetAllFinesPanel();
				resetSystemLogPanel();
				resetQueryBorwserPanel();
		}
		
		public void resetQueryBorwserPanel()
		{
				LibrarySystem.FrameItems.queryBrowserPanelItems.query_textarea.setText(null);
				LibrarySystem.FrameItems.queryBrowserPanelItems.tables_scrollpane.setViewportView(null);
		}
		
		public void resetSystemLogPanel()
		{
				LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox.setSelected(false);
				LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.systemLogPanelItems.systemlog_textarea.setText(null);
				LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetAllFinesPanel()
		{
				LibrarySystem.FrameItems.allFinesPanelItems.allpaidfines_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allFinesPanelItems.allfines_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allFinesPanelItems.logduration_combobox.setSelectedItem("Today");
				LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetBorrowerRecordsPanel()
		{
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.address_textarea.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowersex_txt.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_txt.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.imagedestination_label.setIcon(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.imagedestination_label.setText(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane.setViewportView(null);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox.setSelected(false);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox.setSelected(false);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar.setValue(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar.getMinimum());
		}
		
		public void resetAllBorrowersPanel()
		{
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborroweraccnumber_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborrowername_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetAllBooksPanel()
		{
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybookaccnumber_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybooktitle_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybookauthors_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypublishers_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbyeditions_checkbox.setSelected(false);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbyprice_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.allBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetAllTransactionsPanel()
		{
				resetSpecificDatePanel();
				resetSpecificMonthPanel();
				resetSpecificYearPanel();
				resetCustomDateRangePanel();
				resetCurrentTransactionPanel();
				
				LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetCurrentTransactionPanel()
		{
				LibrarySystem.FrameItems.currentTransactionPanelItems.transactionduration_combobox.setSelectedItem("Today");
		}
		
		public void resetCustomDateRangePanel()
		{
				int today = getCurrentDate();
				String month = getMonth(getCurrentMonthNumber());
				int year = getCurrentYear();
				
				LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.setSelectedItem(String.valueOf(today));
				LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox.setSelectedItem(month);
				LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner.setValue(year);
				
				LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.setSelectedItem(String.valueOf(today));
				LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox.setSelectedItem(month);
				LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner.setValue(year);
		}
		
		public void resetSpecificYearPanel()
		{
				int year = getCurrentYear();
				
				LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_spinner.setValue(year);
		}
		
		public void resetSpecificMonthPanel()
		{
				String month = getMonth(getCurrentMonthNumber());
				int year = getCurrentYear();
				
				LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_combobox.setSelectedItem(month);
				LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_spinner.setValue(year);
		}
		
		public void resetSpecificDatePanel()
		{
				int today = getCurrentDate();
				String month = getMonth(getCurrentMonthNumber());
				int year = getCurrentYear();
				
				LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem(String.valueOf(today));
				LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.setSelectedItem(month);
				LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.setValue(year);
		}
		
		public void resetFineImposePanel()
		{
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label.setIcon(null);	
				LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.setText(null);
				LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox.setSelected(false);
		}
		
		public void resetFinesPaymentPanel()
		{
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.email_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_txt.setText(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.imagedestination_label.setIcon(null);
				LibrarySystem.FrameItems.finesPaymentPanelItems.imagedestination_label.setText(null);
                                
                                LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_scrollpane.setViewportView(null);
		}
		
		public void resetSearchBorrowersPanel()
		{
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.setText(null);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetSearchBooksPanel()
		{
				LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_textarea.setText(null);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_textarea.setText(null);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_textarea.setText(null);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_spinner.setValue(1);
				
				LibrarySystem.FrameItems.searchBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetDeleteBorrowersPanel()
		{
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.setText(null);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetDeleteBooksPanel()
		{
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_txt.setText(null);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_textarea.setText(null);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_textarea.setText(null);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_spinner.setValue(1);
				
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetUpdateBorrowersPanel()
		{
				resetUpdateBorrowersSearchPanel();
				resetUpdateBorrowerUpdatePanel();
		}
		
		public void resetUpdateBorrowerUpdatePanel()
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.setSelectedItem("Male");
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagedestination_label.setIcon(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagedestination_label.setText(null);
		}
		
		public void resetUpdateBorrowersSearchPanel()
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.setText(null);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetUpdateBooksPanel()
		{
				resetUpdateBooksSearchPanel();
				resetUpdateBooksUpdatePanel();
		}
		
		public void resetUpdateBooksUpdatePanel()
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthor_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_spinner.setValue(1);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.setText(null);
		}
		
		public void resetUpdateBooksSearchPanel()
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.booktitle_txt.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookauthor_textarea.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookpublisher_textarea.setText(null);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_spinner.setValue(1);
				
				LibrarySystem.FrameItems.updateBooksPanelItems.searchresultstable_scrollpane.setViewportView(null);
				
				LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_progressbar.setValue(LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_progressbar.getMinimum());
		}
		
		public void resetInsertBorrowersPanel()
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox.setSelectedItem("Male");
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.setText(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label.setIcon(null);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label.setText(null);
		}
		
		public void resetInsertBooksPanel()
		{
				LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.setText(null);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_textarea.setText(null);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt.setText(null);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_spinner.setValue(1);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.setText(null);
		}
		
		public void resetReturnsPanel()
		{
				LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookname_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.setText(null);
				
				LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.setText(null);
				
				Date d = new Date();
				String s = formatDate(d);
				
				LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.setText(s);
				
				LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setEnabled(false);
				LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.returnPanelItems.imagedestination_label.setIcon(null);		
				LibrarySystem.FrameItems.returnPanelItems.imagedestination_label.setText(null);		
		}
		
		public void resetBorrowingsPanel()
		{
				resetBorrowingsBookItems();
				resetBorrowingsBorrowerItems();
		}
		
		public void resetBorrowingsBorrowerItems()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.email_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_textarea.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label.setIcon(null);
				LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label.setText(null);
				
				Date d = new Date();
				String s = formatDate(d);
				
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.setText(s);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.setText(s);
		}
		
		public void resetBorrowingsBookItems()
		{
				LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt.setText(null);
				LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt.setText(null);				
				
				Date d = new Date();
				String s = formatDate(d);
				
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.setText(s);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.setText(s);
		}
		
		public void resetAccountsManagerFrame()
		{
				resetAddAccountPanel();
				resetEditAccountPanel();
				resetDeleteAccountPanel();
		}
		
		public void resetDeleteAccountPanel()
		{
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt.setText(null);
				LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password.setText(null);
				
				if(LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list != null)
				{
						LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountslist_list.removeAll();
				}
		}
		
		public void resetEditAccountPanel()
		{
				LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.newusername_txt.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.newpassword_password.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_txt.setText(null);
				LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_txt.setText(null);
		}
		
		public void resetAddAccountPanel()
		{
				LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt.setText(null);
				LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password.setText(null);
				LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password.setText(null);
				LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt.setText(null);
				LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt.setText(null);
		}
		
		public void resetLoginFrame()
		{
				LibrarySystem.FrameItems.loginFrameItems.username_txt.setText(null);
				LibrarySystem.FrameItems.loginFrameItems.password_password.setText(null);
				
				LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox.setSelected(false);
				
				LibrarySystem.FrameItems.loginFrameItems.username_txt.setEditable(true);
		}
		
		private String formatDate(Date date) 
		{
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return format.format(date);
		}
		
		private int getCurrentYear()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("yyyy");
				
				return Integer.parseInt(format.format(date));
		}
		
		private int getCurrentMonthNumber()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("MM");
				
				return Integer.parseInt(format.format(date));
		}
		
		private int getCurrentDate()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("dd");
				
				return Integer.parseInt(format.format(date));
		}
		
		private String getMonth(int n)
		{
				String month = "January";
				
				switch(n)
				{
						case 1 : month = "January";
								break;
						case 2 : month = "February";
								break;
						case 3 : month = "March";
								break;
						case 4 : month = "April";
								break;
						case 5 : month = "May";
								break;
						case 6 : month = "June";
								break;
						case 7 : month = "July";
								break;
						case 8 : month = "August";
								break;
						case 9 : month = "September";
								break;
						case 10 : month = "October";
								break;
						case 11 : month = "November";
								break;
						case 12 : month = "December";
								break;
				}
				
				return month;
		}
}
