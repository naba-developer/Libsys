package libsys.gui.items;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDatePanelItems
{
		public javax.swing.JButton displaytransactions_btn;
                public javax.swing.JPanel searchbutton_panel;
                public javax.swing.JPanel specificdate_panel;
                public javax.swing.JComboBox specificdatedate_combobox;
                public javax.swing.JLabel specificdatedate_label;
                public javax.swing.JComboBox specificdatemonth_combobox;
                public javax.swing.JLabel specificdatemonth_label;
                public javax.swing.JLabel specificdateyear_label;
                public javax.swing.JSpinner specificdateyear_spinner;
		
		public SpecificDatePanelItems()
		{
				specificdate_panel = new javax.swing.JPanel();
                                specificdatedate_label = new javax.swing.JLabel();
                                specificdatedate_combobox = new javax.swing.JComboBox();
                                specificdatemonth_label = new javax.swing.JLabel();
                                specificdatemonth_combobox = new javax.swing.JComboBox();
                                specificdateyear_label = new javax.swing.JLabel();
                                specificdateyear_spinner = new javax.swing.JSpinner();
                                searchbutton_panel = new javax.swing.JPanel();
                                displaytransactions_btn = new javax.swing.JButton();

                                specificdate_panel.setBackground(new java.awt.Color(204, 204, 255));

                                specificdatedate_label.setText("Date :");

                                specificdatedate_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
				specificdatedate_combobox.setSelectedItem(new Integer(getCurrentDate()));
				
                                specificdatemonth_label.setText("Month :");

                                specificdatemonth_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
				specificdatemonth_combobox.setSelectedItem(getCurrentMonthNumber() - 1);
				
                                specificdateyear_label.setText("Year :");

                                specificdateyear_spinner.setModel(new javax.swing.SpinnerNumberModel(getCurrentYear(), 1970, null, 1));
				
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
