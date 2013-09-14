package libsys.general.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import libsys.general.LIBSYSSystem;

public class SettingsManager
{
		LIBSYSSystem LibrarySystem;
		Properties Settings;
		
		public SettingsManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
				Settings = new Properties();
		}
		
		public void saveSettings(String setting, String FilePath, int SettingID)
		{
				try
				{
						File SettingsFile = new File(FilePath);
						FileInputStream fin = new FileInputStream(SettingsFile);	
						
						Settings.load(fin);
						fin.close();
						
						Settings.put(getSettingsKey(SettingID), setting);
						
						FileOutputStream fout = new FileOutputStream(SettingsFile);
												
						Settings.store(fout, "Settings Changed");
						fout.close();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}				
		}
		
		public String getSettings(String FilePath, int SettingID)
		{
				try
				{
						File SettingsFile = new File(FilePath);
						FileInputStream fin = new FileInputStream(SettingsFile);
						
						Settings.load(fin);
						
						return Settings.getProperty(getSettingsKey(SettingID));
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return null;
		}
		
		private String getSettingsKey(int SettingID)
		{
				if(SettingID == 0)
				{
						return "Save_Log_In/Log_Off_Log";
				}
				
				else if(SettingID == 1)
				{
						return "Save_Lock/Open_Log";
				}
				
				else if(SettingID == 2)
				{
						return "Save_Data_Entry_Log";
				}
				
				else if(SettingID == 3)
				{
						return "Save_Data_Update_Log";
				}
				
				else if(SettingID == 4)
				{
						return "Save_Data_Delete_Log";
				}
				
				else if(SettingID == 5)
				{
						return "Save_Data_Search_Log";
				}
				
				else if(SettingID == 6)
				{
						return "Save_Database_Query_Log";
				}
				
				else if(SettingID == 7)
				{
						return "Save_System_Log_Clearance_Log";
				}
				
				else if(SettingID == 8)
				{
						return "Font_Face";
				}
				
				else if(SettingID == 9)
				{
						return "Font_Color_Red";
				}
				
				else if(SettingID == 10)
				{
						return "Font_Color_Green";
				}
				
				else if(SettingID == 11)
				{
						return "Font_Color_Blue";
				}
				
				else if(SettingID == 12)
				{
						return "Font_Size";
				}
				
				else if(SettingID == 13)
				{
						return "Background_Color_Red";
				}
				
				else if(SettingID == 14)
				{
						return "Background_Color_Green";
				}
				
				else if(SettingID == 15)
				{
						return "Background_Color_Blue";
				}
				
				else if(SettingID == 16)
				{
						return "Foreground_Color_Red";
				}
				
				else if(SettingID == 17)
				{
						return "Foreground_Color_Green";
				}
				
				else if(SettingID == 18)
				{
						return "Foreground_Color_Blue";
				}				
				
				else if(SettingID == 19)
				{
						return "Interface";
				}
				
				else
				{
						return "Font_Style";
				}
		}
}
