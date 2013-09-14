package libsys.listeners;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import libsys.general.LIBSYSSystem;
import libsys.general.utilities.*;

public class PrintPreviewButtonListener implements  ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public PrintPreviewButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Print"))
				{
						Component c = LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.getComponentAt(2, 2);
						
						if(LibrarySystem.FrameItems.printPreviewFrameItems.Component.equals("Table"))
						{
								MessageFormat header = getHeaderFormat(LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText());
								MessageFormat footer = getFooterFormat(LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText());
								
								LibrarySystem.Printer = new DataPrinter(LibrarySystem);
								LibrarySystem.Printer.printTableData(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable, header, footer, true);
								
								LibrarySystem.FrameList.PrintPreviewFrame.setVisible(false);
								LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.PrintPreviewFrame);
						}
						else if(LibrarySystem.FrameItems.printPreviewFrameItems.Component.equals("EditorPane"))
						{
								MessageFormat header = getHeaderFormat(LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText());
								MessageFormat footer = getFooterFormat(LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText());
								
								LibrarySystem.Printer = new DataPrinter(LibrarySystem);
								LibrarySystem.Printer.printEditorPaneData(LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane, null, null, true);
								
								LibrarySystem.FrameList.PrintPreviewFrame.setVisible(false);
								LibrarySystem.VisibleFrameList.remove(LibrarySystem.FrameList.PrintPreviewFrame);
						}
				}
		}
		
		private MessageFormat getHeaderFormat(String text)
		{
				MessageFormat format = null;
				
				try
				{
						return new MessageFormat(text);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return format;
		}
		
		private MessageFormat getFooterFormat(String text)
		{
				MessageFormat format = null;
				
				try
				{
						return new MessageFormat(text);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return format;
		}
}
