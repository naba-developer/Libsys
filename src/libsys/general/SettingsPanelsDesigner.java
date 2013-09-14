package libsys.general;

import java.awt.Dimension;
import libsys.general.LIBSYSSystem;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;

public class SettingsPanelsDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public SettingsPanelsDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void loadSettingsInterfacePanel()
		{
				LibrarySystem.FrameItems.settingsFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				
                                LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel.setLayout(null);
				LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel.setSize(new Dimension(421, 382));
				
				LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.setLayout(null);
				
				LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel.add(LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel);
				LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.setBounds(10, 10, 401, 331);
				
				LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.add(LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label);
				LibrarySystem.FrameItems.settingsInterfacePanelItems.imagedestination_label.setBounds(0, 0, 401, 331);
				
				LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel.add(LibrarySystem.FrameItems.settingsInterfacePanelItems.applytheme_button);
				LibrarySystem.FrameItems.settingsInterfacePanelItems.applytheme_button.setBounds(150, 351, 80, 25);

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.tab_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameItems.settingsInterfacePanelItems.interface_panel.setBounds(0, 0, 421, 382);
				//LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.setPreferredSize(new Dimension(401, 331));
				//LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.setSize(new Dimension(401, 331));
				//LibrarySystem.FrameItems.settingsInterfacePanelItems.imageholder_panel.setBounds(10, 10, 150, 150);
				
				LibrarySystem.FrameList.SettingsFrame.repaint();
		}
		
		public void loadLibrarySettingsPanel()
		{
				LibrarySystem.FrameItems.settingsFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				
				javax.swing.GroupLayout passwordsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_panel);
                                LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_panel.setLayout(passwordsettings_panelLayout);
                                passwordsettings_panelLayout.setHorizontalGroup(
                                                passwordsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(passwordsettings_panelLayout.createSequentialGroup()
                                                                .addGroup(passwordsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, passwordsettings_panelLayout.createSequentialGroup()
                                                                                                .addGap(53, 53, 53)
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.clearpassword_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, passwordsettings_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_label, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(165, Short.MAX_VALUE))
                                );
                                passwordsettings_panelLayout.setVerticalGroup(
                                                passwordsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(passwordsettings_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_label)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.clearpassword_btn)
                                                                .addContainerGap(41, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout systemlogsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_panel);
                                LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_panel.setLayout(systemlogsettings_panelLayout);
                                systemlogsettings_panelLayout.setHorizontalGroup(
                                                systemlogsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(systemlogsettings_panelLayout.createSequentialGroup()
                                                                .addGroup(systemlogsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(systemlogsettings_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_label, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.selectall_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(systemlogsettings_panelLayout.createSequentialGroup()
                                                                                                .addGap(56, 56, 56)
                                                                                                .addGroup(systemlogsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savelockopeninformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.saveloginlogoffinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataentryinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataupdateinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatadeleteinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatasearchinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatabasequeryinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savesystemlogclearanceinformation_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))))
                                                                .addContainerGap())
                                );
                                systemlogsettings_panelLayout.setVerticalGroup(
                                                systemlogsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(systemlogsettings_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(systemlogsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_label)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.selectall_checkbox))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.saveloginlogoffinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savelockopeninformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataentryinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedataupdateinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatadeleteinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatasearchinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savedatabasequeryinformation_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.savesystemlogclearanceinformation_checkbox)
                                                                .addContainerGap(21, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout scrollbar_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.scrollbar_panel);
                                LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.scrollbar_panel.setLayout(scrollbar_panelLayout);
                                scrollbar_panelLayout.setHorizontalGroup(
                                                scrollbar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                scrollbar_panelLayout.setVerticalGroup(
                                                scrollbar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(scrollbar_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.passwordsettings_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.systemlogsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
				
				javax.swing.GroupLayout settingslistscrollpane_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslistscrollpane_panel);
                                LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslistscrollpane_panel.setLayout(settingslistscrollpane_panelLayout);
                                settingslistscrollpane_panelLayout.setHorizontalGroup(
                                                settingslistscrollpane_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslist_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                );
                                settingslistscrollpane_panelLayout.setVerticalGroup(
                                                settingslistscrollpane_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslist_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.tab_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslistscrollpane_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.applychanges_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10))
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.settingslistscrollpane_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.settingsLibrarySettingsPanelItems.applychanges_btn)
                                                                .addContainerGap())
                                );
				
				LibrarySystem.FrameList.SettingsFrame.repaint();
		}
		
		public void loadChangeColorThemePanel()
		{
				LibrarySystem.FrameItems.settingsFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				
				javax.swing.GroupLayout foreground_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel);
                                LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel.setLayout(foreground_panelLayout);
                                foreground_panelLayout.setHorizontalGroup(
                                                foreground_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 373, Short.MAX_VALUE)
                                );
                                foreground_panelLayout.setVerticalGroup(
                                                foreground_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 244, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.changeColorPanelItems.background_panel);
                                LibrarySystem.FrameItems.changeColorPanelItems.background_panel.setLayout(background_panelLayout);
                                background_panelLayout.setHorizontalGroup(
                                                background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(background_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                background_panelLayout.setVerticalGroup(
                                                background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(background_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout preview_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.changeColorPanelItems.preview_panel);
                                LibrarySystem.FrameItems.changeColorPanelItems.preview_panel.setLayout(preview_panelLayout);
                                preview_panelLayout.setHorizontalGroup(
                                                preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.changeforegroundcolor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.changebackgroundcolor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(57, 57, 57))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preview_panelLayout.createSequentialGroup()
                                                                .addContainerGap(303, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.apply_btn)
                                                                .addContainerGap())
                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.prewiewchanges_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                preview_panelLayout.setVerticalGroup(
                                                preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.changeforegroundcolor_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.changebackgroundcolor_btn))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.prewiewchanges_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.apply_btn)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.tab_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.preview_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.changeColorPanelItems.preview_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.SettingsFrame.repaint();
		}
		
		public void loadSettingsFontsPanel()
		{
				LibrarySystem.FrameItems.settingsFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.SettingsFrame.repaint();
				
				javax.swing.GroupLayout previewscrollpaneholder_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewscrollpaneholder_panel);
                                LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewscrollpaneholder_panel.setLayout(previewscrollpaneholder_panelLayout);
                                previewscrollpaneholder_panelLayout.setHorizontalGroup(
                                                previewscrollpaneholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                );
                                previewscrollpaneholder_panelLayout.setVerticalGroup(
                                                previewscrollpaneholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout preview_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_panel);
                                LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_panel.setLayout(preview_panelLayout);
                                preview_panelLayout.setHorizontalGroup(
                                                preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontface_label, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addGap(39, 39, 39)))
                                                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(59, 59, 59)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addContainerGap(38, Short.MAX_VALUE))
                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontcolor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, preview_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.applychanges_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())
                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewscrollpaneholder_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(92, Short.MAX_VALUE))
                                                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewchange_label, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                                                                                .addGap(251, 251, 251))))
                                );
                                preview_panelLayout.setVerticalGroup(
                                                preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(preview_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontface_label)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(28, 28, 28)
                                                                .addGroup(preview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_label)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_label)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(39, 39, 39)
                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontcolor_btn)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewchange_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.previewscrollpaneholder_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.applychanges_btn)
                                                                .addContainerGap())
                                );                                

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.tab_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fonts_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fonts_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.SettingsFrame.repaint();
		}
}