package libsys.gui.items;

import javax.swing.JTable;
import javax.swing.SpinnerNumberModel;

public class DeleteBooksPanelItems
{
		public javax.swing.JLabel bookaccnumber_label;
                public javax.swing.JTextField bookaccnumber_txt;
                public javax.swing.JLabel bookauthor_label;
                public javax.swing.JTextArea bookauthor_textarea;
                public javax.swing.JLabel bookedition_label;
                public javax.swing.JSpinner bookedition_spinner;
                public javax.swing.JLabel bookpublisher_label;
                public javax.swing.JTextArea bookpublisher_textarea;
                public javax.swing.JPanel bookssearch_panel;
                public javax.swing.JScrollPane bookssearch_scrollpane;
                public javax.swing.JLabel booktitle_label;
                public javax.swing.JTextField booktitle_txt;
                public javax.swing.JButton deleteselected_btn;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JScrollPane jScrollPane2;
                public javax.swing.JScrollPane jScrollPane3;
                public javax.swing.JButton print_btn;
                public javax.swing.JButton search_btn;
                public javax.swing.JPanel searchparameters_Panel;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JPanel searchresults_Panel;
                public javax.swing.JLabel searchresults_label;
                public javax.swing.JScrollPane searchresultstable_scrollpane;
		
		public JTable ResultsTable;
		
		public DeleteBooksPanelItems()
		{
				bookssearch_scrollpane = new javax.swing.JScrollPane();
                                bookssearch_panel = new javax.swing.JPanel();
                                searchparameters_Panel = new javax.swing.JPanel();
                                bookaccnumber_txt = new javax.swing.JTextField();
                                jScrollPane1 = new javax.swing.JScrollPane();
                                bookpublisher_textarea = new javax.swing.JTextArea();
                                bookedition_spinner = new javax.swing.JSpinner();
                                bookaccnumber_label = new javax.swing.JLabel();
                                bookpublisher_label = new javax.swing.JLabel();
                                bookedition_label = new javax.swing.JLabel();
                                jScrollPane2 = new javax.swing.JScrollPane();
                                booktitle_txt = new javax.swing.JTextField();
                                booktitle_label = new javax.swing.JLabel();
                                jScrollPane3 = new javax.swing.JScrollPane();
                                bookauthor_textarea = new javax.swing.JTextArea();
                                bookauthor_label = new javax.swing.JLabel();
                                search_btn = new javax.swing.JButton();
                                searchresults_Panel = new javax.swing.JPanel();
                                searchresultstable_scrollpane = new javax.swing.JScrollPane();
                                searchresults_label = new javax.swing.JLabel();
                                print_btn = new javax.swing.JButton();
                                searchprogress_progressbar = new javax.swing.JProgressBar();
                                searchprogress_label = new javax.swing.JLabel();
                                deleteselected_btn = new javax.swing.JButton();

                                bookssearch_panel.setBackground(new java.awt.Color(102, 102, 255));

                                searchparameters_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                bookpublisher_textarea.setColumns(20);
                                bookpublisher_textarea.setRows(5);
                                jScrollPane1.setViewportView(bookpublisher_textarea);

                                bookaccnumber_label.setText("Book Account Number :");

                                bookpublisher_label.setText(" Publisher :");

                                bookedition_label.setText(" Edition :");
				
                                jScrollPane2.setViewportView(booktitle_txt);

                                booktitle_label.setText("Book Title :");

                                bookauthor_textarea.setColumns(20);
                                bookauthor_textarea.setRows(5);
                                jScrollPane3.setViewportView(bookauthor_textarea);

                                bookauthor_label.setText(" Author :");

                                search_btn.setBackground(new java.awt.Color(102, 102, 255));
                                search_btn.setText("Search");
				
				searchresults_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                searchresults_label.setText(" Search Result :");

                                print_btn.setBackground(new java.awt.Color(102, 102, 255));
                                print_btn.setText("Print");
				print_btn.setEnabled(false);
				print_btn.setVisible(false);
				
                                searchprogress_label.setText(" Search Progress :");

                                deleteselected_btn.setText("Delete Selected");
				
				bookssearch_scrollpane.setViewportView(bookssearch_panel);
				
				bookedition_spinner.setModel(new SpinnerNumberModel(1, 1, null, 1));
		}
}
