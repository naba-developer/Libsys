package libsys.general.utilities;

import libsys.general.LIBSYSSystem;
 

public class DataFormatter
{
		LIBSYSSystem LibrarySystem;
		
		public String text;
		
		public DataFormatter(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public String getFormattedFinePaymentData()
		{
				return null;
		}
		
		public String getFormattedReturnTransactionData()
		{
				text="&nbsp&nbsp&nbsp&nbsp Book was borrowed on date: "+LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt.getText()+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp Book Details : "+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Account Number : "+LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Name : "+LibrarySystem.FrameItems.returnPanelItems.bookname_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Author : "+LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Publisher : "+LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Edition : "+LibrarySystem.FrameItems.returnPanelItems.bookedition_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Price : "+LibrarySystem.FrameItems.returnPanelItems.bookprice_txt.getText()+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp Book due date : "+LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp Book returned on "+LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn.getText()+"<BR><BR>";
				
				if(LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.getText().length()==0)
				{
						text = text + "&nbsp&nbsp&nbsp&nbsp Fine Imposed : None<BR>";
						text = text + "&nbsp&nbsp&nbsp&nbsp Fine Reason : Not Applicable<BR>";
				}
				else
				{
						text = text + "&nbsp&nbsp&nbsp&nbsp Fine Imposed : Rs"+LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.getText();
						
						if(LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.getText().length()==0)
						{
								text = text + "&nbsp&nbsp&nbsp&nbsp Reason for fine : Not specified"+"<BR>";
								
						}
						else
						{
								text = text + "&nbsp&nbsp&nbsp&nbsp Reason for fine:"+LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.getText()+"<BR>";
								
						}
						if(LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.isSelected())
						{
								text = text + "&nbsp&nbsp&nbsp&nbsp Fine amount is paid"+"<BR>";
						}
						else
						{
								text = text + "&nbsp&nbsp&nbsp&nbsp Fine amount is pending"+"<BR>";
						}
				}
				text = text + "&nbsp&nbsp&nbsp&nbsp Borrower Details:<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Account Number: "+LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Name: "+LibrarySystem.FrameItems.returnPanelItems.borrowername_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Sex: "+LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Phone Number: "+LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Email: "+LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Address: "+LibrarySystem.FrameItems.returnPanelItems.borroweraddress_textarea.getText()+"<BR>";
				
				return text;
		}
		
		public String getFormattedBorrowingTransactionData()
		{
				text="&nbsp&nbsp&nbsp&nbsp Book borrowed on date: "+LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.getText()+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Details :<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Account Number : "+LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Title : "+LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Author : "+LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Publisher : "+LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Edition : "+LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Book Price : "+LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt.getText()+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp Borrower Details :<BR><BR> ";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Account Number : "+LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Name : "+LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Sex : "+LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Phone Number : "+LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Email : "+LibrarySystem.FrameItems.borrowingPanelItems.email_txt.getText()+"<BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Address : "+LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_textarea.getText()+"<BR><BR>";
				text = text + "&nbsp&nbsp&nbsp&nbsp Due date for book : "+LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.getText();
				
				return text;
		}
		
		public String getFormattedFineImposeItems()
		{
				text="&nbsp&nbsp&nbsp&nbsp Borrower details:  "+"<BR><BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Account Number: "+LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.getText()+"<BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Name: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt.getText()+"<BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Sex: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt.getText()+"<BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Phone Number: "+LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt.getText()+"<BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Email:"+LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt.getText()+"<BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Borrower Address: "+LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_textarea.getText()+"<BR><BR>";
				text+="&nbsp&nbsp&nbsp&nbsp Fine Details:<BR><BR>";
				text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Fine Amount: "+LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText()+"<BR>";
				if(LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText().length()==0)
				{
						text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Fine  Reason: Not specified"+"<BR>";
				}
				else
				{
						text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Fine Reason: "+LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText()+"<BR>";
						
							
				}		
				if(LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox.isSelected())
				{
						text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Fine Paid"+"<BR>";
						
				}
				else
				{
						text+="&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp Fine Not Paid";
				}
				
				
				return text;
		}
		
		
		public String getHTMLFormattedData(String header, String footer, String body)
		{
				int BodyFontSize = Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 12));
				String BodyFontFace = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 8);
				
				String fr = Integer.toHexString(Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 9)));
				String fg = Integer.toHexString(Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 10)));
				String fb = Integer.toHexString(Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 11)));
				
				String head = "<html><body FONT SIZE = \"" + BodyFontSize + "\" FACE = \"" + BodyFontFace + "\" COLOR = \"#" + fr + "" + fg + "" + fb + "\">";
				
				if(header == null || header.length() == 0)
				{
						head = head + "<br><p align = left>";
				}		
				else
				{
						head = head + "<center><h2>" + header + "<h2></center><p align = left>";
				}
				
				String foot = "</center></body></html>";
				
				if(footer != null && footer.length() > 0)
				{
						foot = "</p><br><center><h4>" + footer + "</h4></center></body></html>";
				}
				
				return head + body + foot;
		}
		
		public String addHeader(String header, String text)
		{
				return getHTMLFormattedData(header, "", text);
		}
		
		public String appendFooter(String footer, String text)
		{
				return getHTMLFormattedData("", footer, text);
		}
}
