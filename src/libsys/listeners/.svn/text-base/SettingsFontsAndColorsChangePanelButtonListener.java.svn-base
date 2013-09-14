package libsys.listeners;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;
import libsys.gui.MyFrame;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;

public class SettingsFontsAndColorsChangePanelButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public SettingsFontsAndColorsChangePanelButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Change Font Color"))
				{
						Color c = LibrarySystem.ColorChooser.showDialog(LibrarySystem.FrameList.SettingsFrame, "Choose a Font Color", Color.BLACK);
						
						int style = Font.PLAIN;
						int size = 12;
						
						if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Plain")
						{
								style = Font.PLAIN;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Bold")
						{
								style = Font.BOLD;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Italic")
						{
								style = Font.ITALIC;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Bold + Italic")
						{
								style = (Font.BOLD | Font.ITALIC);
						}
						
						size = Integer.parseInt(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_spinner.getValue().toString());
						
						LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_textpane.setFont(new Font(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox.getSelectedItem().toString(), style, size));
						LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_textpane.setForeground(c);
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
				
				if(ae.getActionCommand().equals("Apply Changes"))
				{
						addEventToLog();
						
						Color FontColor = LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.preview_textpane.getForeground();
						
						int style = Font.PLAIN;
						int size = 12;
						
						if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Plain")
						{
								style = Font.PLAIN;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Bold")
						{
								style = Font.BOLD;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Italic")
						{
								style = Font.ITALIC;
						}
						else if(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontstyle_combobox.getSelectedItem().toString() == "Bold + Italic")
						{
								style = (Font.BOLD | Font.ITALIC);
						}
						
						size = Integer.parseInt(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontsize_spinner.getValue().toString());
						
						Font FontFace = new Font(LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox.getSelectedItem().toString(), style, size);
						
						LibrarySystem.settingsManager.saveSettings(FontFace.getFontName(), LibrarySystem.SettingsFile, 8);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(FontColor.getRed()), LibrarySystem.SettingsFile, 9);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(FontColor.getGreen()), LibrarySystem.SettingsFile, 10);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(FontColor.getBlue()), LibrarySystem.SettingsFile, 11);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(FontFace.getSize()), LibrarySystem.SettingsFile, 12);
						
						LibrarySystem.fontChanger.setFont(FontFace, FontColor);
						
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.SettingsFrame, "New Fonts applied successfully");
				}
		}
		
		private void addEventToLog()
		{
				SystemLogEvent Event = new SystemLogEvent();
				Date date = new Date();
				
				Event.EventID = 8;
				Event.EventName = "Application Fonts changed.";
				Event.Username = LibrarySystem.userAccountManager.getCurrentUser();
				Event.EventTime = date.toString();
				
				LibrarySystem.systemLogManager.addEventToLogFile(Event, LibrarySystem.SystemLogFile);
		}
}