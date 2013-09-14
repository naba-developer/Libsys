package libsys.gui.items;

import javax.swing.JTable;

public class TransactionPanelItems
{
		public javax.swing.JRadioButton currenttransactions_radiobutton;
                public javax.swing.JPanel customdate_panel;
                public javax.swing.JRadioButton customdaterange_radiobutton;
                public javax.swing.JButton deleteselected_btn;
                public javax.swing.JPanel parametersenter_panel;
                public javax.swing.JButton print_btn;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JPanel searchresults_Panel;
                public javax.swing.JLabel searchresults_label;
                public javax.swing.JScrollPane searchresultstable_scrollpane;
                public javax.swing.JPanel specificbuttongroup_panel;
                public javax.swing.JRadioButton specificdate_radiobutton;
                public javax.swing.JRadioButton specificmonth_radiobutton;
                public javax.swing.JRadioButton specificyear_radiobutton;
                public javax.swing.JScrollPane tabpanel_scrollpane;
                public javax.swing.JTextArea transactions_textarea;
                public javax.swing.JPanel transactionsparameters_panel;
                public javax.swing.ButtonGroup transactionviewtype_buttongroup;
                public javax.swing.JLabel transactionviewtype_label;
                public javax.swing.JPanel transactionviewtype_panel;
                public javax.swing.JPanel viewtransactions_panel;
		
		public JTable ResultsTable;
		
		public TransactionPanelItems()
		{
				transactionviewtype_buttongroup = new javax.swing.ButtonGroup();
                                tabpanel_scrollpane = new javax.swing.JScrollPane();
                                viewtransactions_panel = new javax.swing.JPanel();
                                transactionviewtype_panel = new javax.swing.JPanel();
                                transactionviewtype_label = new javax.swing.JLabel();
                                transactionsparameters_panel = new javax.swing.JPanel();
                                specificbuttongroup_panel = new javax.swing.JPanel();
                                specificdate_radiobutton = new javax.swing.JRadioButton();
                                specificmonth_radiobutton = new javax.swing.JRadioButton();
                                specificyear_radiobutton = new javax.swing.JRadioButton();
                                customdate_panel = new javax.swing.JPanel();
                                customdaterange_radiobutton = new javax.swing.JRadioButton();
                                currenttransactions_radiobutton = new javax.swing.JRadioButton();
                                parametersenter_panel = new javax.swing.JPanel();
                                searchresults_Panel = new javax.swing.JPanel();
                                searchresultstable_scrollpane = new javax.swing.JScrollPane();
                                transactions_textarea = new javax.swing.JTextArea();
                                searchresults_label = new javax.swing.JLabel();
                                print_btn = new javax.swing.JButton();
                                searchprogress_progressbar = new javax.swing.JProgressBar();
                                searchprogress_label = new javax.swing.JLabel();
                                deleteselected_btn = new javax.swing.JButton();

                                viewtransactions_panel.setBackground(new java.awt.Color(102, 102, 255));
                                viewtransactions_panel.setPreferredSize(new java.awt.Dimension(800, 700));

                                transactionviewtype_panel.setBackground(new java.awt.Color(204, 204, 255));

                                transactionviewtype_label.setText("Select the Transactions View Type :");

                                transactionsparameters_panel.setBackground(new java.awt.Color(204, 204, 255));

                                specificbuttongroup_panel.setBackground(new java.awt.Color(204, 204, 255));

                                specificdate_radiobutton.setBackground(new java.awt.Color(204, 204, 255));
                                transactionviewtype_buttongroup.add(specificdate_radiobutton);
                                specificdate_radiobutton.setText("Specific Date");

                                specificmonth_radiobutton.setBackground(new java.awt.Color(204, 204, 255));
                                transactionviewtype_buttongroup.add(specificmonth_radiobutton);
                                specificmonth_radiobutton.setText("Specific Month");

                                specificyear_radiobutton.setBackground(new java.awt.Color(204, 204, 255));
                                transactionviewtype_buttongroup.add(specificyear_radiobutton);
                                specificyear_radiobutton.setText("Specific Year");
				
				customdate_panel.setBackground(new java.awt.Color(204, 204, 255));

                                customdaterange_radiobutton.setBackground(new java.awt.Color(204, 204, 255));
                                transactionviewtype_buttongroup.add(customdaterange_radiobutton);
                                customdaterange_radiobutton.setText("Custom Date Range");

                                currenttransactions_radiobutton.setBackground(new java.awt.Color(204, 204, 255));
                                transactionviewtype_buttongroup.add(currenttransactions_radiobutton);
                                currenttransactions_radiobutton.setText("Current Transactions");
				
				parametersenter_panel.setBackground(new java.awt.Color(204, 204, 255));
				
				searchresults_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                transactions_textarea.setColumns(20);
				transactions_textarea.setEditable(false);
                                transactions_textarea.setRows(5);
                                searchresultstable_scrollpane.setViewportView(transactions_textarea);

                                searchresults_label.setText(" Search Result :");

                                print_btn.setBackground(new java.awt.Color(102, 102, 255));
                                print_btn.setText("Print");

                                searchprogress_label.setText(" Search Progress :");

                                deleteselected_btn.setText("Delete Selected");
				
				tabpanel_scrollpane.setViewportView(viewtransactions_panel);
				
				deleteselected_btn.setEnabled(false);
				deleteselected_btn.setVisible(false);
		}
}
