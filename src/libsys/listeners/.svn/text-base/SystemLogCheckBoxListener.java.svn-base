package libsys.listeners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import libsys.general.LIBSYSSystem;

public class SystemLogCheckBoxListener implements ItemListener
{
		LIBSYSSystem LibrarySystem;
		JCheckBox SelectedCheckBox;
		
		public SystemLogCheckBoxListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
				SelectedCheckBox = (JCheckBox)ie.getSource();
				
				if(SelectedCheckBox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}
				
				if(LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox.isSelected() == true)
				{
						LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						return;
				}	
				
				LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(false);
		}
}
