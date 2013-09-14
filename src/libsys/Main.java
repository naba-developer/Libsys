package libsys;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.SettingsManager;
import libsys.gui.MyFrame;
import libsys.listeners.MainMenuBarListener;
import libsys.listeners.NavigationTreeListener;
import java.awt.Color;

public class Main
{
		public static LIBSYSSystem LibrarySystem;
		
		public static void main(String args[])
		{
				try
				{
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				}
				catch(Exception ex)
				{						
						ex.printStackTrace();
				}
				
				LibrarySystem = new LIBSYSSystem();
				
				LibrarySystem.designFrames();				
				LibrarySystem.addListeners();
				
				initialiseSettings();
				initiateComponents();
				
				try
				{
						showBanner();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				startLIBSYS();
		}
		
		static void showBanner() throws Exception
               {
                              MyFrame banner = new MyFrame("Loading...");
                              
                              JLabel image_lbl = new JLabel();
                              JProgressBar bar = new JProgressBar(SwingConstants.HORIZONTAL);
                              
			      banner.setLayout(null);
                              banner.setSize(550, 360);
                              
                              Toolkit toolkit = Toolkit.getDefaultToolkit();
                              
                              Dimension size = toolkit.getScreenSize();
                              
                              int x = size.width;
                              int y = size.height;
                              
                              banner.setLocation((x/2) - 275, (y/2) - 180);                              
                              banner.setVisible(false);
                              banner.setUndecorated(true);
                              
			      banner.add(image_lbl);
                              image_lbl.setBounds(0, 0, 550, 345);
                              image_lbl.setIcon(new ImageIcon(LibrarySystem.SplashScreenFile));
			      
                              banner.add(bar);
                              bar.setBounds(0, 345, 550, 15);
                              bar.setBackground(Color.WHITE);
                                                            
                              int min = bar.getMinimum();
                              int max = bar.getMaximum();
                              
                              int count = 0;
                              long time = 800;
                              
                              banner.setVisible(true);
                              
                              for(int i = min; i <= max; i = i+3)
                              {                                   
                                             Thread.currentThread().sleep(time);
                                             count ++;
                                             bar.setValue(i);
                                             
                                             if(count == 2)
                                             {
                                                            time = 400;
                                             }
                                             
                                             if(count == 5)
                                             {
                                                            time = 200;
                                             }
                                             
                                             if(count == 8)
                                             {
                                                            time = 50;
                                             }
                              }
                              
                              Thread.currentThread().sleep(500);
                              
                              banner.dispose();
               }
		
		private static void initiateComponents()
		{
				Color BackGroundColor = new Color(Integer.parseInt(LibrarySystem.systemSettings.BackgroundColorRed), Integer.parseInt(LibrarySystem.systemSettings.BackgroundColorGreen), Integer.parseInt(LibrarySystem.systemSettings.BackgroundColorBlue));
				Color ForegroundColor = new Color(Integer.parseInt(LibrarySystem.systemSettings.ForegroundColorRed), Integer.parseInt(LibrarySystem.systemSettings.ForegroundColorGreen), Integer.parseInt(LibrarySystem.systemSettings.ForegroundColorBlue));
				
				Font f = new Font(LibrarySystem.systemSettings.FontFace, Integer.parseInt(LibrarySystem.systemSettings.FontStyle), Integer.parseInt(LibrarySystem.systemSettings.FontSize));
				Color FontColor = new Color(Integer.parseInt(LibrarySystem.systemSettings.FontColorRed), Integer.parseInt(LibrarySystem.systemSettings.FontColorGreen), Integer.parseInt(LibrarySystem.systemSettings.FontColorBlue));
				
				LibrarySystem.backgroundColorChanger.setBackgroundColor(BackGroundColor);
				LibrarySystem.foregroundColorChanger.setForeGroundColor(ForegroundColor);
				LibrarySystem.fontChanger.setFont(f, FontColor);	
				LibrarySystem.systemResetter.resetLIBSYS();
				LibrarySystem.itemDisabler.disableLIBSYSItems();
		}
		
		private static void initialiseSettings()
		{
				LibrarySystem.systemSettings.LogInLogOff = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 0);
				LibrarySystem.systemSettings.LockOpen = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 1);
				LibrarySystem.systemSettings.DataEntryLog = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 2);
				LibrarySystem.systemSettings.DataUpdateLog = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 3);
				LibrarySystem.systemSettings.DataDeleteLog = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 4);
				LibrarySystem.systemSettings.DataSearchLog = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 5);
				LibrarySystem.systemSettings.DataQueryLog = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 6);
				LibrarySystem.systemSettings.SystemLogClearance = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 7);
				LibrarySystem.systemSettings.FontFace = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 8);
				LibrarySystem.systemSettings.FontColorRed = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 9);
				LibrarySystem.systemSettings.FontColorGreen = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 10);
				LibrarySystem.systemSettings.FontColorBlue = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 11);
				LibrarySystem.systemSettings.FontSize = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 12);
				LibrarySystem.systemSettings.BackgroundColorRed = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 13);
				LibrarySystem.systemSettings.BackgroundColorGreen = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 14);
				LibrarySystem.systemSettings.BackgroundColorBlue = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 15);
				LibrarySystem.systemSettings.ForegroundColorRed = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 16);
				LibrarySystem.systemSettings.ForegroundColorGreen = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 17);
				LibrarySystem.systemSettings.ForegroundColorBlue = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 18);
				LibrarySystem.systemSettings.Interface = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 19);		
				LibrarySystem.systemSettings.FontStyle = LibrarySystem.settingsManager.getSettings(LibrarySystem.SettingsFile, 20);				
		}
		
		private static void startLIBSYS()
		{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
                              
				Dimension size = toolkit.getScreenSize();
                              
				int x = size.width;
				int y = size.height;
				
				File f = new File(LibrarySystem.UserAccountsFile);
				
				if(f.exists())
				{
						LibrarySystem.FrameList.LoginFrame.setLocation((x/2) - 295, (y/2) - 150);
			      
						LibrarySystem.FrameList.LoginFrame.setVisible(true);
				}
				else
				{
						LibrarySystem.loadAccountRegistrationPanel();
						LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt.setText("Administrator");
						
						LibrarySystem.FrameList.AccountRegistrationFrame.setLocation((x/2) - 320, (y/2) - 203);
			      
						LibrarySystem.FrameList.AccountRegistrationFrame.setVisible(true);
				}		
		}
		
		private static void printSettings()
		{
				System.out.println(LibrarySystem.systemSettings.LogInLogOff);
				System.out.println(LibrarySystem.systemSettings.LockOpen);
				System.out.println(LibrarySystem.systemSettings.DataEntryLog);
				System.out.println(LibrarySystem.systemSettings.DataUpdateLog);
				System.out.println(LibrarySystem.systemSettings.DataDeleteLog);
				System.out.println(LibrarySystem.systemSettings.DataSearchLog);
				System.out.println(LibrarySystem.systemSettings.DataQueryLog);
				System.out.println(LibrarySystem.systemSettings.SystemLogClearance);
				System.out.println(LibrarySystem.systemSettings.FontFace);
				System.out.println(LibrarySystem.systemSettings.FontColorRed);
				System.out.println(LibrarySystem.systemSettings.FontColorGreen);
				System.out.println(LibrarySystem.systemSettings.FontColorBlue);
				System.out.println(LibrarySystem.systemSettings.FontSize);
				System.out.println(LibrarySystem.systemSettings.BackgroundColorRed);
				System.out.println(LibrarySystem.systemSettings.BackgroundColorGreen);
				System.out.println(LibrarySystem.systemSettings.BackgroundColorBlue);
				System.out.println(LibrarySystem.systemSettings.ForegroundColorRed);
				System.out.println(LibrarySystem.systemSettings.ForegroundColorGreen);
				System.out.println(LibrarySystem.systemSettings.ForegroundColorBlue);
				System.out.println(LibrarySystem.systemSettings.Interface);	
				System.out.println(LibrarySystem.systemSettings.FontStyle);
		}
}