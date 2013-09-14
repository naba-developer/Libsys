package libsys.listeners;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import libsys.general.LIBSYSSystem;
import libsys.gui.MyFrame;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;

public class SettingsFontStyleItemsListener implements ItemListener
{
		LIBSYSSystem LibrarySystem;
		
		public SettingsFontStyleItemsListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
				String FontName = LibrarySystem.FrameItems.settingsFontsAndColorsPanelItems.fontfacelist_combobox.getSelectedItem().toString();
				
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
					
				LibrarySystem.FrameList.SettingsFrame.repaint();
		}
}