package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JRadioButton;
import libsys.general.LIBSYSSystem;

public class TransactionPanelRadioButtonGroupListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public TransactionPanelRadioButtonGroupListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Specific Date"))
				{
						LibrarySystem.loadSpecificDatePanel();
				}
				
				else if(ae.getActionCommand().equals("Specific Month"))
				{
						LibrarySystem.loadSpecificMonthPanel();
				}
				
				else if(ae.getActionCommand().equals("Specific Year"))
				{
						LibrarySystem.loadSpecificYearPanel();
				}
				
				else if(ae.getActionCommand().equals("Custom Date Range"))
				{
						LibrarySystem.loadCustomDateRangePanel();
				}
				
				else if(ae.getActionCommand().equals("Current Transactions"))
				{
						LibrarySystem.loadCurrentTransactionPanel();
				}
		}
}
