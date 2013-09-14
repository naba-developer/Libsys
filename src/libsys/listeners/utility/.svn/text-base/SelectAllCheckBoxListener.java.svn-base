package libsys.listeners.utility;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import libsys.general.LIBSYSSystem;

public class SelectAllCheckBoxListener implements ItemListener
{
		LIBSYSSystem LibrarySystem;
		ArrayList <JCheckBox> CheckBoxList;
		JCheckBox SelectedCheckBox;
		
		public SelectAllCheckBoxListener(LIBSYSSystem LibrarySystem, ArrayList <JCheckBox> CheckBoxList)
		{
				this.LibrarySystem = LibrarySystem;
				this.CheckBoxList = CheckBoxList;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{			
				SelectedCheckBox = (JCheckBox)ie.getSource();
				
				if(SelectedCheckBox.isSelected())
				{
						for(int i = 0; i < CheckBoxList.size(); i++)
						{
								CheckBoxList.get(i).setSelected(true);
								CheckBoxList.get(i).setEnabled(false);
						}
						
						if(SelectedCheckBox == LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox)
						{
								LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn.setEnabled(true);
						}
				}
				
				else
				{
						for(int i = 0; i < CheckBoxList.size(); i++)
						{
								CheckBoxList.get(i).setEnabled(true);
								
								if(SelectedCheckBox == LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox)
								{
										CheckBoxList.get(i).setSelected(false);
								}
						}
						
				}
		}
}
