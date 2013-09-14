package libsys.gui.items;

import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import libsys.Main;
import libsys.general.utilities.ErrorLogWriter;


public class AboutFrameItems 
{	
		public javax.swing.JEditorPane about_editorpane;
                public javax.swing.JScrollPane jScrollPane1;
                public javax.swing.JPanel main_panel;
                public javax.swing.JPanel tab_panel;
		
		public AboutFrameItems() 
		{
				main_panel = new javax.swing.JPanel();
                                tab_panel = new javax.swing.JPanel();
                                jScrollPane1 = new javax.swing.JScrollPane();
                                File f=new File("About.html");
                                byte[] b=new byte[(int)f.length()];
                                
                                try
                                {
						
						FileInputStream fin = new FileInputStream(f);
						fin.read(b);
						about_editorpane = new javax.swing.JEditorPane();
						about_editorpane.setEditable(false);
						
						java.net.URL AboutURL = Main.class.getResource("About.html");
						
						if(AboutURL != null)
						{
		                                                System.out.println("kjk");
		                                                about_editorpane.setPage(AboutURL);
						}
		                                else
		                                {
								about_editorpane.setContentType("text/html;charset=EUC-JP");
								about_editorpane.setText(new String(b));
						}                                
                                }
                                catch(Exception ex)
                                {
						ex.printStackTrace();
                                }

                                main_panel.setBackground(new java.awt.Color(255, 255, 204));

                                tab_panel.setBackground(new java.awt.Color(204, 204, 255));                               
                                
                                jScrollPane1.setViewportView(about_editorpane);
		}		
}
