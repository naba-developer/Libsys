package libsys.gui;

import java.awt.Font;
import java.awt.GraphicsEnvironment;
import javax.swing.JMenuBar;
import libsys.listeners.MainMenuBarListener;

public class MyMenuBar extends JMenuBar
{
		public javax.swing.JMenuItem aboutlibsys_menuitem;
                public javax.swing.JMenuItem addaccount_menuitem;
                public javax.swing.JMenuItem backupbooksdatabase_menuitem;
                public javax.swing.JMenuItem backupborrowersdatabase_menuitem;
                public javax.swing.JMenu backupdatabase_menu;
                public javax.swing.JMenuItem backupentiredatabase_menuitem;
                public javax.swing.JMenuItem backupfinesdatabase_menuitem;
                public javax.swing.JMenuItem backuptransactionsdatabase_menuitem;
                public javax.swing.JMenuItem calculator_menuitem;
                public javax.swing.JMenuItem clearsystemlog_menuitem;
                public javax.swing.JMenuItem connectdatabaseserver_menuitem;
                public javax.swing.JMenu database_menu;
                public javax.swing.JMenuItem deleteaccount_menuitem;
                public javax.swing.JMenuItem editaccount_menuitem;
                public javax.swing.JMenuItem exit_menuitem;
                public javax.swing.JMenu help_menu;
                public javax.swing.JMenuItem helpcontents_menuitem;
                public javax.swing.JSeparator jSeparator1;
                public javax.swing.JSeparator jSeparator2;
                public javax.swing.JSeparator jSeparator3;
                public javax.swing.JSeparator jSeparator4;
                public javax.swing.JSeparator jSeparator5;
                public javax.swing.JMenu libsys_menu;
                public javax.swing.JMenuItem loadbooksdatabase_menuitem;
                public javax.swing.JMenuItem loadborrowersdatabase_menuitem;
                public javax.swing.JMenu loaddatabase_menu;
                public javax.swing.JMenuItem loadentiredatabase_menuitem;
                public javax.swing.JMenuItem loadfinesdatabase_menuitem;
                public javax.swing.JMenuItem loadtransactionsdatabase_menuitem;
                public javax.swing.JMenuItem lock_menuitem;
                public javax.swing.JMenuItem logoff_menuitem;
                public javax.swing.JMenu server_menu;
                public javax.swing.JMenuItem settings_menuitem;
                public javax.swing.JMenuItem startdatabaseserver_menuitem;
                public javax.swing.JMenuItem stopdatabaseserver_menuitem;
                public javax.swing.JMenu tools_menu;
                public javax.swing.JScrollPane tree_scrollpane;
                public javax.swing.JMenu useraccounts_menu;
		public javax.swing.JMenuItem querybrowser_menuitem;
		
		public MyMenuBar()
		{
                                libsys_menu = new javax.swing.JMenu();
                                logoff_menuitem = new javax.swing.JMenuItem();
                                lock_menuitem = new javax.swing.JMenuItem();
                                exit_menuitem = new javax.swing.JMenuItem();
                                useraccounts_menu = new javax.swing.JMenu();
                                addaccount_menuitem = new javax.swing.JMenuItem();
                                editaccount_menuitem = new javax.swing.JMenuItem();
                                deleteaccount_menuitem = new javax.swing.JMenuItem();
                                database_menu = new javax.swing.JMenu();
                                server_menu = new javax.swing.JMenu();
                                startdatabaseserver_menuitem = new javax.swing.JMenuItem();
                                stopdatabaseserver_menuitem = new javax.swing.JMenuItem();
                                jSeparator4 = new javax.swing.JSeparator();
                                connectdatabaseserver_menuitem = new javax.swing.JMenuItem();
                                jSeparator5 = new javax.swing.JSeparator();
                                backupdatabase_menu = new javax.swing.JMenu();
                                backupbooksdatabase_menuitem = new javax.swing.JMenuItem();
                                backupborrowersdatabase_menuitem = new javax.swing.JMenuItem();
                                backuptransactionsdatabase_menuitem = new javax.swing.JMenuItem();
                                backupfinesdatabase_menuitem = new javax.swing.JMenuItem();
                                jSeparator2 = new javax.swing.JSeparator();
                                backupentiredatabase_menuitem = new javax.swing.JMenuItem();
                                loaddatabase_menu = new javax.swing.JMenu();
                                loadbooksdatabase_menuitem = new javax.swing.JMenuItem();
                                loadborrowersdatabase_menuitem = new javax.swing.JMenuItem();
                                loadtransactionsdatabase_menuitem = new javax.swing.JMenuItem();
                                loadfinesdatabase_menuitem = new javax.swing.JMenuItem();
                                jSeparator3 = new javax.swing.JSeparator();
                                loadentiredatabase_menuitem = new javax.swing.JMenuItem();
                                tools_menu = new javax.swing.JMenu();
                                calculator_menuitem = new javax.swing.JMenuItem();
                                settings_menuitem = new javax.swing.JMenuItem();
                                jSeparator1 = new javax.swing.JSeparator();
                                clearsystemlog_menuitem = new javax.swing.JMenuItem();
                                help_menu = new javax.swing.JMenu();
                                helpcontents_menuitem = new javax.swing.JMenuItem();
                                aboutlibsys_menuitem = new javax.swing.JMenuItem();
				querybrowser_menuitem = new javax.swing.JMenuItem();
				
				this.setBackground(new java.awt.Color(204, 204, 204));

                                libsys_menu.setText("LibrarySystem");

                                logoff_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
                                logoff_menuitem.setText("Log Off");
                                libsys_menu.add(logoff_menuitem);

                                lock_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
                                lock_menuitem.setText("Lock LibrarySystem");
                                libsys_menu.add(lock_menuitem);

                                exit_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
                                exit_menuitem.setText("Exit");
                                libsys_menu.add(exit_menuitem);

                                this.add(libsys_menu);

                                useraccounts_menu.setText("User Accounts");

                                addaccount_menuitem.setText("Add Guest Account");
                                useraccounts_menu.add(addaccount_menuitem);

                                editaccount_menuitem.setText("Edit Current Account");
                                useraccounts_menu.add(editaccount_menuitem);

                                deleteaccount_menuitem.setText("Delete Existing Guest Account");
                                useraccounts_menu.add(deleteaccount_menuitem);

                                this.add(useraccounts_menu);

                                database_menu.setText("Database");

                                server_menu.setText("Server");

                                startdatabaseserver_menuitem.setText("Start Database Server");
                                server_menu.add(startdatabaseserver_menuitem);

                                stopdatabaseserver_menuitem.setText("Stop Database Server");
                                server_menu.add(stopdatabaseserver_menuitem);
                                server_menu.add(jSeparator4);

                                connectdatabaseserver_menuitem.setText("Register a MySQL Database Account");
                                server_menu.add(connectdatabaseserver_menuitem);

                                database_menu.add(server_menu);
                                database_menu.add(jSeparator5);

                                backupdatabase_menu.setText("Backup Database");

                                backupentiredatabase_menuitem.setText("Backup Entire Database");
                                backupdatabase_menu.add(backupentiredatabase_menuitem);

                                database_menu.add(backupdatabase_menu);

                                loaddatabase_menu.setText("Load Database");

                                loadentiredatabase_menuitem.setText("Load Database from Backup File");
                                loaddatabase_menu.add(loadentiredatabase_menuitem);

                                database_menu.add(loaddatabase_menu);

                                this.add(database_menu);

                                tools_menu.setText("Tools");
				
				querybrowser_menuitem.setText("Query Browser");
				tools_menu.add(querybrowser_menuitem);

                                calculator_menuitem.setText("Calculator");
                                tools_menu.add(calculator_menuitem);
				
				clearsystemlog_menuitem.setText("Clear System Log");
                                tools_menu.add(clearsystemlog_menuitem);

				tools_menu.addSeparator();
				
                                settings_menuitem.setText("Settings");
                                tools_menu.add(settings_menuitem);           

                                this.add(tools_menu);

                                help_menu.setText("Help");

                                helpcontents_menuitem.setText("Help Contents");
                                help_menu.add(helpcontents_menuitem);

                                aboutlibsys_menuitem.setText("About LibrarySystem");
                                help_menu.add(aboutlibsys_menuitem);

                                this.add(help_menu);
		}
}