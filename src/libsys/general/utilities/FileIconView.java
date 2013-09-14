package libsys.general.utilities;

import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.filechooser.FileView;
import libsys.general.LIBSYSSystem;

public class FileIconView extends FileView
{
               MyFileFilter file_filter;
               
               ImageIcon icon;
               
               public FileIconView(MyFileFilter filter)
               {
                              file_filter = filter;
                              
                              icon = new ImageIcon(LIBSYSSystem.ThumbnailImage);
                              
                              icon = new ImageIcon(icon.getImage().getScaledInstance(30, -1, Image.SCALE_SMOOTH));
               }
               
               public Icon getIcon(File f)
               {
                              if(!f.isDirectory() && file_filter.accept(f))
                              {
                                             return icon;
                              }
                              else
                              {
                                             return null;
                              }
               }               
}
