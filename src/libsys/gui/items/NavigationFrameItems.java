package libsys.gui.items;

import javax.swing.ImageIcon;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeSelectionModel;
import libsys.gui.MyMenuBar;

public class NavigationFrameItems
{
		public javax.swing.JPanel main_panel;
                public javax.swing.JTree navigation_tree;
                public javax.swing.JPanel tab_panel;
                public javax.swing.JPanel tree_panel;
                public javax.swing.JScrollPane tree_scrollpane;
		
		public MyMenuBar MainMenuBar;
		
		public NavigationFrameItems()
		{
				main_panel = new javax.swing.JPanel();
                                tree_panel = new javax.swing.JPanel();
                                tree_scrollpane = new javax.swing.JScrollPane();
                                navigation_tree = new javax.swing.JTree();
                                tab_panel = new javax.swing.JPanel();
				MainMenuBar = new MyMenuBar();
				
                                main_panel.setBackground(new java.awt.Color(255, 255, 204));

                                tree_panel.setBackground(new java.awt.Color(204, 204, 255));
                                
				designNavigationTree();
				
                                tree_scrollpane.setViewportView(navigation_tree);				
		}
		
		private void designNavigationTree()
		{
				javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Actions");
                                javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Transactions");
				
                                javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Borrowings");
                                treeNode2.add(treeNode3);
				
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Returns");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Insert New Record");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Insert Books");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Insert Borrowers");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Update Existing Record");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Update Books");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Update Borrowers");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Delete Existing Record");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Delete Books");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Delete Borrowers");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Search");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Search Books");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Search Borrowers");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Fines");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Payment");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Impose");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("View");
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("All Transactions");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("All Books");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("All Borrowers");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Borrower Records");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("All Fines");
                                treeNode2.add(treeNode3);
                                treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("System Log");
                                treeNode2.add(treeNode3);
                                treeNode1.add(treeNode2);
                                navigation_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
				
				DefaultTreeCellRenderer renderer = new DefaultTreeCellRenderer();
				renderer.setClosedIcon(new ImageIcon("AppData\\ImageFiles\\Plus.png"));
				renderer.setOpenIcon(new ImageIcon("AppData\\ImageFiles\\Minus.png"));
				renderer.setLeafIcon(new ImageIcon("AppData\\ImageFiles\\Leaf.png"));
				
				navigation_tree.setCellRenderer(renderer);
				navigation_tree.setRowHeight(20);
				navigation_tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		}
}