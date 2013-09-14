package libsys.gui.items;

public class CurrentTransactionsPanelItems
{
		public javax.swing.JButton displaytransaction_button;
                public javax.swing.JComboBox transactionduration_combobox;
		
		public CurrentTransactionsPanelItems()
		{
                                transactionduration_combobox = new javax.swing.JComboBox();
                                displaytransaction_button = new javax.swing.JButton();

                                transactionduration_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Today", "This Week", "This Month", "This Year", "Entire Transaction Log" }));

                                displaytransaction_button.setText("Display Transaction");
		}
}
