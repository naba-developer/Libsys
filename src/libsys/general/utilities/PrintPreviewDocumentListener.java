package libsys.general.utilities;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import libsys.general.LIBSYSSystem;

public class PrintPreviewDocumentListener implements DocumentListener
{
		LIBSYSSystem LibrarySystem;
		
		public PrintPreviewDocumentListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void insertUpdate(DocumentEvent de)
		{
				if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
				else if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
		}
		
		public void changedUpdate(DocumentEvent de)
		{
				if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
				else if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
		}
		
		public void removeUpdate(DocumentEvent de)
		{
				if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
				else if(de.getDocument() == LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getDocument())
				{
						String header = LibrarySystem.FrameItems.printPreviewFrameItems.header_textarea.getText();
						String footer = LibrarySystem.FrameItems.printPreviewFrameItems.footer_textarea.getText();
						
						String text = LibrarySystem.dataFormatter.text;
						
						String newText = LibrarySystem.dataFormatter.getHTMLFormattedData(header, footer, text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(newText);
						
						LibrarySystem.FrameList.PrintPreviewFrame.repaint();
				}
		}
}
