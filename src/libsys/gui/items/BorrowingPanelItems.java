package libsys.gui.items;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BorrowingPanelItems
{
                public javax.swing.JLabel bookaccnumber_label;
                public javax.swing.JTextField bookaccnumber_txt;
                public javax.swing.JLabel bookauthor_label;
                public javax.swing.JTextField bookauthor_txt;
                public javax.swing.JLabel bookborrowdate_label;
                public javax.swing.JButton bookborrowdate_btn;
                public javax.swing.JPanel bookborrowings_panel;
                public javax.swing.JLabel bookduedate_label;
                public javax.swing.JButton bookduedate_btn;
                public javax.swing.JLabel bookedition_lbl;
                public javax.swing.JTextField bookedition_txt;
                public javax.swing.JLabel bookprice_label;
                public javax.swing.JTextField bookprice_txt;
                public javax.swing.JLabel bookpublisher_label;
                public javax.swing.JTextField bookpublisher_txt;
                public javax.swing.JPanel booksborrowingcomponentholder_panel;
                public javax.swing.JLabel booktitle_label;
                public javax.swing.JTextField booktitle_txt;
                public javax.swing.JLabel borroweraccnumber_label;
                public javax.swing.JTextField borroweraccnumber_txt;
                public javax.swing.JLabel borroweraddress_label;
                public javax.swing.JTextArea borroweraddress_textarea;
                public javax.swing.JScrollPane borroweraddresstextarea_scrollpane;
                public javax.swing.JLabel borroweremail_label;
                public javax.swing.JPanel borrowerimagelabelholder_panel;
                public javax.swing.JLabel borrowername_label;
                public javax.swing.JTextField borrowername_txt;
                public javax.swing.JLabel borrowerphone_label;
                public javax.swing.JTextField borrowerphone_txt;
                public javax.swing.JLabel borrowersex_label;
                public javax.swing.JTextField borrowersex_txt;
                public javax.swing.JPanel borrowingbooksdata_panel;
                public javax.swing.JButton borrowingprint_btn;
                public javax.swing.JScrollPane borrowingspanelholder_scrollpane;
                public javax.swing.JPanel borrowingstudentsdata_panel;
                public javax.swing.JButton borrowingtransmit_btn;
                public javax.swing.JTextField email_txt;
                public javax.swing.JButton exit_btn;
                public javax.swing.JLabel imagedestination_label;
		
		public BorrowingPanelItems()
		{
				bookborrowings_panel = new javax.swing.JPanel();
                                borrowingspanelholder_scrollpane = new javax.swing.JScrollPane();
                                booksborrowingcomponentholder_panel = new javax.swing.JPanel();
                                borrowingbooksdata_panel = new javax.swing.JPanel();
                                bookaccnumber_label = new javax.swing.JLabel();
                                bookaccnumber_txt = new javax.swing.JTextField();
                                booktitle_label = new javax.swing.JLabel();
                                booktitle_txt = new javax.swing.JTextField();
                                bookauthor_label = new javax.swing.JLabel();
                                bookauthor_txt = new javax.swing.JTextField();
                                bookpublisher_label = new javax.swing.JLabel();
                                bookpublisher_txt = new javax.swing.JTextField();
                                bookedition_lbl = new javax.swing.JLabel();
                                bookedition_txt = new javax.swing.JTextField();
                                bookprice_label = new javax.swing.JLabel();
                                bookprice_txt = new javax.swing.JTextField();
                                bookborrowdate_label = new javax.swing.JLabel();
                                bookborrowdate_btn = new javax.swing.JButton();
                                bookduedate_label = new javax.swing.JLabel();
                                bookduedate_btn = new javax.swing.JButton();
                                borrowingstudentsdata_panel = new javax.swing.JPanel();
                                borroweraccnumber_label = new javax.swing.JLabel();
                                borroweraccnumber_txt = new javax.swing.JTextField();
                                borrowername_label = new javax.swing.JLabel();
                                borrowername_txt = new javax.swing.JTextField();
                                borrowersex_label = new javax.swing.JLabel();
                                borrowerphone_label = new javax.swing.JLabel();
                                borrowerphone_txt = new javax.swing.JTextField();
                                borrowersex_txt = new javax.swing.JTextField();
                                borroweremail_label = new javax.swing.JLabel();
                                email_txt = new javax.swing.JTextField();
                                borroweraddress_label = new javax.swing.JLabel();
                                borroweraddresstextarea_scrollpane = new javax.swing.JScrollPane();
                                borroweraddress_textarea = new javax.swing.JTextArea();
                                borrowerimagelabelholder_panel = new javax.swing.JPanel();
                                imagedestination_label = new javax.swing.JLabel();
                                borrowingtransmit_btn = new javax.swing.JButton();
                                exit_btn = new javax.swing.JButton();
                                borrowingprint_btn = new javax.swing.JButton();
				
				bookaccnumber_txt.setToolTipText("Enter Text and Press TAB");
				borroweraccnumber_txt.setToolTipText("Enter Text and Press TAB");
				
                                bookborrowings_panel.setBackground(new java.awt.Color(255, 255, 204));

                                booksborrowingcomponentholder_panel.setBackground(new java.awt.Color(102, 102, 255));

                                borrowingbooksdata_panel.setBackground(new java.awt.Color(204, 204, 255));

                                bookaccnumber_label.setText("Enter the Book Account Number :");

                                booktitle_label.setText("Book Title :");

                                booktitle_txt.setBackground(new java.awt.Color(255, 255, 255));
                                booktitle_txt.setEditable(false);

                                bookauthor_label.setText("Author :");

                                bookauthor_txt.setBackground(new java.awt.Color(255, 255, 255));
                                bookauthor_txt.setEditable(false);

                                bookpublisher_label.setText("Publisher :");

                                bookpublisher_txt.setBackground(new java.awt.Color(255, 255, 255));
                                bookpublisher_txt.setEditable(false);

                                bookedition_lbl.setText("Edition :");

                                bookedition_txt.setBackground(new java.awt.Color(255, 255, 255));
                                bookedition_txt.setEditable(false);

                                bookprice_label.setText("Price :");

                                bookprice_txt.setBackground(new java.awt.Color(255, 255, 255));
                                bookprice_txt.setEditable(false);

                                bookborrowdate_label.setText("Borrow Date :");

                                bookduedate_label.setText("Due Date : ");
				
				borrowingstudentsdata_panel.setBackground(new java.awt.Color(204, 204, 255));
                                borrowingstudentsdata_panel.setAutoscrolls(true);

                                borroweraccnumber_label.setText("Enter the Borrower Account Number :");

                                borrowername_label.setText("Borrower Name :");

                                borrowername_txt.setBackground(new java.awt.Color(255, 255, 255));
                                borrowername_txt.setEditable(false);

                                borrowersex_label.setText("Sex :");

                                borrowerphone_label.setText("Phone Number :");

                                borrowerphone_txt.setBackground(new java.awt.Color(255, 255, 255));
                                borrowerphone_txt.setEditable(false);

                                borrowersex_txt.setBackground(new java.awt.Color(255, 255, 255));
                                borrowersex_txt.setEditable(false);

                                borroweremail_label.setText("E-Mail :");

                                email_txt.setBackground(new java.awt.Color(255, 255, 255));
                                email_txt.setEditable(false);

                                borroweraddress_label.setText("Address :");

                                borroweraddress_textarea.setColumns(20);
                                borroweraddress_textarea.setEditable(false);
                                borroweraddress_textarea.setRows(5);
                                borroweraddress_textarea.setAutoscrolls(false);
                                borroweraddresstextarea_scrollpane.setViewportView(borroweraddress_textarea);

                                borrowerimagelabelholder_panel.setBackground(new java.awt.Color(204, 204, 255));

                                imagedestination_label.setToolTipText("Image of the Borrower");
                                imagedestination_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
				
				exit_btn.setText("Exit");

                                borrowingprint_btn.setText("Print Transaction");			
								
				borrowingtransmit_btn.setText("Transmit Transaction");	
				
				Date d = new Date();
				
				String s = formatDate(d);
				
				bookborrowdate_btn.setText(s);
				bookduedate_btn.setText(s);
				
				bookborrowdate_btn.setToolTipText("Click to change the Borrow Date");
				bookduedate_btn.setToolTipText("Click to change the Due Date");
				
				exit_btn.setEnabled(false);
				exit_btn.setVisible(false);
		}
		
		private String formatDate(Date date) 
		{
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return format.format(date);
		}
}