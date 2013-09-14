package libsys.gui.items;

public class InsertBooksPanelItems 
{
		public javax.swing.JScrollPane BookEntryScrollPanel;
                public javax.swing.JPanel WorkSpaceBookEntry_Panel;
                public javax.swing.JLabel bookaccnumber_label;
                public javax.swing.JTextField bookaccnumber_txt;
                public javax.swing.JLabel bookauthor_label;
                public javax.swing.JTextArea bookauthor_textarea;
                public javax.swing.JLabel bookedition_label;
                public javax.swing.JSpinner bookedition_spinner;
                public javax.swing.JLabel bookprice_label;
                public javax.swing.JTextField bookprice_txt;
                public javax.swing.JLabel bookpublisher_label;
                public javax.swing.JTextField bookpublisher_txt;
                public javax.swing.JLabel booktitle_label;
                public javax.swing.JTextField booktitle_txt;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JButton print_btn;
                public javax.swing.JButton submit_btn;
		
		public InsertBooksPanelItems() 
		{
				BookEntryScrollPanel = new javax.swing.JScrollPane();
                                WorkSpaceBookEntry_Panel = new javax.swing.JPanel();
                                bookaccnumber_txt = new javax.swing.JTextField();
                                bookaccnumber_label = new javax.swing.JLabel();
                                booktitle_txt = new javax.swing.JTextField();
                                booktitle_label = new javax.swing.JLabel();
                                bookauthor_label = new javax.swing.JLabel();
                                bookpublisher_txt = new javax.swing.JTextField();
                                bookpublisher_label = new javax.swing.JLabel();
                                bookedition_label = new javax.swing.JLabel();
                                bookprice_txt = new javax.swing.JTextField();
                                bookprice_label = new javax.swing.JLabel();
                                submit_btn = new javax.swing.JButton();
                                bookedition_spinner = new javax.swing.JSpinner();
                                jScrollPane1 = new javax.swing.JScrollPane();
                                bookauthor_textarea = new javax.swing.JTextArea();
                                print_btn = new javax.swing.JButton();

                                WorkSpaceBookEntry_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                bookaccnumber_label.setText("Book Account Number *:                  ");

                                booktitle_label.setText("Book Title *:");

                                bookauthor_label.setText("Author :");

                                bookpublisher_label.setText("Publisher :");

                                bookedition_label.setText("Edition :");

                                bookprice_label.setText("Price :");

                                submit_btn.setText("Submit");
                                bookedition_spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
                                
                                bookauthor_textarea.setColumns(20);
                                bookauthor_textarea.setRows(5);
                                jScrollPane1.setViewportView(bookauthor_textarea);

                                print_btn.setText("Print");
				print_btn.setVisible(false);
				print_btn.setEnabled(false);
				
				BookEntryScrollPanel.setViewportView(WorkSpaceBookEntry_Panel);
		}		
}
