package libsys.gui.items;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateRangePanelItems
{
		public javax.swing.JButton display_btn;
                public javax.swing.JPanel displaybutton_panel;
                public javax.swing.JComboBox enddate_combobox;
                public javax.swing.JLabel enddate_label;
                public javax.swing.JPanel enddate_panel;
                public javax.swing.JComboBox endmonth_combobox;
                public javax.swing.JLabel endmonth_label;
                public javax.swing.JSpinner endyear_spinner;
                public javax.swing.JLabel endyear_label;
                public javax.swing.JComboBox startdate_combobox;
                public javax.swing.JLabel startdate_label;
                public javax.swing.JPanel startdate_panel;
                public javax.swing.JComboBox startmonth_combobox;
                public javax.swing.JLabel startmonth_label;
                public javax.swing.JSpinner startyear_spinner;
                public javax.swing.JLabel startyear_label;
		
		public CustomDateRangePanelItems()
		{
                                startdate_panel = new javax.swing.JPanel();
                                startdate_label = new javax.swing.JLabel();
                                startdate_combobox = new javax.swing.JComboBox();
                                startmonth_label = new javax.swing.JLabel();
                                startmonth_combobox = new javax.swing.JComboBox();
                                startyear_label = new javax.swing.JLabel();
                                startyear_spinner = new javax.swing.JSpinner();
                                enddate_panel = new javax.swing.JPanel();
                                enddate_label = new javax.swing.JLabel();
                                enddate_combobox = new javax.swing.JComboBox();
                                endmonth_label = new javax.swing.JLabel();
                                endmonth_combobox = new javax.swing.JComboBox();
                                endyear_label = new javax.swing.JLabel();
                                endyear_spinner = new javax.swing.JSpinner();
                                displaybutton_panel = new javax.swing.JPanel();
                                display_btn = new javax.swing.JButton();

                                startdate_panel.setBackground(new java.awt.Color(204, 204, 255));

                                startdate_label.setText("Start Date :");

                                startdate_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

                                startmonth_label.setText("Start Month :");

                                startmonth_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

                                startyear_label.setText("Start Year :");

                                startyear_spinner.setModel(new javax.swing.SpinnerNumberModel(getCurrentYear(), 1970, null, 1));
				
				enddate_panel.setBackground(new java.awt.Color(204, 204, 255));

                                enddate_label.setText("End Date :");

                                enddate_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

                                endmonth_label.setText("End Month :");

                                endmonth_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

                                endyear_label.setText("End Year :");

                                endyear_spinner.setModel(new javax.swing.SpinnerNumberModel(getCurrentYear(), 1970, null, 1));
				
				displaybutton_panel.setBackground(new java.awt.Color(204, 204, 255));

                                display_btn.setText("Display");
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
