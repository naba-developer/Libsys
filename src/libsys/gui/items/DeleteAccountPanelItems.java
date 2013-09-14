package libsys.gui.items;

public class DeleteAccountPanelItems
{
		public javax.swing.JScrollPane SelectedUserScrollPane;
                public javax.swing.JLabel adminpassword;
                public javax.swing.JPasswordField adminpassword_password;
                public javax.swing.JLabel adminusername_label;
                public javax.swing.JTextField adminusername_txt;
                public javax.swing.JButton cancel_btn;
                public javax.swing.JButton deleteselectedaccounts_btn;
                public javax.swing.JButton forgotpassword_btn;
                public javax.swing.JLabel useraccountlist_label;
                public javax.swing.JList useraccountslist_list;
		
		public DeleteAccountPanelItems()
		{
				adminusername_txt = new javax.swing.JTextField();
                                adminusername_label = new javax.swing.JLabel();
                                adminpassword_password = new javax.swing.JPasswordField();
                                adminpassword = new javax.swing.JLabel();
                                SelectedUserScrollPane = new javax.swing.JScrollPane();
                                useraccountlist_label = new javax.swing.JLabel();
                                deleteselectedaccounts_btn = new javax.swing.JButton();
                                cancel_btn = new javax.swing.JButton();
                                forgotpassword_btn = new javax.swing.JButton();

                                adminusername_label.setText("Administrator User Name :");

                                adminpassword.setText("Administrator Password :");

                                useraccountlist_label.setText("Select the User Accounts to Delete : ");

                                deleteselectedaccounts_btn.setBackground(new java.awt.Color(153, 153, 255));
                                deleteselectedaccounts_btn.setText("Delete Selected Accounts");

                                cancel_btn.setBackground(new java.awt.Color(153, 153, 255));
                                cancel_btn.setText("Cancel");

                                forgotpassword_btn.setText("Forgot Password");
		}
}
