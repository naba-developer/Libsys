package libsys.general.utilities;

import java.awt.Color;
import libsys.general.LIBSYSSystem;

public class ForeGroundColorChanger
{
		LIBSYSSystem LibrarySystem;
		
		public ForeGroundColorChanger(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void setForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.mysqlFrameItems.tab_panel.setBackground(ForeGroundColor);
				
				setNavigationFrameForegroundColor(ForeGroundColor);
				setSettingsFrameForegroundColor(ForeGroundColor);
				setCalculatorFrameForegroundColor(ForeGroundColor);
				setAccountsManagerForegroundColor(ForeGroundColor);
				setAboutFrameForegroundColor(ForeGroundColor);
				setyPrintPreviewForegroundColor(ForeGroundColor);
				
				refreshFrameList();
		}
		
		private void setyPrintPreviewForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.printPreviewFrameItems.tab_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.printPreviewFrameItems.jPanel1.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.printPreviewFrameItems.jPanel2.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.printPreviewFrameItems.parameters_panel.setBackground(ForeGroundColor);
		}
		
		private void setAboutFrameForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.aboutFrameItems.tab_panel.setBackground(ForeGroundColor);
		}
		
		private void setAccountsManagerForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setBackground(ForeGroundColor);
		}
		
		private void setCalculatorFrameForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.calculatorFrameItems.Calculator_Panel.setBackground(ForeGroundColor);
		}
		
		private void setSettingsFrameForegroundColor(Color ForeGroundColor)
		{
				 LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.tab_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewscrollpaneholder_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.scrollbar_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatabasequeryinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatadeleteinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataentryinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatasearchinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataupdateinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savelockopeninformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.saveloginlogoffinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savesystemlogclearanceinformation_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.selectall_checkbox.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.changeColorPanelItems.preview_panel.setBackground(ForeGroundColor);
				 LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel.setBackground(ForeGroundColor);
		}
		private void setNavigationFrameForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setBackground(ForeGroundColor);
				
				setBorrowerRecordsSearchPanelForeGroundColor(ForeGroundColor);
				setBorrowingsPanelForegroundColor(ForeGroundColor);
				setReturnsPanelForegroundColor(ForeGroundColor);
				setInsertBooksPanelForegroundColor(ForeGroundColor);
				setInsertBorrowersPanelForegroundColor(ForeGroundColor);
				setUpdateBooksPanelForegroundColor(ForeGroundColor);
				setUpdateBorrowersPanelForegroundColor(ForeGroundColor);
				setDeleteBooksPanelForeGroundColor(ForeGroundColor);
				setDeleteBorrowersPanelForeGroundColor(ForeGroundColor);
				setSearchBooksPanelForeGroundColor(ForeGroundColor);
				setSearchBorrowerPanelForeGroundColor(ForeGroundColor);
				setFinesImposePanelForeGroundColor(ForeGroundColor);
				setFinesPaymentPanelForeGroundColor(ForeGroundColor);
				setAllTransactionsPanelForeGroundColor(ForeGroundColor);
				setAllBooksPanelForegroundColor(ForeGroundColor);
				setAllBorrowersPanelForeGroundColor( ForeGroundColor);
				setAllFinesPanelForeGroundColor(ForeGroundColor);
				setSystemLogPanelForeGroundColor(ForeGroundColor);
				setLoginPanelForeGroundColor(ForeGroundColor);
				setAccountManagerFrameForeGroundColor(ForeGroundColor);
				setQueryBrowserPanelForegroundColor(ForeGroundColor);
		}
		private void setBorrowerRecordsSearchPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.additonalparameter_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchparameter_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresultview_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.workspaceborrowerrecordsearch_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox.setBackground(ForeGroundColor);
		}
		
		private void setQueryBrowserPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.queryBrowserPanelItems.browsedatabase_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.queryBrowserPanelItems.databasebrowser_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.queryBrowserPanelItems.previewdatabase_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.queryBrowserPanelItems.queryarea_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.queryBrowserPanelItems.table_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_panel.setBackground(ForeGroundColor);
		}
		
		private void setAllTransactionsPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.viewtransactions_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.customdate_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.customdaterange_radiobutton.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificyear_radiobutton.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificdate_radiobutton.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificmonth_radiobutton.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificyear_radiobutton.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.transactionPanelItems.currenttransactions_radiobutton.setBackground(ForeGroundColor);
				
				LibrarySystem.FrameItems.specificDatePanelItems.searchbutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.specificDatePanelItems.specificdate_panel.setBackground(ForeGroundColor);
				
				LibrarySystem.FrameItems.specificMonthPanelItems.searchbutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.specificMonthPanelItems.specificmonth_panel.setBackground(ForeGroundColor);
				
				LibrarySystem.FrameItems.specificYearPanelItems.displaytransactionbutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.specificYearPanelItems.specificyear_panel.setBackground(ForeGroundColor);
				
				LibrarySystem.FrameItems.customDateRangePanelItems.displaybutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.customDateRangePanelItems.enddate_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.customDateRangePanelItems.startdate_panel.setBackground(ForeGroundColor);		
		}
		
		private void setAllBooksPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.viewbooks_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybookaccnumber_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybookauthors_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbybooktitle_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbyeditions_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbyprice_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypublishers_checkbox.setBackground(ForeGroundColor);
						
		}
		private void setAllBorrowersPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.viewbooks_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.viewsettings_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborrowername_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborroweraccnumber_checkbox.setBackground(ForeGroundColor);
		}
		private void setAllFinesPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewfines_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.allpaidfines_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.allfines_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox.setBackground(ForeGroundColor);
		}
		
		private void setLoginPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.loginFrameItems.main_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox.setBackground(ForeGroundColor);
		}
		private void setAccountManagerFrameForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setBackground(ForeGroundColor);
		}
		
		private void setSystemLogPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsystemlog_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox.setBackground(ForeGroundColor);
					
		}
		private void setFinesPaymentPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddresstextarea_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweremail_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.finedetailsprint_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.imagedestination_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.payfine_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.print_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.searchresults_panel.setBackground(ForeGroundColor);
				
				
		}
		private void setFinesImposePanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.finesImposePanelItems.ImposeFineScroll_Pane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.WorkspaceImposeFine_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.finereason_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.jLabel3.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane3.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane4.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.finesImposePanelItems.print_btn.setBackground(ForeGroundColor);
												
		}
		private void setSearchBorrowerPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowersearch_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.search_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchparameters_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresults_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.tabpanel_scrollpane.setBackground(ForeGroundColor);
				
		}
		private void setSearchBooksPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane1.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane2.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane3.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.print_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.search_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchparameters_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_progressbar.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.searchresultstable_scrollpane.setBackground(ForeGroundColor);
				
				
		}
		private void setDeleteBorrowersPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchparameters_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresults_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.search_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.tabpanel_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowersearch_panel.setBackground(ForeGroundColor);				
		}
		
		private void setDeleteBooksPanelForeGroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchparameters_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.deleteselected_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane1.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane2.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane3.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.print_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_progressbar.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.searchresultstable_scrollpane.setBackground(ForeGroundColor);
						
		}
		
		private void setUpdateBorrowersPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowerentry_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchborrowerstoupdate_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.updatebook_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchparameters_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresults_panel.setBackground(ForeGroundColor);				
		}
		
		private void setUpdateBooksPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.WorkSpaceBookEntry_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.searchbookstoupdate_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.searchparameters_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.updatebook_panel.setBackground(ForeGroundColor);				
		}
		
		private void setInsertBorrowersPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerentry_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweremail_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.uploadimage_label.setBackground(ForeGroundColor);				
		}
		
		private void setBorrowingsPanelForegroundColor(Color ForeGroundColor)
		{				
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowings_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.booksborrowingcomponentholder_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowerimagelabelholder_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookedition_lbl.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookprice_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.booktitle_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraddresstextarea_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweremail_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingspanelholder_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingspanelholder_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.exit_btn.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label.setBackground(ForeGroundColor);
				
		}
		
		private void setReturnsPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookauthor_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookborrowddate_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookduedate_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookedition_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookname_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookprice_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookpublisher_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.bookreturndate_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.booksreturncomponentholder_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.booksreturncomponentholder_panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borroweraddress_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borroweraddresstextarea_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borroweremail_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowername_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowerphone_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowersex_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.fineamount_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.imagedestination_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.returnspanelholder_scrollpane.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setBackground(ForeGroundColor);
		}
		
		private void setInsertBooksPanelForegroundColor(Color ForeGroundColor)
		{
				LibrarySystem.FrameItems.insertBooksPanelItems.WorkSpaceBookEntry_Panel.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_label.setBackground(ForeGroundColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_label.setBackground(ForeGroundColor);
		}
		
		private void refreshFrameList()
		{
				LibrarySystem.FrameList.LoginFrame.repaint();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				LibrarySystem.FrameList.CalculatorFrame.repaint();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				LibrarySystem.FrameList.AboutLIBSYSFrame.repaint();
				LibrarySystem.FrameList.PrintPreviewFrame.repaint();
		}
}
