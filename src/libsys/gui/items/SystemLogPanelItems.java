package libsys.gui.items;

public class SystemLogPanelItems
{
		public javax.swing.JLabel blank1_label;
                public javax.swing.JLabel blank2_label;
                public javax.swing.JButton displaylog_btn;
                public javax.swing.JComboBox logduration_combobox;
                public javax.swing.JButton print_btn;
                public javax.swing.JPanel searchduration_panel;
                public javax.swing.JLabel searchprogress_label;
                public javax.swing.JProgressBar searchprogress_progressbar;
                public javax.swing.JPanel searchresults_Panel;
                public javax.swing.JLabel searchresults_label;
                public javax.swing.JScrollPane searchresultstable_scrollpane;
                public javax.swing.JCheckBox selectall_checkbox;
                public javax.swing.JLabel selectduration_label;
                public javax.swing.JLabel selectviewsettings_label;
                public javax.swing.JCheckBox systemlogclearance_checkbox;
                public javax.swing.JScrollPane tabpanel_scrollpane;
                public javax.swing.JTextArea systemlog_textarea;
                public javax.swing.JCheckBox viewapplicationlockopenlog_checkbox;
                public javax.swing.JCheckBox viewdatadeletelog_checkbox;
                public javax.swing.JCheckBox viewdataentrylog_checkbox;
                public javax.swing.JCheckBox viewdatasearchlog_checkbox;
                public javax.swing.JCheckBox viewdataupdatelog_checkbox;
                public javax.swing.JCheckBox viewlogonlogofflog_checkbox;
                public javax.swing.JPanel viewparameters1_panel;
                public javax.swing.JPanel viewparameters2_panel;
                public javax.swing.JPanel viewparameters3_panel;
                public javax.swing.JPanel viewsettings_panel;
                public javax.swing.JCheckBox viewsettingschangelog_checkbox;
                public javax.swing.JPanel viewsystemlog_panel;
		
		public SystemLogPanelItems()
		{
				tabpanel_scrollpane = new javax.swing.JScrollPane();
                                viewsystemlog_panel = new javax.swing.JPanel();
                                viewsettings_panel = new javax.swing.JPanel();
                                viewparameters1_panel = new javax.swing.JPanel();
                                selectviewsettings_label = new javax.swing.JLabel();
                                viewlogonlogofflog_checkbox = new javax.swing.JCheckBox();
                                viewapplicationlockopenlog_checkbox = new javax.swing.JCheckBox();
                                systemlogclearance_checkbox = new javax.swing.JCheckBox();
                                viewparameters2_panel = new javax.swing.JPanel();
                                blank1_label = new javax.swing.JLabel();
                                viewdataentrylog_checkbox = new javax.swing.JCheckBox();
                                viewdataupdatelog_checkbox = new javax.swing.JCheckBox();
                                viewdatadeletelog_checkbox = new javax.swing.JCheckBox();
                                viewparameters3_panel = new javax.swing.JPanel();
                                blank2_label = new javax.swing.JLabel();
                                viewdatasearchlog_checkbox = new javax.swing.JCheckBox();
                                viewsettingschangelog_checkbox = new javax.swing.JCheckBox();
                                selectall_checkbox = new javax.swing.JCheckBox();
                                searchduration_panel = new javax.swing.JPanel();
                                selectduration_label = new javax.swing.JLabel();
                                logduration_combobox = new javax.swing.JComboBox();
                                displaylog_btn = new javax.swing.JButton();
                                searchresults_Panel = new javax.swing.JPanel();
                                searchresultstable_scrollpane = new javax.swing.JScrollPane();
                                searchresults_label = new javax.swing.JLabel();
                                print_btn = new javax.swing.JButton();
                                searchprogress_progressbar = new javax.swing.JProgressBar();
                                searchprogress_label = new javax.swing.JLabel();
				systemlog_textarea = new javax.swing.JTextArea();

                                viewsystemlog_panel.setBackground(new java.awt.Color(102, 102, 255));

                                viewsettings_panel.setBackground(new java.awt.Color(204, 204, 255));

                                viewparameters1_panel.setBackground(new java.awt.Color(204, 204, 255));

                                selectviewsettings_label.setText("Select System Log View :");

                                viewlogonlogofflog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewlogonlogofflog_checkbox.setText("Log On/Log Off");

                                viewapplicationlockopenlog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewapplicationlockopenlog_checkbox.setText("LIBSYS Lock/Open");

                                systemlogclearance_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                systemlogclearance_checkbox.setText("System Log Clearance");
				
				viewparameters2_panel.setBackground(new java.awt.Color(204, 204, 255));

                                blank1_label.setText("        ");

                                viewdataentrylog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewdataentrylog_checkbox.setText("Data Entry Log");

                                viewdataupdatelog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewdataupdatelog_checkbox.setText("Data Update Log");

                                viewdatadeletelog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewdatadeletelog_checkbox.setText("Data Delete Log");
				
				viewparameters3_panel.setBackground(new java.awt.Color(204, 204, 255));

                                blank2_label.setText("    ");

                                viewdatasearchlog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewdatasearchlog_checkbox.setText("Data Search Log");

                                viewsettingschangelog_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                viewsettingschangelog_checkbox.setText("Settings Change Log");

                                selectall_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                selectall_checkbox.setText("Select All");
				
				searchduration_panel.setBackground(new java.awt.Color(204, 204, 255));

                                selectduration_label.setBackground(new java.awt.Color(204, 204, 255));
                                selectduration_label.setText("Select Duration of Log :");

                                logduration_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Today", "This Week", "This Month", "This Year", "Entire System Log" }));

                                displaylog_btn.setText("Display Log");
				
				searchresults_Panel.setBackground(new java.awt.Color(204, 204, 255));

                                searchresults_label.setText(" Search Result :");

                                print_btn.setBackground(new java.awt.Color(102, 102, 255));
                                print_btn.setText("Print");

                                searchprogress_label.setText(" Search Progress :");
				
				tabpanel_scrollpane.setViewportView(viewsystemlog_panel);
				searchresultstable_scrollpane.setViewportView(systemlog_textarea);
				
				systemlog_textarea.setEditable(false);
		}
}
