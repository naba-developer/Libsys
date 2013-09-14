package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import libsys.general.LIBSYSSystem;

public class FinePaymentButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String query,prefix,add;
		
		public FinePaymentButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Pay Fine"))
				{
						if(checkSelection() == false)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Select an entry/entries first and then press \"Pay Fine\"");
								return;
						}
						
						int [] SelectedRows = LibrarySystem.FrameItems.finesPaymentPanelItems.ResultsTable.getSelectedRows();
				
						prefix = "UPDATE Fines SET Fine_paid='Paid' where Fine_time ='";
				
						int i = 0;
				
						while(i < SelectedRows.length)
						{
								add = LibrarySystem.FrameItems.finesPaymentPanelItems.ResultsTable.getValueAt(SelectedRows[i], 0).toString() + "'";
						
								query = prefix + add;
						
								int result = LibrarySystem.DatabaseManager.executeOtherQuery(query);
						
								if(result == -1 || result == -2)
								{
										return;
								}
						
								i++;
						}
				
						if(SelectedRows.length == 1)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The selected fine entry has been paid and cleared successfully");
						}
						else if(SelectedRows.length > 1)
						{
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The selected fine entries have been paid and cleared successfully");
						}
				
						LibrarySystem.listeners.textBoxListeners.finesPaymentBorrowerAccNumberTextBoxListener.refreshTableData();
				}
				
				if(ae.getActionCommand().equals("Print Fine Details"))
				{
						LibrarySystem.systemResetter.resetPrintPreviewFrame();
						
						if(LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_scrollpane.getViewport() == null)
						{
								return;
						}
						
						LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable = new JTable(LibrarySystem.FrameItems.finesPaymentPanelItems.ResultsTable.getModel());
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.ResultsTable);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "Table";
						
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);	
				}
		}
		
		private boolean checkSelection()
		{
				int n = LibrarySystem.FrameItems.finesPaymentPanelItems.ResultsTable.getSelectedRow();
				
				if(n == -1)
				{
						return false;
				}
				
				return true;
		}
}
