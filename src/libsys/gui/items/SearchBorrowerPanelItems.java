package libsys.gui.items;

import javax.swing.JTable;

public class SearchBorrowerPanelItems
{
		public javax.swing.JLabel borroweraccnumber_label;
                public javax.swing.JTextField borroweraccnumber_txt;
                public javax.swing.JLabel borrowername_label;
                public javax.swing.JTextField borrowername_txt;
                public javax.swing.JPanel borrowersearch_panel;
                public javax.swing.JButton print_btn;
                public javax.swing.JButton search_btn;
                public javax.swing.JPanel searchparameters_panel;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JLabel searchresult_label;
                public javax.swing.JScrollPane searchresult_scrollpane;
                public javax.swing.JPanel searchresults_panel;
                public javax.swing.JScrollPane tabpanel_scrollpane;
		
		public JTable ResultsTable;
		
		public SearchBorrowerPanelItems()
		{
				tabpanel_scrollpane = new javax.swing.JScrollPane();
                                borrowersearch_panel = new javax.swing.JPanel();
                                searchparameters_panel = new javax.swing.JPanel();
                                borroweraccnumber_txt = new javax.swing.JTextField();
                                borroweraccnumber_label = new javax.swing.JLabel();
                                borrowername_txt = new javax.swing.JTextField();
                                borrowername_label = new javax.swing.JLabel();
                                search_btn = new javax.swing.JButton();
                                searchresults_panel = new javax.swing.JPanel();
                                searchresult_scrollpane = new javax.swing.JScrollPane();
                                searchresult_label = new javax.swing.JLabel();
                                print_btn = new javax.swing.JButton();
                                searchprogress_label = new javax.swing.JLabel();
                                searchprogress_progressbar = new javax.swing.JProgressBar();

                                borrowersearch_panel.setBackground(new java.awt.Color(102, 102, 255));

                                searchparameters_panel.setBackground(new java.awt.Color(204, 204, 255));

                                borroweraccnumber_label.setText(" Borrower Account Number :");

                                borrowername_label.setText(" Borrower Name :");

                                search_btn.setBackground(new java.awt.Color(102, 102, 255));
                                search_btn.setText("Search");
				
				searchresults_panel.setBackground(new java.awt.Color(204, 204, 255));

                                searchresult_label.setText("Search Result :");

                                print_btn.setBackground(new java.awt.Color(102, 102, 255));
                                print_btn.setText("Print");

                                searchprogress_label.setText(" Search Progress :");
				
				tabpanel_scrollpane.setViewportView(borrowersearch_panel);
		}
}
