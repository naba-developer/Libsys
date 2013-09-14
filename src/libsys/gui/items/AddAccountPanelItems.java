package libsys.gui.items;

public class AddAccountPanelItems 
{
		public javax.swing.JButton addaccount_btn;
                public javax.swing.JLabel addsecurityquestion_label;
                public javax.swing.JTextField addsecurityquestion_txt;
                public javax.swing.JButton cancel_btn;
                public javax.swing.JLabel confirmpassword_label;
                public javax.swing.JPasswordField confirmpassword_password;
                public javax.swing.JLabel newpassword_label;
                public javax.swing.JPasswordField newpassword_password;
                public javax.swing.JLabel newusername_label;
                public javax.swing.JTextField newusername_txt;
                public javax.swing.JLabel securityanswer_label;
                public javax.swing.JTextField securityanswer_txt;
		
		public AddAccountPanelItems() 
		{
                                newusername_txt = new javax.swing.JTextField();
                                newusername_label = new javax.swing.JLabel();
                                newpassword_password = new javax.swing.JPasswordField();
                                newpassword_label = new javax.swing.JLabel();
                                confirmpassword_password = new javax.swing.JPasswordField();
                                confirmpassword_label = new javax.swing.JLabel();
                                cancel_btn = new javax.swing.JButton();
                                addaccount_btn = new javax.swing.JButton();
                                addsecurityquestion_txt = new javax.swing.JTextField();
                                addsecurityquestion_label = new javax.swing.JLabel();
                                securityanswer_txt = new javax.swing.JTextField();
                                securityanswer_label = new javax.swing.JLabel();

                                newusername_label.setText("New User Name :");

                                newpassword_label.setText("New Password :");

                                confirmpassword_label.setText("Confirm Password :");

                                cancel_btn.setBackground(new java.awt.Color(153, 153, 255));
                                cancel_btn.setText("Cancel");

                                addaccount_btn.setBackground(new java.awt.Color(153, 153, 255));
                                addaccount_btn.setText("Add Account");

                                addsecurityquestion_label.setText("Add Security Question :");

                                securityanswer_label.setText("Answer to  Security Question : ");
		}		
}
