package libsys.gui.items;

import javax.swing.JTable;

public class UpdateBorrowersPanelItems
{
		public javax.swing.JButton submit_btn;
                public javax.swing.JLabel borroweraccnumber_label;
                public javax.swing.JTextField borroweraccnumber_txt;
                public javax.swing.JScrollPane borroweraddresstextarea_scrollpane;
                public javax.swing.JPanel borrowerentry_panel;
                public javax.swing.JLabel borrowername_label;
                public javax.swing.JTextField borrowername_txt;
                public javax.swing.JButton browse_btn;
                public javax.swing.JLabel newborroweraccnumber_label1;
                public javax.swing.JTextField newborroweraccnumber_txt;
                public javax.swing.JLabel newborroweraddress_label;
                public javax.swing.JTextArea newborroweraddress_textarea;
                public javax.swing.JLabel newborroweremail_label;
                public javax.swing.JLabel newborrowername_label1;
                public javax.swing.JTextField newborrowername_txt;
                public javax.swing.JLabel newborrowerphone_label;
                public javax.swing.JTextField newborrowerphone_txt;
                public javax.swing.JLabel newborrowersex_label;
                public javax.swing.JTextField newborroweremail_txt;
                public javax.swing.JLabel newimagedestination_label;
                public javax.swing.JTextField newimagepath_txt;
                public javax.swing.JComboBox newborrowersex_combobox;
                public javax.swing.JLabel newuploadimage_label;
                public javax.swing.JButton printsearchresults_btn;
                public javax.swing.JButton printupdate_btn;
                public javax.swing.JButton search_btn;
                public javax.swing.JPanel searchborrowerstoupdate_panel;
                public javax.swing.JPanel searchparameters_panel;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JLabel searchresult_label;
                public javax.swing.JScrollPane searchresult_scrollpane;
                public javax.swing.JPanel searchresults_panel;
                public javax.swing.JPanel updatebook_panel;
                public javax.swing.JTabbedPane updateborrowers_tabbedpane;
		
		public JTable ResultsTable;
		
		public UpdateBorrowersPanelItems()
		{
				updateborrowers_tabbedpane = new javax.swing.JTabbedPane();
                                searchborrowerstoupdate_panel = new javax.swing.JPanel();
                                searchparameters_panel = new javax.swing.JPanel();
                                borroweraccnumber_txt = new javax.swing.JTextField();
                                borroweraccnumber_label = new javax.swing.JLabel();
                                borrowername_txt = new javax.swing.JTextField();
                                borrowername_label = new javax.swing.JLabel();
                                search_btn = new javax.swing.JButton();
                                searchresults_panel = new javax.swing.JPanel();
                                searchresult_scrollpane = new javax.swing.JScrollPane();
                                searchresult_label = new javax.swing.JLabel();
                                printsearchresults_btn = new javax.swing.JButton();
                                searchprogress_label = new javax.swing.JLabel();
                                searchprogress_progressbar = new javax.swing.JProgressBar();
                                updatebook_panel = new javax.swing.JPanel();
                                borrowerentry_panel = new javax.swing.JPanel();
                                newborroweraccnumber_label1 = new javax.swing.JLabel();
                                newborroweraccnumber_txt = new javax.swing.JTextField();
                                newborrowername_label1 = new javax.swing.JLabel();
                                newborrowername_txt = new javax.swing.JTextField();
                                newborrowersex_label = new javax.swing.JLabel();
                                newborrowerphone_label = new javax.swing.JLabel();
                                newborrowerphone_txt = new javax.swing.JTextField();
                                newborroweremail_label = new javax.swing.JLabel();
                                newborroweremail_txt = new javax.swing.JTextField();
                                newborroweraddress_label = new javax.swing.JLabel();
                                borroweraddresstextarea_scrollpane = new javax.swing.JScrollPane();
                                newborroweraddress_textarea = new javax.swing.JTextArea();
                                newuploadimage_label = new javax.swing.JLabel();
                                newimagepath_txt = new javax.swing.JTextField();
                                browse_btn = new javax.swing.JButton();
                                newimagedestination_label = new javax.swing.JLabel();
                                submit_btn = new javax.swing.JButton();
                                printupdate_btn = new javax.swing.JButton();
                                newborrowersex_combobox = new javax.swing.JComboBox();

                                updateborrowers_tabbedpane.setBackground(new java.awt.Color(204, 204, 255));

                                searchborrowerstoupdate_panel.setBackground(new java.awt.Color(102, 102, 255));

                                searchparameters_panel.setBackground(new java.awt.Color(204, 204, 255));

                                borroweraccnumber_label.setText(" Borrower Account Number :");

                                borrowername_label.setText(" Borrower Name :");

                                search_btn.setBackground(new java.awt.Color(102, 102, 255));
                                search_btn.setText("Search");
				
				searchresults_panel.setBackground(new java.awt.Color(204, 204, 255));

                                searchresult_label.setText("Search Result :");
				
                                printsearchresults_btn.setText("Print");
				printsearchresults_btn.setEnabled(false);
				printsearchresults_btn.setVisible(false);
				
                                searchprogress_label.setText(" Search Progress :");
				
				updateborrowers_tabbedpane.addTab("Search Borrowerss To Update", searchborrowerstoupdate_panel);

                                borrowerentry_panel.setBackground(new java.awt.Color(204, 204, 255));

                                newborroweraccnumber_label1.setText("Enter the new Borrower Account Number :");

                                newborrowername_label1.setText("New Borrower Name :");

                                newborrowersex_label.setText("New Sex :");

                                newborrowerphone_label.setText("New Phone Number :");

                                newborroweremail_label.setText("New E-Mail :");

                                newborroweraddress_label.setText("New Address :");

                                newborroweraddress_textarea.setColumns(20);
                                newborroweraddress_textarea.setRows(5);
                                newborroweraddress_textarea.setAutoscrolls(false);
                                borroweraddresstextarea_scrollpane.setViewportView(newborroweraddress_textarea);

                                newuploadimage_label.setText("Upload a new Image :");

                                browse_btn.setText("Browse");

                                newimagedestination_label.setToolTipText("Image of the Borrower");
                                newimagedestination_label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                                submit_btn.setText("Submit");

                                printupdate_btn.setText("Print");
				printupdate_btn.setVisible(false);
				printupdate_btn.setEnabled(false);

                                newborrowersex_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
				
				updateborrowers_tabbedpane.addTab("Update Selected Borrower", updatebook_panel);
		}
}
