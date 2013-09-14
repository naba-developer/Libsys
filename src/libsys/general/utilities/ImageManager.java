package libsys.general.utilities;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import libsys.general.LIBSYSSystem;

public class ImageManager
{
		LIBSYSSystem LibrarySystem;
		
		public ImageManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public ImageIcon createImageIcon(ResultSet resultSet)
		{
				FileOutputStream fimage;
				ImageIcon icon = null;				
				byte image[];
				
				try
				{
						fimage = new FileOutputStream(LibrarySystem.ImageFile);
						image = resultSet.getBytes("image");
						fimage.write(image);
						
						fimage.close();
						
						icon = new ImageIcon(LibrarySystem.ImageFile);
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				
				return icon;
		}
		
		public void setImageToLabel(ImageIcon icon, JLabel imageDestination_label)
		{
				int width = imageDestination_label.getWidth();
				int height = imageDestination_label.getHeight();
				
				if(icon == null)
				{
						imageDestination_label.setText(null);
						imageDestination_label.setIcon(null);
						
						imageDestination_label.setText("Image not Available");
						
						return;
				}
				
				if(icon.getIconWidth() > width)
				{
						icon = new ImageIcon(icon.getImage().getScaledInstance(width, -1, Image.SCALE_SMOOTH));
						imageDestination_label.setIcon(icon);
				}
				else
				{
						icon = new ImageIcon(icon.getImage().getScaledInstance(-1, height, Image.SCALE_SMOOTH));
						imageDestination_label.setIcon(icon);
				}
		}
		
		public FileInputStream getImageFileInputStream(String FilePath)
		{
				try
				{
						FileInputStream fimage=new FileInputStream(FilePath);
						return fimage;
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				return null;
		}
}
