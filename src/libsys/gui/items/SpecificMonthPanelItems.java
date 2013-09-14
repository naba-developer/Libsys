package libsys.gui.items;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SpecificMonthPanelItems
{
		public javax.swing.JButton displaytransactions_btn;
                public javax.swing.JPanel searchbutton_panel;
                public javax.swing.JComboBox specificdatemonth_combobox;
                public javax.swing.JLabel specificdatemonth_label;
                public javax.swing.JLabel specificdateyear_label;
                public javax.swing.JSpinner specificdateyear_spinner;
                public javax.swing.JPanel specificmonth_panel;
		
		public SpecificMonthPanelItems()
		{
				specificmonth_panel = new javax.swing.JPanel();
                                specificdatemonth_label = new javax.swing.JLabel();
                                specificdatemonth_combobox = new javax.swing.JComboBox();
                                specificdateyear_label = new javax.swing.JLabel();
                                specificdateyear_spinner = new javax.swing.JSpinner();
                                searchbutton_panel = new javax.swing.JPanel();
                                displaytransactions_btn = new javax.swing.JButton();

                                specificmonth_panel.setBackground(new java.awt.Color(204, 204, 255));

                                specificdatemonth_label.setText("Month :");

                                specificdatemonth_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

                                specificdateyear_label.setText("Year :");

                                specificdateyear_spinner.setModel(new javax.swing.SpinnerNumberModel(getCurrentYear() , 1970, null, 1));
				
				searchbutton_panel.setBackground(new java.awt.Color(204, 204, 255));

                                displaytransactions_btn.setText("Display Transactions");
		}
		
		private int getCurrentYear()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("yyyy");
				
				return Integer.parseInt(format.format(date));
		}
		
		private int getCurrentMonthNumber()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("MM");
				
				return Integer.parseInt(format.format(date));
		}
		
		private int getCurrentDate()
		{
				Date date = new Date();
				
				SimpleDateFormat format=new SimpleDateFormat("dd");
				
				return Integer.parseInt(format.format(date));
		}
}
