package libsys.gui.items;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;


public class SettingsFontsAndColorsPanelItems
{
		public javax.swing.JButton applychanges_btn;
                public javax.swing.JButton fontcolor_btn;
                public javax.swing.JLabel fontface_label;
                public javax.swing.JComboBox fontfacelist_combobox;
                public javax.swing.JScrollPane fonts_scrollpane;
                public javax.swing.JLabel fontsize_label;
                public javax.swing.JSpinner fontsize_spinner;
                public javax.swing.JComboBox fontstyle_combobox;
                public javax.swing.JLabel fontstyle_label;
                public javax.swing.JPanel preview_panel;
                public javax.swing.JScrollPane preview_scrollpane;
                public javax.swing.JTextPane preview_textpane;
                public javax.swing.JLabel previewchange_label;
                public javax.swing.JPanel previewscrollpaneholder_panel;
                public javax.swing.JPanel tab_panel;
		
		public SettingsFontsAndColorsPanelItems()
		{
                                tab_panel = new javax.swing.JPanel();
                                fonts_scrollpane = new javax.swing.JScrollPane();
                                preview_panel = new javax.swing.JPanel();
                                fontface_label = new javax.swing.JLabel();
                                fontfacelist_combobox = new javax.swing.JComboBox();
                                fontsize_label = new javax.swing.JLabel();
                                fontsize_spinner = new javax.swing.JSpinner();
                                fontstyle_label = new javax.swing.JLabel();
                                fontstyle_combobox = new javax.swing.JComboBox();
                                fontcolor_btn = new javax.swing.JButton();
                                previewchange_label = new javax.swing.JLabel();
                                previewscrollpaneholder_panel = new javax.swing.JPanel();
                                preview_scrollpane = new javax.swing.JScrollPane();
                                preview_textpane = new javax.swing.JTextPane();
                                applychanges_btn = new javax.swing.JButton();

                                tab_panel.setBackground(new java.awt.Color(204, 204, 255));

                                preview_panel.setBackground(new java.awt.Color(204, 204, 255));

                                fontface_label.setText("Font Face :");

                                fontsize_label.setText("Font Size :");

                                fontsize_spinner.setModel(new javax.swing.SpinnerNumberModel(11, 5, 20, 1));

                                fontstyle_label.setText("Font Style :");

                                fontstyle_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plain", "Bold", "Italic", "Bold + Italic" }));

                                fontcolor_btn.setText("Change Font Color");

                                previewchange_label.setText("Preview Changes :");

                                preview_textpane.setEditable(false);				
                                preview_textpane.setText("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n\n\nthe quick brown fox jumps over the lazy dog");
                                preview_scrollpane.setViewportView(preview_textpane);
				
				applychanges_btn.setText("Apply Changes");
				
				fonts_scrollpane.setViewportView(preview_panel);
				
				addFontNames();
		}
		
		public void addFontNames()
		{
				String [] f = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
				
				int index = 0, temp = 0;
				
				for(int i = 0; i < f.length; i++)
				{
						if(f[i].equals("Bookshelf Symbol 7"))
						{
								continue;
						}
						
						else if(f[i].equals("Estrangelo Edessa"))
						{
								continue;
						}
						
						else if(f[i].equals("Euro Sign"))
						{
								continue;
						}
						
						else if(f[i].equals("Gautami"))
						{
								continue;
						}
						
						else if(f[i].equals("Latha"))
						{
								continue;
						}
						
						else if(f[i].equals("Mangal"))
						{
								continue;
						}
						
						else if(f[i].equals("Marlett"))
						{
								continue;
						}
						
						else if(f[i].equals("MS Outlook"))
						{
								continue;
						}
						
						else if(f[i].equals("MS Reference Specialty"))
						{
								continue;
						}
						
						else if(f[i].equals("MT Extra"))
						{
								continue;
						}
						
						else if(f[i].equals("MV Boli"))
						{
								continue;
						}
						
						else if(f[i].equals("Raavi"))
						{
								continue;
						}
						
						else if(f[i].equals("Shruti"))
						{
								continue;
						}
						
						else if(f[i].equals("Symbol"))
						{
								continue;
						}
						
						else if(f[i].equals("Tunga"))
						{
								continue;
						}
						
						else if(f[i].equals("Webdings"))
						{
								continue;
						}
						
						else if(f[i].equals("Wingdings"))
						{
								continue;
						}
						
						else if(f[i].equals("Wingdings 2"))
						{
								continue;
						}
						
						else if(f[i].equals("Wingdings 3"))
						{
								continue;
						}
						
						else if(f[i].equals("ZWAdobeF"))
						{
								continue;
						}
						
						fontfacelist_combobox.addItem(makeObject(f[i]));
						
						if(f[i].equals("Tahoma"))
						{
								index = temp;
						}
						
						temp++;
				}
				
				fontfacelist_combobox.setSelectedIndex(index);
		}
		
		public Object makeObject(final String item)
		{
				return new Object()
				{
						public String toString()
						{
								return item;
						}
				};
		}
}