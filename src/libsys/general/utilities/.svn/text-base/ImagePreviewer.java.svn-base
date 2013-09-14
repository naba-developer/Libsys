package libsys.general.utilities;

import java.awt.Dimension;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class ImagePreviewer extends JLabel
{
               public ImagePreviewer(JFileChooser chooser)
               {
                              setPreferredSize(new Dimension(100, 100));
                              setBorder(BorderFactory.createEtchedBorder());
                              
                              chooser.addPropertyChangeListener(new PropertyChangeListener()
                              {
                                             public void propertyChange(PropertyChangeEvent pe)
                                             {
                                                            if(pe.getPropertyName() == JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
                                                            {
                                                                           File f = (File) pe.getNewValue();
                                                                           
                                                                           if(f == null)
                                                                           {
                                                                                          setIcon(null);
                                                                                          return;
                                                                           }
                                                                           
                                                                           ImageIcon icon = new ImageIcon(f.getPath());
                                                                           
                                                                           if(icon.getIconWidth() > 100)
                                                                           {
                                                                                          if(icon.getIconHeight() > 100)
                                                                                          {
                                                                                                         icon = new ImageIcon(icon.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH));
                                                                                          }
                                                                                          
                                                                                          else
                                                                                          {
                                                                                                         icon = new ImageIcon(icon.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH));
                                                                                          }
                                                                           }
                                                                           
                                                                           if(icon.getIconHeight() > 100)
                                                                           {
                                                                                          if(icon.getIconWidth() > 100)
                                                                                          {
                                                                                                         icon = new ImageIcon(icon.getImage().getScaledInstance(100, -1, Image.SCALE_SMOOTH));
                                                                                          }
                                                                                          
                                                                                          else
                                                                                          {
                                                                                                         icon = new ImageIcon(icon.getImage().getScaledInstance(-1, 100, Image.SCALE_SMOOTH));
                                                                                          }
                                                                           }
                                                                           
                                                                           setIcon(icon);
                                                            }
                                             }
                              });
               }
}