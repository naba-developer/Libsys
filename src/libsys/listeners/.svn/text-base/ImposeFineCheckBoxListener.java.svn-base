package libsys.listeners;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import libsys.general.LIBSYSSystem;

public class ImposeFineCheckBoxListener implements ItemListener
{
		LIBSYSSystem LibrarySystem;
		
		public ImposeFineCheckBoxListener(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
				if(LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox.isSelected())
				{
						LibrarySystem.FrameItems.returnPanelItems.fineamount_label.setEnabled(true);
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setEnabled(true);
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setEditable(true);
						LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.setEnabled(true);
						LibrarySystem.FrameItems.returnPanelItems.finereason_label.setEnabled(true);
						LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.setEnabled(true);
						
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setBackground(Color.WHITE);
						
						LibrarySystem.FrameList.NavigationFrame.repaint();
				}				
				else
				{
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setText(null);
						LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.setText(null);
						LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.setSelected(false);
						
						LibrarySystem.FrameItems.returnPanelItems.fineamount_label.setEnabled(false);
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setEnabled(false);
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setEditable(false);
						LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox.setEnabled(false);
						LibrarySystem.FrameItems.returnPanelItems.finereason_label.setEnabled(false);
						LibrarySystem.FrameItems.returnPanelItems.finereason_textarea.setEnabled(false);
						
						LibrarySystem.FrameItems.returnPanelItems.fineamount_txt.setBackground(new Color(Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 16)), Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 17)), Integer.parseInt(LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 18))));
						
						LibrarySystem.FrameList.NavigationFrame.repaint();
				}
		}
}
