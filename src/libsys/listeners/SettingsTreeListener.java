package libsys.listeners;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import libsys.gui.MyFrame;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;
import libsys.gui.items.SettingsFrameItems;
import libsys.general.LIBSYSSystem;

public class SettingsTreeListener implements TreeSelectionListener
{		
		LIBSYSSystem LibrarySystem;
		
		public SettingsTreeListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void valueChanged(TreeSelectionEvent te)
		{
				TreePath path = LibrarySystem.FrameItems.settingsFrameItems.settings_tree.getSelectionPath();
				
				if(path == null)
				{
						return;
				}
				
				DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
				
				String leaf = node.getUserObject().toString();
				
				if(leaf.equals("Fonts"))
				{
						LibrarySystem.loadSettingsFontsPanel();
				}
				
				else if(leaf.equals("Color Themes"))
				{
						LibrarySystem.loadColorThemeChangePanel();
				}
				
				else if(leaf.equals("Library Settings"))
				{
						LibrarySystem.loadSettingsLibrarySettingsPanel();
				}
				else if(leaf.equals("Windows Interface"))
				{
						LibrarySystem.loadSettingsInterfacePanel();
						
						ImageIcon icon = new ImageIcon("Windows.jpg");
						
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setText(null);						
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setIcon(icon);
						
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
				
				else if(leaf.equals("Metal Interface"))
				{
						LibrarySystem.loadSettingsInterfacePanel();
						
						ImageIcon icon = new ImageIcon("Metal.jpg");
						
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setText(null);
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setIcon(icon);
						
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
				
				else if(leaf.equals("Motif Interface"))
				{
						LibrarySystem.loadSettingsInterfacePanel();
						
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setIcon(null);
						LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setText("                                                       Motif Theme not available in your system");
						
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
		}	
}