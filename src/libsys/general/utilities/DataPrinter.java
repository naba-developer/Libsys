package libsys.general.utilities;

import java.text.MessageFormat;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;
import libsys.general.LIBSYSSystem;

public class DataPrinter extends SwingWorker<Object, Object>
{
		private MessageFormat header;
		private MessageFormat footer;
		
		private boolean interactive;
		private volatile boolean complete = false;
		private volatile String data;
		
		private JTable ResultsTable;
		private JTextArea DataTextArea;
		private JEditorPane EditorPane;
		
		String message;
		
		LIBSYSSystem LibrarySystem;
		
		String component = null;
		
		public DataPrinter(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void printEditorPaneData(JEditorPane EditorPane, MessageFormat header, MessageFormat footer, boolean interactive)
		{
				this.EditorPane = EditorPane;
				this.header = header;
				this.footer = footer;
				this.interactive = interactive;
				
				component = "EditorPane";
				
				this.execute();
		}
		
		public void printTextAreaData(JTextArea DataTextArea, MessageFormat header, MessageFormat footer, boolean interactive)
		{
				this.DataTextArea = DataTextArea;
				this.header = header;
				this.footer = footer;
				this.interactive = interactive;
				
				component = "TextArea";
				
				this.execute();
		}
		
		public void printTableData(JTable ResultsTable, MessageFormat header, MessageFormat footer, boolean interactive)
		{
				this.ResultsTable = ResultsTable;
				this.header = header;
				this.footer = footer;
				this.interactive = interactive;
				
				component = "Table";
				
				this.execute();
		}
		
		protected Object doInBackground()
		{				
				try
				{
						if(component.equals("Table"))
						{
								complete = ResultsTable.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, interactive);
						}
						else if(component == "TextArea")
						{
								complete = DataTextArea.print(header, footer, true, null, null, interactive);
						}
						else if(component == "EditorPane")
						{
								complete = EditorPane.print(header, footer, true, null, null, interactive);
						}
						
						message = "Printing " + (complete ? "complete" : "canceled");
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return null;
		}
		
		protected void done()
		{
				message(!complete, message);
		}
		
		private void message(boolean error, String msg)
		{
				int type = (error ? JOptionPane.ERROR_MESSAGE : JOptionPane.INFORMATION_MESSAGE);
				
				JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, msg, "Printing", type);
		}
		
		private void error(String msg)
		{
				message(true, msg);
		}
}
