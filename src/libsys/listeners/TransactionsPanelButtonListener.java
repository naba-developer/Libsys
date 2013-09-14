package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTable;
import libsys.general.LIBSYSSystem;

public class TransactionsPanelButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		
		public TransactionsPanelButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Print"))
				{
						if(LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.transactionPanelItems.ResultsTable.getModel());
						
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);		
				}
		}
}
