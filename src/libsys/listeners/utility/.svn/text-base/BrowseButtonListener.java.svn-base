package libsys.listeners.utility;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import libsys.general.LIBSYSSystem;

public class BrowseButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public BrowseButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Browse"))
				{
						while(true)
						{
								int result = LibrarySystem.FileChooser.showDialog(LibrarySystem.FrameList.NavigationFrame, "Upload");
								
								if(result == JFileChooser.APPROVE_OPTION)
								{
										String path = LibrarySystem.FileChooser.getSelectedFile().getPath();
										
										if(path.length() == 0)
										{
												return;
										}
										
										if(path.toLowerCase().endsWith("jpg") || path.toLowerCase().endsWith("jpeg") || path.toLowerCase().endsWith("bmp") || path.toLowerCase().endsWith("png"))
										{
												JLabel imageDestinationLabel = null;
												JTextField imagePathTextField = null;
												
												if((JButton)ae.getSource()== LibrarySystem.FrameItems.insertBorrowersPanelItems.browse_btn)
												{
														imageDestinationLabel = LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label;
														imagePathTextField = LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt;
														
														imagePathTextField.setText(null);
														imageDestinationLabel.setIcon(null);
														
														ImageIcon icon = new ImageIcon(path);
														
														if(icon.getIconWidth() > 244)
														{
																if(icon.getIconHeight() > 246)
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
                                                                                          
																else
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
														}
																
														if(icon.getIconHeight() > 246)
														{
																if(icon.getIconWidth() > 244)
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
																		
																else
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(-1, 246, Image.SCALE_SMOOTH));
																}
														}
														
														if(icon.getIconWidth() < 0)
														{
																imageDestinationLabel.setIcon(null);
																imagePathTextField.setText(null);
																imageDestinationLabel.setText("Error in Uploading Image. Image File Corrupted.");
																return;
														}
														
														if(icon.getIconHeight() < 0)
														{
																imageDestinationLabel.setIcon(null);
																imagePathTextField.setText(null);
																imageDestinationLabel.setText("Error in Uploading Image. Image File Corrupted.");
																return;
														}
														
														imageDestinationLabel.setIcon(icon);
														imagePathTextField.setText(path);
														
														return;
												}
												
												if((JButton)ae.getSource()== LibrarySystem.FrameItems.updateBorrowerPanelItems.browse_btn)
												{
														imageDestinationLabel = LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagedestination_label;
														imagePathTextField = LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt;
														
														imagePathTextField.setText(null);
														imageDestinationLabel.setIcon(null);
														
														ImageIcon icon = new ImageIcon(path);
														
														if(icon.getIconWidth() > 244)
														{
																if(icon.getIconHeight() > 246)
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
                                                                                          
																else
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
														}
																
														if(icon.getIconHeight() > 246)
														{
																if(icon.getIconWidth() > 244)
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(244, -1, Image.SCALE_SMOOTH));
																}
																		
																else
																{
																		icon = new ImageIcon(icon.getImage().getScaledInstance(-1, 246, Image.SCALE_SMOOTH));
																}
														}
														
														if(icon.getIconWidth() < 0)
														{
																imageDestinationLabel.setIcon(null);
																imagePathTextField.setText(null);
																imageDestinationLabel.setText("Error in Uploading Image. Image File Corrupted.");
																return;
														}
														
														if(icon.getIconHeight() < 0)
														{
																imageDestinationLabel.setIcon(null);
																imagePathTextField.setText(null);
																imageDestinationLabel.setText("Error in Uploading Image. Image File Corrupted.");
																return;
														}
														
														imageDestinationLabel.setIcon(icon);
														imagePathTextField.setText(path);
														
														return;
												}
										}
								}
								else if(result == JFileChooser.CANCEL_OPTION)
								{
										return;
								}
						}
				}
		}
}
