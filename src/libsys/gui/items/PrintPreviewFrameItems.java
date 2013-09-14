package libsys.gui.items;

import javax.swing.JEditorPane;
import javax.swing.JTable;
import javax.swing.JTextPane;

public class PrintPreviewFrameItems
{
		public javax.swing.JTextArea footer_textarea;
                public javax.swing.JTextArea header_textarea;
                public javax.swing.JLabel jLabel1;
                public javax.swing.JLabel jLabel2;
                public javax.swing.JPanel jPanel1;
                public javax.swing.JPanel jPanel2;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JScrollPane jScrollPane2;
                public javax.swing.JPanel main_panel;
                public javax.swing.JPanel parameters_panel;
                public javax.swing.JScrollPane preview_scrollpane;
                public javax.swing.JButton print_btn;
                public javax.swing.JPanel tab_panel;
		
		public JEditorPane EditorPane;
		public JTable ResultsTable;
		
		public String Component;
		
		public PrintPreviewFrameItems()
		{
				main_panel = new javax.swing.JPanel();
                                tab_panel = new javax.swing.JPanel();
                                parameters_panel = new javax.swing.JPanel();
                                jLabel1 = new javax.swing.JLabel();
                                jScrollPane1 = new javax.swing.JScrollPane();
                                header_textarea = new javax.swing.JTextArea();
                                jLabel2 = new javax.swing.JLabel();
                                jScrollPane2 = new javax.swing.JScrollPane();
                                footer_textarea = new javax.swing.JTextArea();
                                jPanel1 = new javax.swing.JPanel();
                                jPanel2 = new javax.swing.JPanel();
                                preview_scrollpane = new javax.swing.JScrollPane();
                                print_btn = new javax.swing.JButton();

                                main_panel.setBackground(new java.awt.Color(255, 255, 204));

                                tab_panel.setBackground(new java.awt.Color(204, 204, 255));

                                parameters_panel.setBackground(new java.awt.Color(204, 204, 255));
                                parameters_panel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0), javax.swing.BorderFactory.createTitledBorder(null, "Header and Footer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0)))); // NOI18N

                                jLabel1.setText("Header :");

                                header_textarea.setColumns(20);
                                header_textarea.setRows(5);
                                jScrollPane1.setViewportView(header_textarea);

                                jLabel2.setText("Footer :");

                                footer_textarea.setColumns(20);
                                footer_textarea.setRows(5);
                                jScrollPane2.setViewportView(footer_textarea);
				
				jPanel1.setBackground(new java.awt.Color(204, 204, 255));
                                jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1), javax.swing.BorderFactory.createTitledBorder(null, "Print Preview", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 0)))); // NOI18N

                                jPanel2.setBackground(new java.awt.Color(102, 102, 255));
				
				print_btn.setText("Print");
				
				EditorPane = new JEditorPane();
				EditorPane.setContentType("text/html;charset=EUC-JP");
		}
}
