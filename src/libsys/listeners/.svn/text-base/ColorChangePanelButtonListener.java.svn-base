package libsys.listeners;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SystemLogEvent;

public class ColorChangePanelButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public ColorChangePanelButtonListener(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Background"))
				{
						Color BackGroundColor = LibrarySystem.ColorChooser.showDialog(LibrarySystem.FrameList.SettingsFrame, "Change Background Color", Color.WHITE);
						
						if(BackGroundColor == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.changeColorPanelItems.background_panel.setBackground(BackGroundColor);
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
				
				if(ae.getActionCommand().equals("Foreground"))
				{
						Color ForeGroundColor = LibrarySystem.ColorChooser.showDialog(LibrarySystem.FrameList.SettingsFrame, "Change Background Color", Color.WHITE);
						
						if(ForeGroundColor == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel.setBackground(ForeGroundColor);
						LibrarySystem.FrameList.SettingsFrame.repaint();
				}
				
				if(ae.getActionCommand().equals("Apply Changes"))
				{
						addEventToLog();
						
						Color BackGroundColor = LibrarySystem.FrameItems.changeColorPanelItems.background_panel.getBackground();
						Color ForeGroundColor = LibrarySystem.FrameItems.changeColorPanelItems.foreground_panel.getBackground();
						
						LibrarySystem.settingsManager.saveSettings(String.valueOf(BackGroundColor.getRed()), LibrarySystem.SettingsFile, 13);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(BackGroundColor.getGreen()), LibrarySystem.SettingsFile, 14);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(BackGroundColor.getBlue()), LibrarySystem.SettingsFile, 15);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(ForeGroundColor.getRed()), LibrarySystem.SettingsFile, 16);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(ForeGroundColor.getGreen()), LibrarySystem.SettingsFile, 17);
						LibrarySystem.settingsManager.saveSettings(String.valueOf(ForeGroundColor.getBlue()), LibrarySystem.SettingsFile, 18);
						
						LibrarySystem.backgroundColorChanger.setBackgroundColor(BackGroundColor);
						LibrarySystem.foregroundColorChanger.setForeGroundColor(ForeGroundColor);
						
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.SettingsFrame, "New Settings applied successfully");
				}
		}
		
		private void addEventToLog()
		{
				SystemLogEvent Event = new SystemLogEvent();
				Date date = new Date();
				
				Event.EventID = 8;
				Event.EventName = "Application Color Theme changed.";
				Event.Username = LibrarySystem.userAccountManager.getCurrentUser();
				Event.EventTime = date.toString();
				
				LibrarySystem.systemLogManager.addEventToLogFile(Event, LibrarySystem.SystemLogFile);
		}		
}
