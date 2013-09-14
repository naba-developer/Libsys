package libsys.general;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import libsys.general.utilities.BackGroundColorChanger;
import libsys.general.utilities.DataFormatter;
import libsys.general.utilities.DataPrinter;
import libsys.general.utilities.ErrorLogWriter;
import libsys.general.utilities.FileIconView;
import libsys.general.utilities.FontChanger;
import libsys.general.utilities.ForeGroundColorChanger;
import libsys.general.utilities.ImageManager;
import libsys.general.utilities.ImagePreviewer;
import libsys.general.utilities.ItemDisabler;
import libsys.general.utilities.ItemEnabler;
import libsys.general.utilities.LoginManager;
import libsys.general.utilities.MyFileFilter;
import libsys.general.utilities.MySQLManager;
import libsys.general.utilities.SettingsManager;
import libsys.general.utilities.SystemCommandExecutor;
import libsys.general.utilities.SystemLogEvent;
import libsys.general.utilities.SystemLogList;
import libsys.general.utilities.SystemLogManager;
import libsys.general.utilities.SystemResetter;
import libsys.general.utilities.UserAccountManager;
import libsys.gui.MyFrame;

public class LIBSYSSystem
{
		public static final String UserAccountsFile = "AppData\\AccFiles\\Accounts.sec";
		public static final String QuestionsFile = "AppData\\AccFiles\\Questions.sec";
		public static final String AnswersFile = "AppData\\AccFiles\\Answers.sec";
		public static final String GuestFile = "AppData\\AccFiles\\Guest.sec";
		public static final String RememberFile = "AppData\\AccFiles\\Rem.sec";		
		
		public static final String LIBSYSHelpFile = "LibrarySystemHelp.chm";
		public static final String ErrorLogFile = "ErrorLog.txt";
		
		public static final String ImageFile = "AppData\\TempFiles\\Image";
		
		public static final String SystemLogFile = "AppData\\CriticalFiles\\SystemLog.bin";		
		public static final String MySQLFile = "AppData\\CriticalFiles\\MySQL";
		public static final String SettingsFile = "AppData\\CriticalFiles\\Settings.class";
		public static final String LIBSYSDatabaseScriptFile = "AppData\\CriticalFiles\\Script.sql";
			
		public static final String WindowsInterfaceFile = "AppData\\ImageFiles\\Windows.jpg";
		public static final String MetalInterfaceFile = "AppData\\ImageFiles\\Metal.jpg";
		public static final String SplashScreenFile = "AppData\\ImageFiles\\Banner.jpg";
		public static final String ThumbnailImage = "AppData\\ImageFiles\\Thumbnail.png";
		public static final String IconFile = "AppData\\ImageFiles\\Icon.ico";
		
		public String current = null;
		public String last;		
		public boolean seen;
		public String expression;
		
		public ArrayList<MyFrame> VisibleFrameList;
		public SystemSettings systemSettings;
		public LoginManager loginManager;
		public SystemResetter systemResetter;
		public ItemEnabler itemEnabler;
		public ItemDisabler itemDisabler;
		public SystemCommandExecutor CommandExecutor;
		public DataPrinter Printer;
		public DataFormatter dataFormatter;
		public ErrorLogWriter errorLogWriter;
		
		public AllFrameList FrameList;
		
		public AllFrameItems FrameItems;
		
		public JColorChooser ColorChooser;
		public JFileChooser FileChooser;
		private MyFileFilter fileFilter;
		private FileIconView fileIconView;
		
		private Designer designer;
		
		public Listeners listeners;
		private ListenerAdder listenerAdder;
		
		public SettingsManager settingsManager;
		
		public BackGroundColorChanger backgroundColorChanger;
		public ForeGroundColorChanger foregroundColorChanger;
		
		public FontChanger fontChanger;
		
		public SystemLogManager systemLogManager;
		public SystemLogList systemLogList;
		
		public UserAccountManager userAccountManager;
		
		public MySQLManager DatabaseManager;
		
		public ImageManager imageManager;
		
		public LIBSYSSystem()
		{
				FrameList = new AllFrameList();
				FrameItems = new AllFrameItems();
				
				systemSettings = new SystemSettings();
				
				loginManager = new LoginManager(this);
				
				systemResetter = new SystemResetter(this);
				itemEnabler = new ItemEnabler(this);
				itemDisabler = new ItemDisabler(this);
				CommandExecutor = new SystemCommandExecutor(this);
				dataFormatter = new DataFormatter(this);
				errorLogWriter = new ErrorLogWriter(this);
				
				VisibleFrameList = new ArrayList<MyFrame>();
				
				ColorChooser = new JColorChooser();
				FileChooser = new JFileChooser();
				fileFilter = new MyFileFilter();
				fileIconView = new FileIconView(fileFilter);
				
				fileFilter.addExtension("jpg");
				fileFilter.addExtension("jpeg");
				fileFilter.addExtension("bmp");
				fileFilter.addExtension("png");
				
				fileFilter.setDescription("Image Files");
				
				FileChooser.setFileFilter(fileFilter);
				FileChooser.setFileView(fileIconView);
				FileChooser.setAccessory(new ImagePreviewer(FileChooser));
				
				designer = new Designer(this);
				listeners = new Listeners(this);
				listenerAdder = new ListenerAdder(this);
				settingsManager = new SettingsManager(this);
				backgroundColorChanger = new BackGroundColorChanger(this);
				foregroundColorChanger = new ForeGroundColorChanger(this);
				fontChanger = new FontChanger(this);
				systemLogList = new SystemLogList(this);
				userAccountManager = new UserAccountManager(this);
				systemLogManager = new SystemLogManager(this);
				DatabaseManager = new MySQLManager(this);
				imageManager = new ImageManager(this);
		}
		
		public void deleteTemporaryImageFile()
		{
				File f = new File(this.ImageFile);
								
				f.delete();
		}
		
		public void designFrames()
		{
				designer.frameDesigner.designLoginFrame();
				designer.frameDesigner.designNavigationFrame();
				designer.frameDesigner.designCalculatorFrame();
				designer.frameDesigner.designSettingsFrame();
				designer.frameDesigner.designAccountsFrame();
				designer.frameDesigner.designAccountRegistrationFrame();
				designer.frameDesigner.designMySQLFrame();
				designer.frameDesigner.designPrintPreviewFrame();
				designer.frameDesigner.designAboutFrame();
		}
		
		public void loadBorrowerRecordsPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadBorrowerRecordsPanel();
		}
		
		public void loadNavigationBooksBorrowingsPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadNavigationBooksBorrowingsPanel();
		}
		
		public void loadNavigationBooksReturnsPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadNavigationBooksReturnsPanel();
		}
		
		public void loadQueryBrowserPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadQueryBrowserPanel();
		}
		
		public void loadSettingsFontsPanel()
		{
				designer.panelDesigner.settingsPanelsDesigner.loadSettingsFontsPanel();
		}
		
		public void loadSettingsLibrarySettingsPanel()
		{
				designer.panelDesigner.settingsPanelsDesigner.loadLibrarySettingsPanel();
		}
		
		public void loadSettingsInterfacePanel()
		{
				designer.panelDesigner.settingsPanelsDesigner.loadSettingsInterfacePanel();
		}
		
		public void loadColorThemeChangePanel()
		{
				designer.panelDesigner.settingsPanelsDesigner.loadChangeColorThemePanel();
		}
		
		public void loadSearchBooksPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadSearchBooksPanel();
		}
		
		public void loadSearchBorrowersPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadSearchBorrowerspanel();
		}
		
		public void loadFinesPaymentPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadFinesPaymentPanel();
		}
		
		public void loadFinesImposePanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadFinesImposePanel();
		}
		
		public void loadUpdateBooksPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadUpdateBooksPanel();
		}
		
		public void loadUpdateBorrowersPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadUpdateBorrowersPanel();
		}
		
		public void loadInsertBooksPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadInsertBooksPanel();
		}
		
		public void loadInsertBorrowersPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadInsertBorrowersPanel();
		}
		
		public void loadDeleteBooksPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadDeleteBooksPanel();
		}
		
		public void loadDeleteBorrowersPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadDeleteBorrowersPanel();
		}
		
		public void loadAddAccountPanel()
		{
				designer.panelDesigner.accountsManagerPanelDesigner.loadAddAccountsPanel();
		}
		
		public void loadEditAccountPanel()
		{
				designer.panelDesigner.accountsManagerPanelDesigner.loadEditAccountsPanel();
		}
		
		public void loadDeleteAccountPanel()
		{
				designer.panelDesigner.accountsManagerPanelDesigner.loadDeleteAccountsPanel();
		}
		
		public void loadSystemLogPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadSystemLogPanel();
		}
		
		public void loadTransactionPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadTransactionsPanel();
		}
		
		public void loadSpecificDatePanel()
		{
				designer.panelDesigner.transactionPanelDesigner.loadSpecificDatePanel();
		}
		
		public void loadSpecificMonthPanel()
		{
				designer.panelDesigner.transactionPanelDesigner.loadSpecificMonthPanel();
		}
		
		public void loadSpecificYearPanel()
		{
				designer.panelDesigner.transactionPanelDesigner.loadSpecificYearPanel();
		}
		
		public void loadCustomDateRangePanel()
		{
				designer.panelDesigner.transactionPanelDesigner.loadCustomDateRangePanel();
		}
		
		public void loadCurrentTransactionPanel()
		{
				designer.panelDesigner.transactionPanelDesigner.loadCurrentTransactionPanelItems();
		}
		
		public void loadAllFinesPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadAllFinesPanel();
		}
		
		public void loadAllBooksPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadAllBooksPanel();
		}
		
		public void loadAllBorrowersPanel()
		{
				designer.panelDesigner.navigationPanelsDesigner.loadAllBorrowersPanel();
		}
		
		public void loadAccountRegistrationPanel()
		{
				designer.panelDesigner.accountRegistrationPanelDesigner.loadAccountRegistrationPanel();
		}
		
		public void addListeners()
		{
				listenerAdder.addListeners();
		}
}