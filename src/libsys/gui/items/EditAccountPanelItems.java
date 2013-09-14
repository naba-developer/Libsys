package libsys.gui.items;

public class EditAccountPanelItems 
{
		public javax.swing.JButton cancel_btn;
                public javax.swing.JPasswordField confirmnewpassword_password;
                public javax.swing.JLabel confirmpassword_label;
                public javax.swing.JLabel currentpassword_label;
                public javax.swing.JPasswordField currentpassword_password;
                public javax.swing.JLabel currentusername_label;
                public javax.swing.JTextField currentusername_txt;
                public javax.swing.JButton forgotpassword_btn;
                public javax.swing.JLabel newpassword_label;
                public javax.swing.JPasswordField newpassword_password;
                public javax.swing.JLabel newsecurityanswer_label;
                public javax.swing.JTextField newsecurityanswer_txt;
                public javax.swing.JLabel newsecurityquestion_label;
                public javax.swing.JTextField newsecurityquestion_txt;
                public javax.swing.JLabel newusername_label;
                public javax.swing.JTextField newusername_txt;
                public javax.swing.JButton submit_btn;
		
		public EditAccountPanelItems() 
		{
				//component_panel = new javax.swing.JPanel();
                                newusername_txt = new javax.swing.JTextField();
                                currentpassword_label = new javax.swing.JLabel();
                                currentpassword_password = new javax.swing.JPasswordField();
                                newusername_label = new javax.swing.JLabel();
                                forgotpassword_btn = new javax.swing.JButton();
                                newpassword_password = new javax.swing.JPasswordField();
                                newpassword_label = new javax.swing.JLabel();
                                confirmnewpassword_password = new javax.swing.JPasswordField();
                                confirmpassword_label = new javax.swing.JLabel();
                                submit_btn = new javax.swing.JButton();
                                cancel_btn = new javax.swing.JButton();
                                newsecurityquestion_txt = new javax.swing.JTextField();
                                newsecurityquestion_label = new javax.swing.JLabel();
                                currentusername_txt = new javax.swing.JTextField();
                                currentusername_label = new javax.swing.JLabel();
                                newsecurityanswer_txt = new javax.swing.JTextField();
                                newsecurityanswer_label = new javax.swing.JLabel();

                                //component_panel.setBackground(new java.awt.Color(204, 204, 255));

                                currentpassword_label.setText("Current Password :");

                                newusername_label.setText("New User Name :");

                                forgotpassword_btn.setBackground(new java.awt.Color(153, 153, 255));
                                forgotpassword_btn.setText("Forgot Password");

                                newpassword_label.setText("New Password :");

                                confirmpassword_label.setText("Confirm Password :");

                                submit_btn.setBackground(new java.awt.Color(153, 153, 255));
                                submit_btn.setText("Submit");

                                cancel_btn.setBackground(new java.awt.Color(153, 153, 255));
                                cancel_btn.setText("Cancel");
                                

                                newsecurityquestion_label.setText("New Security Question :");

                                currentusername_label.setText("Current User Name :");

                                newsecurityanswer_label.setText("Answer To New Security Question :");
		}		
}
