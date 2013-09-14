package libsys.gui.items;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificYearPanelItems
{
		public javax.swing.JPanel displaytransactionbutton_panel;
                public javax.swing.JButton displaytransactions_btn;
                public javax.swing.JLabel specificdateyear_label;
                public javax.swing.JSpinner specificdateyear_spinner;
                public javax.swing.JPanel specificyear_panel;
		
		public SpecificYearPanelItems()
		{
                                specificyear_panel = new javax.swing.JPanel();
                                specificdateyear_spinner = new javax.swing.JSpinner();
                                specificdateyear_label = new javax.swing.JLabel();
                                displaytransactionbutton_panel = new javax.swing.JPanel();
                                displaytransactions_btn = new javax.swing.JButton();

                                specificyear_panel.setBackground(new java.awt.Color(204, 204, 255));

                                specificdateyear_spinner.setModel(new javax.swing.SpinnerNumberModel(getCurrentYear(), 1970, null, 1));

                                specificdateyear_label.setText("Year :");
				
				displaytransactionbutton_panel.setBackground(new java.awt.Color(204, 204, 255));

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
