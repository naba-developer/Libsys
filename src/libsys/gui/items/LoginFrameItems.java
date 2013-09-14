package libsys.gui.items;

public class LoginFrameItems
{
		public javax.swing.JButton exit_btn;
                public javax.swing.JButton forgotpassword_btn;
                public javax.swing.JButton login_btn;
                public javax.swing.JLabel loginprompt_label;
                public javax.swing.JPanel main_panel;
                public javax.swing.JLabel password_label;
                public javax.swing.JPasswordField password_password;
                public javax.swing.JCheckBox rememberpassword_checkbox;
                public javax.swing.JLabel username_label;
                public javax.swing.JTextField username_txt;
		
		public LoginFrameItems()
		{
				main_panel = new javax.swing.JPanel();
                                username_label = new javax.swing.JLabel();
                                username_txt = new javax.swing.JTextField();
                                password_label = new javax.swing.JLabel();
                                password_password = new javax.swing.JPasswordField();
                                login_btn = new javax.swing.JButton();
                                exit_btn = new javax.swing.JButton();
                                loginprompt_label = new javax.swing.JLabel();
                                forgotpassword_btn = new javax.swing.JButton();
                                rememberpassword_checkbox = new javax.swing.JCheckBox();

                                main_panel.setBackground(new java.awt.Color(204, 204, 255));

                                username_label.setText("Username :");

                                password_label.setText("Password :");

                                login_btn.setText("Login");

                                exit_btn.setText("Exit");

                                loginprompt_label.setText("Enter the login information ");

                                forgotpassword_btn.setText("Forgot Password");

                                rememberpassword_checkbox.setBackground(new java.awt.Color(204, 204, 255));
                                rememberpassword_checkbox.setText("Remember");
		}
}