package libsys.gui.items;

import javax.swing.JTable;

public class AllBorrowersPanelItems
{
		public javax.swing.JButton display_btn;
                public javax.swing.JPanel displaybutton_panel;
                public javax.swing.JCheckBox orderbyborrowername_checkbox;
                public javax.swing.JCheckBox orderbyborroweraccnumber_checkbox;
                public javax.swing.JPanel orderbypanel1_panel;
                public javax.swing.JPanel orderbypanel2_panel;
                public javax.swing.JButton print_btn;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JPanel searchresults_Panel;
                public javax.swing.JLabel searchresults_label;
                public javax.swing.JScrollPane searchresultstable_scrollpane;
                public javax.swing.JLabel selectvieworder_label;
                public javax.swing.JScrollPane tabpanel_scrollpane;
                public javax.swing.JTextArea transactions_textarea;
                public javax.swing.JPanel viewbooks_panel;
                public javax.swing.JPanel viewsettings_panel;
		public javax.swing.ButtonGroup buttonGroup1;
		
		public JTable ResultsTable;
		
		public AllBorrowersPanelItems()
		{
                                tabpanel_scrollpane = new javax.swing.JScrollPane();
                                viewbooks_panel = new javax.swing.JPanel();
                                viewsettings_panel = new javax.swing.JPanel();
                                orderbypanel1_panel = new javax.swing.JPanel();
                                selectvieworder_label = new javax.swing.JLabel();
                                orderbyborroweraccnumber_checkbox = new javax.swing.JCheckBox();
                                orderbyborrowername_checkbox = new javax.swing.JCheckBox();
                                orderbypanel2_panel = new javax.swing.JPanel();
                                displaybutton_panel = new javax.swing.JPanel();
                                display_btn = new javax.swing.JButton();
                                searchresults_Panel = new javax.swing.JPanel();
                                searchresultstable_scrollpane = new javax.swing.JScrollPane();
                                transactions_textarea = new javax.swing.JTextArea();
                                searchresults_label = new javax.swing.JLabel();
                                print_btn = new javax.swing.JButton();
                                searchprogress_progressbar = new javax.swing.JProgressBar();
                                searchprogress_label = new javax.swing.JLabel();
				buttonGroup1 = new javax.swing.ButtonGroup();

                                viewbooks_panel.setBackground(new java.awt.Color(102, 102, 255));

                                viewsettings_panel.setBackground(new java.awt.Color(204, 204, 255));

                                orderbypanel1_panel.setBackground(new java.awt.Color(204, 204, 255));

                                selectvieworder_label.setText("Select View Order :");

                                orderbyborroweraccnumber_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                orderbyborroweraccnumber_checkbox.setText("Order By Borrower Account Number");

                                orderbyborrowername_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                orderbyborrowername_checkbox.setText("Order By Borrower Name");
				
				orderbypanel2_panel.setBackground(new java.awt.Color(204, 204, 255));
				
				displaybutton_panel.setBackground(new java.awt.Color(204, 204, 255));

                                display_btn.setText("Display Borrowers");
				
				searchresults_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                transactions_textarea.setColumns(20);
                                transactions_textarea.setEditable(false);
                                transactions_textarea.setRows(5);
                                searchresultstable_scrollpane.setViewportView(transactions_textarea);

                                searchresults_label.setText(" Search Result :");

                                print_btn.setBackground(new java.awt.Color(102, 102, 255));
                                print_btn.setText("Print");

                                searchprogress_label.setText(" Search Progress :");
				
				tabpanel_scrollpane.setViewportView(viewbooks_panel);
				
				buttonGroup1.add(orderbyborrowername_checkbox);
				buttonGroup1.add(orderbyborroweraccnumber_checkbox);
		}
}
