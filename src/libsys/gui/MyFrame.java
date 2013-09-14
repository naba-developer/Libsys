package libsys.gui;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MyFrame extends JFrame
{
	       public String frameName;
               
               public MyFrame(String frameName)
               {
			      this.frameName = frameName; 
                              setTitle("LibrarySystem - " + frameName);                              
                              setSize(600, 600);
                              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                              setLocation(50, 50);
                                                            
                              try
                              {
                                             Image image = Toolkit.getDefaultToolkit().getImage("AppData\\ImageFiles\\Icon.PNG");
                                             setIconImage(image);
                              }
                              catch(Exception ex)
                              {
                                             ex.printStackTrace();
                              }                       
               }      
}