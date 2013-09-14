package libsys.listeners;

import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import libsys.general.LIBSYSSystem;

public class SpecificDatePanelItemListener implements ItemListener, ChangeListener
{
		LIBSYSSystem LibrarySystem;
		
		public SpecificDatePanelItemListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void itemStateChanged(ItemEvent ie)
		{
				Component c = (Component)ie.getSource();			
				
				if(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox == (JComboBox)c)
				{
						
						String month=LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.getSelectedItem().toString();
						String year=LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.getValue().toString();
						
						if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >28)
						{
								if(month == "February")
								{
										if(((Integer.parseInt(year) % 4) == 0 &&  (Integer.parseInt(year) % 100) != 0 ) || (Integer.parseInt(year) % 400) == 0 )
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("29");
												return;
										}
										else
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("28");
												return;
										}
								}
								else if(month == "April" || month == "June" || month == "September" || month == "November")
								{
										if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >30)
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("30");
												return;
										}
								}
						}
				}
				
				else if(LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox == (JComboBox)c)
				{
						String month=LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.getSelectedItem().toString();
						String year=LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.getValue().toString();
						
						if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >28)
						{
								if(month == "February")
								{
										if((Integer.parseInt(year) % 4) == 0)
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("29");
												return;
										}
										else
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("28");
												return;
										}
								}
								else if(month == "April" || month == "June" || month == "September" || month == "November")
								{
										if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >30)
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("30");
												return;
										}
								}
						}
				}
		}
		
		public void stateChanged(ChangeEvent ce)
		{
				Component c = (Component)ce.getSource();
				
				if(LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner == (JSpinner)c)
				{
						String month=LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox.getSelectedItem().toString();
						String year=LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner.getValue().toString();
						
						if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >28)
						{
								if(month == "February")
								{
										if((Integer.parseInt(year) % 4) == 0)
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("29");
												return;
										}
										else
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("28");
												return;
										}
								}
								else if(month == "April" || month == "June" || month == "September" || month == "November")
								{
										if(Integer.parseInt(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.getSelectedItem().toString()) >30)
										{
												LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox.setSelectedItem("30");
												return;
										}
								}
						}
				}
		}
}
