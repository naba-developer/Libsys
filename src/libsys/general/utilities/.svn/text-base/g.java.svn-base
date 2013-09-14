/*
 * g.java
 *
 * Created on September 2, 2009, 10:38 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package libsys.general.utilities;

import libsys.general.LIBSYSSystem;

/**
 *
 * @author DEVIL
 */
public class g {
		
		/** Creates a new instance of g */
		LIBSYSSystem LibrarySystem;
		String text;
		public g(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public String getFormattedReturnItems()
		{
				text="Book was borrowed on date: "+LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.getText()+"<BR>";
				text+="Book Details: "+"<BR><BR>";
				text+="Book Account Number: "+LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.getText()+"<BR>";
				text+="Book Name: "+LibrarySystem.FrameItems.returnPanelItems.bookname_txt.getText()+"<BR>";
				text+="Book Author: "+LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.getText()+"<BR>";
				text+="Book Publisher: "+LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.getText()+"<BR>";
				text+="Book Edition: "+LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.getText()+"<BR>";
				text+="Book Price: "+LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.getText()+"<BR><BR>";
				text+="Book due date: "+LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.getText()+"<BR>";
				text+="Book returned on "+LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.getText()+"<BR>";
				if(LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.getText().length()==0)
				{
						text+=" No fine  imposed<BR>";
						text+="Fine Reason: Not Applicable";
				}
				else
				{
						text+="Fine imposed :Rs"+LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.getText();
						if(LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.getText().length()==0)
						{
								text+="Reason for fine: Not specified"+"<BR>";
								
						}
						else
						{
								text+="Reason for fine:"+LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.getText()+"<BR>";
								
						}
						if(LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.isSelected())
						{
								text+="Fine amount is paid"+"<BR>";
						}
						else
						{
								text+="Fine amount is pending"+"<BR>";
						}
				}
				text+="Borrower Details:<BR><BR>";
				text+="Borrower Account Number: "+LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.getText()+"<BR>";
				text+="Borrower Name: "+LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.getText()+"<BR>";
				text+="Borrower Sex: "+LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.getText()+"<BR>";
				text+="Borrower Phone Number: "+LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.getText()+"<BR>";
				text+="Borrower Email: "+LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.getText()+"<BR>";
				text+="Borrower Address: "+LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.getText()+"<BR>";
				
				return text;
		}
		
		public String getFormattedFineImposeItems()
		{
				text="Borrower details:  "+"<BR><BR>";
				text+="Borrower Account Number: "+LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.getText()+"<BR>";
				text+="Borrower Name: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.getText()+"<BR>";
				text+="Borrower Sex: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.getText()+"<BR>";
				text+="Borrower Phone Number: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt+"<BR>";
				text+="Borrower Email:"+LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.getText()+"<BR>";
				text+="Borrower Address: "+LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.getText()+"<BR>";
				text+="Fine details:<BR><BR>";
				text+="Fine Amount: "+LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText()+"<BR>";
				if(LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText().length()==0)
				{
						text+="Fine  Reason: Not specified"+"<BR>";
				}
				else
				{
						text+="Fine Reason: "+LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText()+"<BR>";
						
							
				}		
				if(LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox.isSelected())
				{
						text+="Fine paid"+"<BR>";
						
				}
				else
				{
						text+="Fine not paid";
				}
				
				
				return text;
		}
		
}
