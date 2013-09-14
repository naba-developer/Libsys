package libsys.gui.items;

import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class SettingsInterfacePanelItems
{
		public javax.swing.JButton applytheme_button;
                public javax.swing.JLabel imagedestination_label;
                public javax.swing.JPanel imageholder_panel;
                public javax.swing.JPanel interface_panel;
		
		public SettingsInterfacePanelItems()
		{
                                interface_panel = new javax.swing.JPanel();
                                applytheme_button = new javax.swing.JButton();
                                imageholder_panel = new javax.swing.JPanel();
                                imagedestination_label = new javax.swing.JLabel();

                                interface_panel.setBackground(new java.awt.Color(204, 204, 255));

                                applytheme_button.setText("Apply Theme");
				imagedestination_label.setBorder(BorderFactory.createCompoundBorder(new EtchedBorder(), new BevelBorder(1)));
		}
}
