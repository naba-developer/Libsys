package libsys.gui.items;

public class InsertBorrowersPanelItems 
{		
		public javax.swing.JButton addborrower_btn;
                public javax.swing.JLabel borroweraccnumber_label;
                public javax.swing.JTextField borroweraccnumber_txt;
                public javax.swing.JLabel borroweraddress_label;
                public javax.swing.JTextArea borroweraddress_textarea;
                public javax.swing.JScrollPane borroweraddresstextarea_scrollpane;
                public javax.swing.JLabel borroweremail_label;
                public javax.swing.JPanel borrowerentry_panel;
                public javax.swing.JScrollPane borrowerentry_scrollpane;
                public javax.swing.JLabel borrowername_label;
                public javax.swing.JTextField borrowername_txt;
                public javax.swing.JLabel borrowerphone_label;
                public javax.swing.JTextField borrowerphone_txt;
                public javax.swing.JLabel borrowersex_label;
                public javax.swing.JComboBox borrowersex_combobox;
                public javax.swing.JButton browse_btn;
                public javax.swing.JTextField email_txt;
                public javax.swing.JLabel imagedestination_label;
                public javax.swing.JTextField imagepath_txt;
                public javax.swing.JButton print_btn;
                public javax.swing.JLabel uploadimage_label;
		
		public InsertBorrowersPanelItems() 
		{
				borrowerentry_scrollpane = new javax.swing.JScrollPane();
                                borrowerentry_panel = new javax.swing.JPanel();
                                borroweraccnumber_label = new javax.swing.JLabel();
                                borroweraccnumber_txt = new javax.swing.JTextField();
                                borrowername_label = new javax.swing.JLabel();
                                borrowername_txt = new javax.swing.JTextField();
                                borrowersex_label = new javax.swing.JLabel();
                                borrowersex_combobox = new javax.swing.JComboBox();
                                borrowerphone_label = new javax.swing.JLabel();
                                borrowerphone_txt = new javax.swing.JTextField();
                                borroweremail_label = new javax.swing.JLabel();
                                email_txt = new javax.swing.JTextField();
                                borroweraddress_label = new javax.swing.JLabel();
                                borroweraddresstextarea_scrollpane = new javax.swing.JScrollPane();
                                borroweraddress_textarea = new javax.swing.JTextArea();
                                uploadimage_label = new javax.swing.JLabel();
                                imagepath_txt = new javax.swing.JTextField();
                                browse_btn = new javax.swing.JButton();
                                imagedestination_label = new javax.swing.JLabel();
                                addborrower_btn = new javax.swing.JButton();
                                print_btn = new javax.swing.JButton();

                                borrowerentry_panel.setBackground(new java.awt.Color(204, 204, 255));

                                borroweraccnumber_label.setText("Borrower Account Number *:");

                                borrowername_label.setText("Borrower Name *:");

                                borrowersex_label.setText("Sex :");

                                borrowerphone_label.setText("Phone Number :");

                                borroweremail_label.setText("E-Mail :");

                                borroweraddress_label.setText("Address :");

                                borroweraddress_textarea.setColumns(20);
                                borroweraddress_textarea.setRows(5);
                                borroweraddress_textarea.setAutoscrolls(false);
                                borroweraddresstextarea_scrollpane.setViewportView(borroweraddress_textarea);

                                uploadimage_label.setText("Upload an Image :");

                                browse_btn.setText("Browse");

                                imagedestination_label.setToolTipText("Image of the Borrower");
                                imagedestination_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                                addborrower_btn.setText("Add Borrower");

                                print_btn.setText("Print");
				print_btn.setVisible(false);
				print_btn.setEnabled(false);
				
				borrowerentry_scrollpane.setViewportView(borrowerentry_panel);
				
				borrowersex_combobox.addItem("Male");
				borrowersex_combobox.addItem("Female");
		}		
}
