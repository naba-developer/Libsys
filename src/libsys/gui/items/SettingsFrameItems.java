package libsys.gui.items;

import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;

public class SettingsFrameItems
{
		public javax.swing.JPanel main_panel;
                public javax.swing.JTree settings_tree;
                public javax.swing.JPanel settingstree_panel;
                public javax.swing.JScrollPane settingstree_scrollpane;
                public javax.swing.JPanel tab_panel;
		
		public SettingsFrameItems()
		{
				main_panel = new javax.swing.JPanel();
                                settingstree_panel = new javax.swing.JPanel();
                                settingstree_scrollpane = new javax.swing.JScrollPane();
                                settings_tree = new javax.swing.JTree();
                                tab_panel = new javax.swing.JPanel();

                                main_panel.setBackground(new java.awt.Color(255, 255, 204));
				
				designSettingsTree();
		}
		
		private void designSettingsTree()
		{
				javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Settings");
                                javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Administrative Settings");
                                javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Library Settings");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fonts and Colors");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Fonts");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Color Themes");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                settings_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
				settingstree_scrollpane.setViewportView(settings_tree);
				
				DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
				renderer.setClosedIcon(new ImageIcon("AppData\\ImageFiles\\Plus.png"));
				renderer.setOpenIcon(new ImageIcon("AppData\\ImageFiles\\Minus.png"));
				renderer.setLeafIcon(new ImageIcon("AppData\\ImageFiles\\Leaf.png"));
				
				settings_tree.setCellRenderer(renderer);
				settings_tree.setRowHeight(20);
				settings_tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		}
}