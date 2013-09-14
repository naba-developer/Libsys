package libsys.listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import libsys.general.LIBSYSSystem;

public class CustomDateRangePanelItemsListener implements ItemListener, ChangeListener
{
		LIBSYSSystem LibrarySystem;
		
		public CustomDateRangePanelItemsListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
				Component c = (Component)ie.getSource();
				
				if(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox == (JComboBox)c)
				{
						checkStartDateCombination(c);
				}
				
				else if(LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox == (JComboBox)c)
				{
						checkStartDateCombination(c);
				}
				
				else if(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox == (JComboBox)c)
				{
						checkEndDateCombination(c);
				}
				
				else if(LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox == (JComboBox)c)
				{
						checkEndDateCombination(c);
				}			
		}
		
		public void stateChanged(ChangeEvent ce)
		{
				Component c = (Component)ce.getSource();
				
				if(LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner == (JSpinner)c)
				{
						checkStartDateCombination(c);
				}
				
				else if(LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner == (JSpinner)c)
				{
						checkEndDateCombination(c);
				}
		}
		
		public void checkEndDateCombination(Component c)
		{
				String month=LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox.getSelectedItem().toString();
				String year=LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner.getValue().toString();
						
				if(Integer.parseInt(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.getSelectedItem().toString()) >28)
				{
						if(month == "February")
						{
								if(((Integer.parseInt(year) % 4) == 0 &&  (Integer.parseInt(year) % 100) != 0 ) || (Integer.parseInt(year) % 400) == 0 )
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.setSelectedItem("29");
										return;
								}
								else
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.setSelectedItem("28");
										return;
								}
						}
						else if(month == "April" || month == "June" || month == "September" || month == "November")
						{
								if(Integer.parseInt(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.getSelectedItem().toString()) >30)
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox.setSelectedItem("30");
										return;
								}
						}
				}
		}
		
		private void checkStartDateCombination(Component c)
		{
				String month=LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox.getSelectedItem().toString();
				String year=LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner.getValue().toString();
						
				if(Integer.parseInt(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.getSelectedItem().toString()) >28)
				{
						if(month == "February")
						{
								if(((Integer.parseInt(year) % 4) == 0 &&  (Integer.parseInt(year) % 100) != 0 ) || (Integer.parseInt(year) % 400) == 0 )
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.setSelectedItem("29");
										return;
								}
								else
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.setSelectedItem("28");
										return;
								}
						}
						else if(month == "April" || month == "June" || month == "September" || month == "November")
						{
								if(Integer.parseInt(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.getSelectedItem().toString()) >30)
								{
										LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox.setSelectedItem("30");
										return;
								}
						}
				}
		}
}
