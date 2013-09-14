package libsys.gui.items;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class ReturnPanelItems
{
		public javax.swing.JLabel bookaccnumber_label;
                public javax.swing.JTextField bookaccnumber_txt;
                public javax.swing.JLabel bookauthor_label;
                public javax.swing.JTextField bookauthor_txt;
                public javax.swing.JTextField bookborrowdate_txt;
                public javax.swing.JLabel bookborrowddate_label;
                public javax.swing.JLabel bookduedate_label;
                public javax.swing.JTextField bookduedate_txt;
                public javax.swing.JLabel bookedition_label;
                public javax.swing.JTextField bookedition_txt;
                public javax.swing.JLabel bookname_label;
                public javax.swing.JTextField bookname_txt;
                public javax.swing.JLabel bookprice_label;
                public javax.swing.JTextField bookprice_txt;
                public javax.swing.JLabel bookpublisher_label;
                public javax.swing.JTextField bookpublisher_txt;
                public javax.swing.JLabel bookreturndate_label;
                public javax.swing.JButton bookreturndate_btn;
                public javax.swing.JPanel booksreturncomponentholder_panel;
                public javax.swing.JLabel borroweraddress_label;
                public javax.swing.JTextArea borroweraddress_textarea;
                public javax.swing.JScrollPane borroweraddresstextarea_scrollpane;
                public javax.swing.JLabel borroweremail_label;
                public javax.swing.JTextField borroweremail_txt;
                public javax.swing.JLabel borrowername_label;
                public javax.swing.JTextField borrowername_txt;
                public javax.swing.JLabel borrowernumber_label;
                public javax.swing.JTextField borrowernumber_txt;
                public javax.swing.JLabel borrowerphone_label;
                public javax.swing.JTextField borrowerphone_txt;
                public javax.swing.JLabel borrowersex_label;
                public javax.swing.JTextField borrowersex_txt;
                public javax.swing.JButton returnprint_btn;
                public javax.swing.JButton returnstransmit_btn;
                public javax.swing.JLabel fineamount_label;
                public javax.swing.JTextField fineamount_txt;
                public javax.swing.JCheckBox finepaid_checkbox;
                public javax.swing.JLabel finereason_label;
                public javax.swing.JTextArea finereason_textarea;
                public javax.swing.JCheckBox imposefine_checkbox;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JScrollPane returnspanelholder_scrollpane;
		public javax.swing.JLabel imagedestination_label;
		
		public ReturnPanelItems()
		{
                                returnspanelholder_scrollpane = new javax.swing.JScrollPane();
				imagedestination_label = new JLabel();
                                booksreturncomponentholder_panel = new javax.swing.JPanel();
                                bookaccnumber_label = new javax.swing.JLabel();
                                bookaccnumber_txt = new javax.swing.JTextField();
                                bookname_label = new javax.swing.JLabel();
                                bookname_txt = new javax.swing.JTextField();
                                bookauthor_label = new javax.swing.JLabel();
                                bookauthor_txt = new javax.swing.JTextField();
                                bookpublisher_label = new javax.swing.JLabel();
                                bookpublisher_txt = new javax.swing.JTextField();
                                bookedition_label = new javax.swing.JLabel();
                                bookedition_txt = new javax.swing.JTextField();
                                bookprice_label = new javax.swing.JLabel();
                                bookprice_txt = new javax.swing.JTextField();
                                bookborrowdate_txt = new javax.swing.JTextField();
                                bookborrowddate_label = new javax.swing.JLabel();
                                bookduedate_label = new javax.swing.JLabel();
                                bookduedate_txt = new javax.swing.JTextField();
                                bookreturndate_btn = new javax.swing.JButton();
                                bookreturndate_label = new javax.swing.JLabel();
                                imposefine_checkbox = new javax.swing.JCheckBox();
                                fineamount_label = new javax.swing.JLabel();
                                fineamount_txt = new javax.swing.JTextField();
                                finepaid_checkbox = new javax.swing.JCheckBox();
                                finereason_label = new javax.swing.JLabel();
                                jScrollPane1 = new javax.swing.JScrollPane();
                                finereason_textarea = new javax.swing.JTextArea();
                                borrowernumber_label = new javax.swing.JLabel();
                                borrowername_label = new javax.swing.JLabel();
                                borrowersex_label = new javax.swing.JLabel();
                                borrowerphone_label = new javax.swing.JLabel();
                                borroweremail_label = new javax.swing.JLabel();
                                borroweraddress_label = new javax.swing.JLabel();
                                borrowernumber_txt = new javax.swing.JTextField();
                                borrowername_txt = new javax.swing.JTextField();
                                borrowersex_txt = new javax.swing.JTextField();
                                borrowerphone_txt = new javax.swing.JTextField();
                                borroweremail_txt = new javax.swing.JTextField();
                                borroweraddresstextarea_scrollpane = new javax.swing.JScrollPane();
                                borroweraddress_textarea = new javax.swing.JTextArea();
                                returnstransmit_btn = new javax.swing.JButton();
                                returnprint_btn = new javax.swing.JButton();
				
				bookaccnumber_txt.setToolTipText("Enter Text and Press TAB");

                                booksreturncomponentholder_panel.setBackground(new java.awt.Color(204, 204, 255));

                                bookaccnumber_label.setText("Enter the Book Account Number :");

                                bookname_label.setText("Book Name :");

                                bookauthor_label.setText("Author : ");

                                bookpublisher_label.setText("Publisher : ");

                                bookedition_label.setText("Edition : ");

                                bookprice_label.setText("Price :");

                                bookborrowddate_label.setText("Borrow Date :");

                                bookduedate_label.setText("Due Date :");

                                bookreturndate_label.setText("Return Date :");

                                imposefine_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                imposefine_checkbox.setText("Impose Fine");

                                fineamount_label.setText("Fine Amount :");
                                fineamount_label.setEnabled(false);

                                fineamount_txt.setBackground(new java.awt.Color(204, 204, 255));
                                fineamount_txt.setEnabled(false);

                                finepaid_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                finepaid_checkbox.setText("Paid");
                                finepaid_checkbox.setEnabled(false);

                                finereason_label.setText(" Reason for Fine :");
                                finereason_label.setEnabled(false);

                                finereason_textarea.setColumns(20);
                                finereason_textarea.setRows(5);
                                jScrollPane1.setViewportView(finereason_textarea);

                                borrowernumber_label.setText("Borrower Number :");

                                borrowername_label.setText("Borrower Name :");

                                borrowersex_label.setText("Sex :");

                                borrowerphone_label.setText("Phone Number :");

                                borroweremail_label.setText("E-Mail :");

                                borroweraddress_label.setText("Address :");

                                borroweraddress_textarea.setColumns(20);
                                borroweraddress_textarea.setEditable(false);
                                borroweraddress_textarea.setRows(5);
                                borroweraddress_textarea.setAutoscrolls(false);
                                borroweraddresstextarea_scrollpane.setViewportView(borroweraddress_textarea);

                                returnstransmit_btn.setText("Transmit Transaction");

                                returnprint_btn.setText("Print Transaction");
				
				returnspanelholder_scrollpane.setViewportView(booksreturncomponentholder_panel);
				
				imagedestination_label.setToolTipText("Image of the Borrower");
                                imagedestination_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
				
				Date d = new Date();
				String s = formatDate(d);
				
				bookreturndate_btn.setText(s);
				bookreturndate_btn.setToolTipText("Click to change return date");
				
				bookname_txt.setEditable(false);
				bookauthor_txt.setEditable(false);
				bookpublisher_txt.setEditable(false);
				bookedition_txt.setEditable(false);
				bookprice_txt.setEditable(false);
				
				borrowername_txt.setEditable(false);
				borrowernumber_txt.setEditable(false);
				borrowersex_txt.setEditable(false);
				borroweremail_txt.setEditable(false);
				borroweraddress_textarea.setEditable(false);
				borrowerphone_txt.setEditable(false);
				
				bookname_txt.setBackground(Color.WHITE);
				bookauthor_txt.setBackground(Color.WHITE);
				bookpublisher_txt.setBackground(Color.WHITE);
				bookedition_txt.setBackground(Color.WHITE);
				bookprice_txt.setBackground(Color.WHITE);
				
				borrowername_txt.setBackground(Color.WHITE);
				borrowernumber_txt.setBackground(Color.WHITE);
				borrowersex_txt.setBackground(Color.WHITE);
				borroweremail_txt.setBackground(Color.WHITE);
				borroweraddress_textarea.setBackground(Color.WHITE);
				borrowerphone_txt.setBackground(Color.WHITE);
				
				bookborrowdate_txt.setEditable(false);
				bookduedate_txt.setEditable(false);
				
				bookborrowdate_txt.setBackground(Color.WHITE);
				bookduedate_txt.setBackground(Color.WHITE);
		}
		
		public String formatDate(Date date) 
		{
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return format.format(date);
		}
}