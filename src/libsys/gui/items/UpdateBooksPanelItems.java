package libsys.gui.items;

import javax.swing.JTable;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;

public class UpdateBooksPanelItems 
{
		public javax.swing.JPanel WorkSpaceBookEntry_Panel;
                public javax.swing.JLabel bookaccnumber_label;
                public javax.swing.JTextField bookaccnumber_txt;
                public javax.swing.JLabel bookauthor_label;
                public javax.swing.JTextArea bookauthor_textarea;
                public javax.swing.JLabel bookedition_label;
                public javax.swing.JSpinner bookedition_spinner;
                public javax.swing.JLabel bookpublisher_label;
                public javax.swing.JTextArea bookpublisher_textarea;
                public javax.swing.JLabel booktitle_label;
                public javax.swing.JTextField booktitle_txt;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JScrollPane jScrollPane2;
                public javax.swing.JScrollPane jScrollPane3;
                public javax.swing.JScrollPane jScrollPane4;
                public javax.swing.JLabel newbookaccnumber_label;
                public javax.swing.JTextField newbookaccnumber_txt;
                public javax.swing.JTextArea newbookauthor_txt;
                public javax.swing.JLabel newbookauthors_label;
                public javax.swing.JLabel newbookedition_label;
                public javax.swing.JSpinner newbookedition_spinner;
                public javax.swing.JLabel newbookprice_label;
                public javax.swing.JTextField newbookprice_txt;
                public javax.swing.JLabel newbookpublisher_label;
                public javax.swing.JTextField newbookpublisher_txt;
                public javax.swing.JLabel newbooktitle_label;
                public javax.swing.JTextField newbooktitle_txt;
                public javax.swing.JButton print_btn;
                public javax.swing.JButton search_btn;
                public javax.swing.JPanel searchbookstoupdate_panel;
                public javax.swing.JPanel searchparameters_Panel;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JPanel searchresults_Panel;
                public javax.swing.JLabel searchresults_label;
                public javax.swing.JScrollPane searchresultstable_scrollpane;
                public javax.swing.JButton submit_btn;
                public javax.swing.JPanel updatebook_panel;
                public javax.swing.JScrollPane updatebooks_scrollpane;
                public javax.swing.JTabbedPane updatebooks_tabbedpane;
		
		public JTable ResultsTable;
		
		public UpdateBooksPanelItems() 
		{
				updatebooks_scrollpane = new javax.swing.JScrollPane();
                                updatebooks_tabbedpane = new javax.swing.JTabbedPane();
                                searchbookstoupdate_panel = new javax.swing.JPanel();
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
                                updatebook_panel = new javax.swing.JPanel();
                                WorkSpaceBookEntry_Panel = new javax.swing.JPanel();
                                newbookaccnumber_txt = new javax.swing.JTextField();
                                newbookaccnumber_label = new javax.swing.JLabel();
                                newbooktitle_txt = new javax.swing.JTextField();
                                newbooktitle_label = new javax.swing.JLabel();
                                newbookauthors_label = new javax.swing.JLabel();
                                newbookpublisher_txt = new javax.swing.JTextField();
                                newbookpublisher_label = new javax.swing.JLabel();
                                newbookedition_label = new javax.swing.JLabel();
                                newbookprice_txt = new javax.swing.JTextField();
                                newbookprice_label = new javax.swing.JLabel();
                                submit_btn = new javax.swing.JButton();
                                newbookedition_spinner = new javax.swing.JSpinner();
                                jScrollPane4 = new javax.swing.JScrollPane();
                                newbookauthor_txt = new javax.swing.JTextArea();

                                searchbookstoupdate_panel.setBackground(new java.awt.Color(102, 102, 255));

                                searchparameters_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                bookpublisher_textarea.setColumns(20);
                                bookpublisher_textarea.setRows(5);
                                jScrollPane1.setViewportView(bookpublisher_textarea);

                                bookaccnumber_label.setText("Book Account Number *:");

                                bookpublisher_label.setText(" Publisher :");

                                bookedition_label.setText(" Edition :");

                                jScrollPane2.setViewportView(booktitle_txt);

                                booktitle_label.setText("Book Title *:");

                                bookauthor_textarea.setColumns(20);
                                bookauthor_textarea.setRows(5);
                                jScrollPane3.setViewportView(bookauthor_textarea);

                                bookauthor_label.setText(" Author :");

                                search_btn.setText("Search");
				
				searchresults_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                searchresults_label.setText(" Search Result :");
				
                                print_btn.setText("Print");
				print_btn.setEnabled(false);
				print_btn.setVisible(false);
				
                                searchprogress_label.setText(" Search Progress :");
				
				updatebooks_tabbedpane.addTab("Search Books To Update", searchbookstoupdate_panel);

                                WorkSpaceBookEntry_Panel.setBackground(new java.awt.Color(204, 204, 255));
				
				newbookaccnumber_label.setText("Enter The Book Account Number:");

                                newbooktitle_label.setText("Book Title :");

                                newbookauthors_label.setText("Author(s) :");

                                newbookpublisher_label.setText("Publisher :");

                                newbookedition_label.setText("Edition :");

                                newbookprice_label.setText("Price :");
				
                                submit_btn.setText("Submit");                               

                                newbookauthor_txt.setColumns(20);
                                newbookauthor_txt.setRows(5);
                                jScrollPane4.setViewportView(newbookauthor_txt);
				
				updatebooks_tabbedpane.addTab("Update Book", updatebook_panel);

                                updatebooks_scrollpane.setViewportView(updatebooks_tabbedpane);
				
				newbookedition_spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
		}		
}
