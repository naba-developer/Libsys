package libsys.gui.items;

public class SettingsLibrarySettingsPanelItems
{
		public javax.swing.JButton clearpassword_btn;
                public javax.swing.JLabel passwordsettings_label;
                public javax.swing.JPanel passwordsettings_panel;
                public javax.swing.JCheckBox savedatabasequeryinformation_checkbox;
                public javax.swing.JCheckBox savedatadeleteinformation_checkbox;
                public javax.swing.JCheckBox savedataentryinformation_checkbox;
                public javax.swing.JCheckBox savedatasearchinformation_checkbox;
                public javax.swing.JCheckBox savedataupdateinformation_checkbox;
                public javax.swing.JCheckBox savelockopeninformation_checkbox;
                public javax.swing.JCheckBox saveloginlogoffinformation_checkbox;
                public javax.swing.JCheckBox savesystemlogclearanceinformation_checkbox;
                public javax.swing.JPanel scrollbar_panel;
                public javax.swing.JCheckBox selectall_checkbox;
                public javax.swing.JScrollPane settingslist_scrollpane;
                public javax.swing.JLabel systemlogsettings_label;
                public javax.swing.JPanel systemlogsettings_panel;
		public javax.swing.JButton applychanges_btn;
                public javax.swing.JPanel settingslistscrollpane_panel;
		
		public SettingsLibrarySettingsPanelItems()
		{
				settingslist_scrollpane = new javax.swing.JScrollPane();
                                scrollbar_panel = new javax.swing.JPanel();
                                passwordsettings_panel = new javax.swing.JPanel();
                                passwordsettings_label = new javax.swing.JLabel();
                                clearpassword_btn = new javax.swing.JButton();
                                systemlogsettings_panel = new javax.swing.JPanel();
                                systemlogsettings_label = new javax.swing.JLabel();
                                saveloginlogoffinformation_checkbox = new javax.swing.JCheckBox();
                                savelockopeninformation_checkbox = new javax.swing.JCheckBox();
                                selectall_checkbox = new javax.swing.JCheckBox();
                                savedataentryinformation_checkbox = new javax.swing.JCheckBox();
                                savedataupdateinformation_checkbox = new javax.swing.JCheckBox();
                                savedatadeleteinformation_checkbox = new javax.swing.JCheckBox();
                                savedatasearchinformation_checkbox = new javax.swing.JCheckBox();
                                savedatabasequeryinformation_checkbox = new javax.swing.JCheckBox();
                                savesystemlogclearanceinformation_checkbox = new javax.swing.JCheckBox();
                                settingslistscrollpane_panel = new javax.swing.JPanel();
                                settingslist_scrollpane = new javax.swing.JScrollPane();
                                applychanges_btn = new javax.swing.JButton();

                                settingslistscrollpane_panel.setBackground(new java.awt.Color(204, 102, 255));
				settingslistscrollpane_panel.setBorder(null);
                                scrollbar_panel.setBackground(new java.awt.Color(102, 102, 255));

                                passwordsettings_panel.setBackground(new java.awt.Color(204, 204, 255));

                                passwordsettings_label.setText("Password Settings :");

                                clearpassword_btn.setText("Clear My Password");
                                clearpassword_btn.setToolTipText("This will clear your user account password in case you checked the \"Remember Password\" option at login.");
				
				systemlogsettings_panel.setBackground(new java.awt.Color(204, 204, 255));

                                systemlogsettings_label.setText("System Log Settings :");

                                saveloginlogoffinformation_checkbox.setText("Save Log In/Log Off Information");

                                savelockopeninformation_checkbox.setText("Save Application Lock/Open Information");

                                selectall_checkbox.setText("Select All");

                                savedataentryinformation_checkbox.setText("Save Data Entry Log");

                                savedataupdateinformation_checkbox.setText("Save Data Update Information");

                                savedatadeleteinformation_checkbox.setText("Save Data Delete Information");

                                savedatasearchinformation_checkbox.setText("Save Data Search Information");

                                savedatabasequeryinformation_checkbox.setText("Save Database Query Information");

                                savesystemlogclearanceinformation_checkbox.setText("Save System Log Clearance Information");
				
				settingslist_scrollpane.setViewportView(scrollbar_panel);
				
				applychanges_btn.setText("Apply Changes");
				
				saveloginlogoffinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savelockopeninformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                selectall_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savedataentryinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savedataupdateinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savedatadeleteinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savedatasearchinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savedatabasequeryinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                savesystemlogclearanceinformation_checkbox.setBackground(new java.awt.Color(204, 204, 255));
		}
}
