package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;

public class FineImposeImposeButtonListener implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		String  accnum;
		String fineamt;
		String finereason="Not specified";
		String paid="Not Paid";
		
		public FineImposeImposeButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				if(ae.getActionCommand().equals("Impose"))
				{
						accnum=LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt.getText();
						fineamt=LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText();
						
						if(!LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText().equals(null))
						{
								finereason=LibrarySystem.FrameItems.finesImposePanelItems.finereason_textarea.getText();
								
								if(finereason == null || finereason.length() == 0)
								{
										finereason = "Not Specified";
								}
						}
						
						if(checkFine() == false)
						{
								return;
						}
						
						if(LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox.isSelected())
						{
								paid = "Paid";
						}
						
						String finetime=new Long(System.currentTimeMillis()).toString();
						
						String query="INSERT INTO Fines values('"+finetime+"','"+accnum+"','"+fineamt+"','"+paid+"','"+finereason+"')";
						
						int result = LibrarySystem.DatabaseManager.executeOtherQuery(query);
						
						if(result == -1 || result == -2)
						{
								return;
						}
						
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "The fine has been imposed successfully");
						
						//LibrarySystem.systemResetter.resetFineImposePanel();
						
						LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn.setEnabled(false);
						LibrarySystem.FrameItems.finesImposePanelItems.print_btn.setEnabled(true);
						
						LibrarySystem.DatabaseManager.closeConnection();				
				}
				
				if(ae.getActionCommand().equals("Print"))
				{
						LibrarySystem.systemResetter.resetPrintPreviewFrame();
						
						String text = LibrarySystem.dataFormatter.getFormattedFineImposeItems();
						
						text = LibrarySystem.dataFormatter.getHTMLFormattedData("", "", text);
						
						text = LibrarySystem.dataFormatter.getHTMLFormattedData("", "", text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane.setText(text);
						
						LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane.setViewportView(LibrarySystem.FrameItems.printPreviewFrameItems.EditorPane);
						LibrarySystem.FrameItems.printPreviewFrameItems.Component = "EditorPane";
						LibrarySystem.FrameList.PrintPreviewFrame.setVisible(true);
						
						LibrarySystem.VisibleFrameList.add(LibrarySystem.FrameList.PrintPreviewFrame);
				}
		}
		
		private boolean checkFine()
		{
				try
				{
						Double.parseDouble(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText());
				}
				catch(Exception ex)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Enter a valid Fine Amount in figures. Do not type Rs/p etc.");
						
						return false;
				}
						
				if(Double.parseDouble(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt.getText()) <= 0.00)
				{
						JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Enter a valid Fine Amount. Fine amount, if imposed, cannot be negative or zero.");
						
						return false;
				}
				
				return true;
		}
}
