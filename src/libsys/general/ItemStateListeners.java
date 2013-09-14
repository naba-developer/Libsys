package libsys.general;

import libsys.listeners.CustomDateRangePanelItemsListener;
import libsys.listeners.SpecificDatePanelItemListener;
import libsys.listeners.SystemLogCheckBoxListener;
import libsys.listeners.utility.GenderComboBoxListener;

public class ItemStateListeners
{
		LIBSYSSystem LibrarySystem;
		
		public SpecificDatePanelItemListener specificDatePanelItemListener;
		public CustomDateRangePanelItemsListener customDateRangePanelItemsListener;
		public SystemLogCheckBoxListener systemLogCheckBoxListener;
		public GenderComboBoxListener genderComboBoxListener;
		
		public ItemStateListeners(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				
				specificDatePanelItemListener = new SpecificDatePanelItemListener(LibrarySystem);
				customDateRangePanelItemsListener = new CustomDateRangePanelItemsListener(LibrarySystem);
				systemLogCheckBoxListener = new SystemLogCheckBoxListener(LibrarySystem);
				genderComboBoxListener = new GenderComboBoxListener(LibrarySystem);
		}
}
