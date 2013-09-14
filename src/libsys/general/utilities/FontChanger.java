package libsys.general.utilities;

import java.awt.Color;
import java.awt.Font;
import libsys.general.LIBSYSSystem;

public class FontChanger
{
		LIBSYSSystem LibrarySystem;
		
		public FontChanger(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void setFont(Font FontFace, Color FontColor)
		{
				setNavigationFrameFont(FontFace, FontColor);
		}
		
		private void setNavigationFrameFont(Font FontFace, Color FontColor)
		{				
				//setBorrowingPanelFont(FontFace, FontColor);
				//setReturnsPanelFont(FontFace, FontColor);
				//setInsertBooksPanelFont(FontFace, FontColor);
				//setInsertBorrowersPanelFont(FontFace, FontColor);
				//setUpdateBooksPanelFont(FontFace, FontColor);
				//setUpdateBorrowersPanelFont(FontFace, FontColor);
				//setDeleteBooksPanelFont(FontFace, FontColor);
				//setDeleteBorrowersPanelFont(FontFace, FontColor);
				//setSearchBooksPanelFont(FontFace, FontColor);
				//setSearchBorrowerPanelFont(FontFace, FontColor);
				//setFinesImposePanelFont(FontFace, FontColor);
				//setFinesPaymentPanelFont(FontFace, FontColor);
				//setAllBooksPanelFont(FontFace, FontColor);
				//setAllBorrowersPanel(FontFace, FontColor);
				//setAllFinesPanelItems(FontFace, FontColor);
				//setTransactionPanelItems(FontFace, FontColor);
				setSystemLogPanelItems(FontFace, FontColor);
		}
		
		private void setBorrowingPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt.setFont(FontFace);
				LibrarySystem.FrameItems.borrowingPanelItems.email_txt.setFont(FontFace);			
				
				LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.borrowingPanelItems.email_txt.setForeground(FontColor);
		}
		
		private void setReturnsPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookname_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.setFont(FontFace);
				LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookname_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setForeground(FontColor);
				
				
		}
		
		
		private void setInsertBooksPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_spinner.setForeground(FontColor);									
		}
		
		private void setInsertBorrowersPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt.setFont(FontFace);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt.setForeground(FontColor);				
		}
		
		private void setUpdateBooksPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookauthor_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_spinner.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookpublisher_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.booktitle_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthor_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookauthor_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_spinner.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.bookpublisher_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.booktitle_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthor_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.setForeground(FontColor);			
		}
		
		private void setUpdateBorrowersPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.setFont(FontFace);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.setFont(FontFace);
				
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.setForeground(FontColor);
		}
		
		private void setDeleteBooksPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_spinner.setFont(FontFace);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_spinner.setForeground(FontColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_txt.setForeground(FontColor);
		}
		
		private void setDeleteBorrowersPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt.setForeground(FontColor);			
		}
		
		private void setSearchBooksPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_spinner.setFont(FontFace);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_textarea.setFont(FontFace);
				
				LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_spinner.setForeground(FontColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_textarea.setForeground(FontColor);						
		}
		
		private void setSearchBorrowerPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt.setForeground(FontColor);
		}
		
		private void setFinesImposePanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.setFont(FontFace);
				
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.setForeground(FontColor);
				
				
		}
		
		private void setFinesPaymentPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_textarea.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.email_txt.setFont(FontFace);
				LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_txt.setFont(FontFace);
				
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_textarea.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.email_txt.setForeground(FontColor);
				LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_txt.setForeground(FontColor);
				
		}
		
		private void setAllBooksPanelFont(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.viewbooks_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBooksPanelItems.transactions_textarea.setFont(FontFace);
				
				LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.viewbooks_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBooksPanelItems.transactions_textarea.setForeground(FontColor);
		}
		
		private void setAllBorrowersPanel(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.viewbooks_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allBorrowersPanelItems.transactions_textarea.setFont(FontFace);
				
				LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.viewbooks_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allBorrowersPanelItems.transactions_textarea.setForeground(FontColor);
				
		}
		
		private void setAllFinesPanelItems(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel.setFont(FontFace);
				LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setFont(FontFace);
				LibrarySystem.FrameItems.allFinesPanelItems.viewfines_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel.setFont(FontFace);
				LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel.setFont(FontFace);
				
				LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane.setForeground(FontColor);
				LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewfines_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel.setForeground(FontColor);
		}
		
		private void setTransactionPanelItems(Font FontFace, Color FontColor)
		{
				LibrarySystem.FrameItems.transactionPanelItems.customdate_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.viewtransactions_panel.setFont(FontFace);
				LibrarySystem.FrameItems.transactionPanelItems.transactions_textarea.setFont(FontFace);
				
				LibrarySystem.FrameItems.transactionPanelItems.customdate_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.viewtransactions_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.transactionPanelItems.transactions_textarea.setForeground(FontColor);
				
		}
		
		private void setSystemLogPanelItems(Font FontFace, Color FontColor)
		{
				//LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel.setFont(FontFace);
				//LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel.setFont(FontFace);
				LibrarySystem.FrameItems.systemLogPanelItems.systemlog_textarea.setFont(FontFace);
				/*LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel.setFont(FontFace);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel.setFont(FontFace);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel.setFont(FontFace);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel.setFont(FontFace);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsystemlog_panel.setFont(FontFace);
				
				LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel.setForeground(FontColor);*/
				LibrarySystem.FrameItems.systemLogPanelItems.systemlog_textarea.setForeground(FontColor);
				/*LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel.setForeground(FontColor);
				LibrarySystem.FrameItems.systemLogPanelItems.viewsystemlog_panel.setForeground(FontColor);*/
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
