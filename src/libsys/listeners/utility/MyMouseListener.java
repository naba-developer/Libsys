package libsys.listeners.utility;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.MouseInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import libsys.general.BooksData;
import libsys.general.BorrowersData;
import libsys.general.LIBSYSSystem;

public class MyMouseListener implements MouseListener
{
               LIBSYSSystem LibrarySystem;
               JTable ResultsTable;
	       
               public MyMouseListener(LIBSYSSystem LibrarySystem)
               {
                              this.LibrarySystem = LibrarySystem;
               }
               
               public void mouseClicked(MouseEvent me)
               {
				Component mycomponent = (JTable)me.getSource();
				mycomponent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				
				if(mycomponent == (Component)LibrarySystem.FrameItems.updateBorrowerPanelItems.ResultsTable)
				{						
						if(me.getButton() == MouseEvent.BUTTON1)
						{
								ResultsTable = (JTable)mycomponent;
								setBorrowerUpdateData();
						}						
				}
				
				else if(mycomponent == (Component)LibrarySystem.FrameItems.updateBooksPanelItems.ResultsTable)
				{						
						if(me.getButton() == MouseEvent.BUTTON1)
						{
								ResultsTable = (JTable)mycomponent;
								setBooksUpdateData();
						}
				}
               }
               
               public void mouseEntered(MouseEvent me)
               {
				Component mycomponent = (JTable)me.getSource();
				mycomponent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
               }
               
               public void mouseExited(MouseEvent me)
               {
				Component mycomponent = (JTable)me.getSource();
				mycomponent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
               }
               
               public void mousePressed(MouseEvent me)
               {
			        Component mycomponent = (JTable)me.getSource();
				mycomponent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
               }
               
               public void mouseReleased(MouseEvent me)
               {
				Component mycomponent = (JTable)me.getSource();
				mycomponent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
               }
	       
	       private void setBooksUpdateData()
	       {
			       if(checkSelection() == false)
			       {
					       return;
			       }
			       
			       int SelectedRow = ResultsTable.getSelectedRow();
			       
			       BooksData booksData = new BooksData();
			       
			       booksData.BookAccountNumber = ResultsTable.getValueAt(SelectedRow, 0).toString();
			       booksData.BookTitle = ResultsTable.getValueAt(SelectedRow, 1).toString();
			       booksData.BookAuthors = ResultsTable.getValueAt(SelectedRow, 2).toString();
			       booksData.BookPublishers = ResultsTable.getValueAt(SelectedRow, 3).toString();
			       booksData.BookEdition = ResultsTable.getValueAt(SelectedRow, 4).toString();
			       booksData.BookPrice = ResultsTable.getValueAt(SelectedRow, 5).toString();
			       
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt.setText(booksData.BookAccountNumber);
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt.setText(booksData.BookTitle);
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthor_txt.setText(booksData.BookAuthors);
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt.setText(booksData.BookPublishers);
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_spinner.setValue(Integer.parseInt(booksData.BookEdition));
			       LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt.setText(booksData.BookPrice);
			       
			       LibrarySystem.FrameList.NavigationFrame.repaint();
			       System.out.println("Row 2: " + SelectedRow);
			       LibrarySystem.itemEnabler.enableUpdateBooksUpdatePanel();
	       }
	       
	       private void setBorrowerUpdateData()
	       {
			       if(checkSelection() == false)
			       {
					       return;
			       }
			       
			       int SelectedRow = ResultsTable.getSelectedRow();
			       
			       BorrowersData borrowerData = new BorrowersData();
			       
			       borrowerData.BorrowerAccountNumber = ResultsTable.getValueAt(SelectedRow, 0).toString();
			       borrowerData.BorrowerName = ResultsTable.getValueAt(SelectedRow, 1).toString();
			       borrowerData.BorrowerEMail = ResultsTable.getValueAt(SelectedRow, 2).toString();
			       borrowerData.BorrowerPhone = ResultsTable.getValueAt(SelectedRow, 3).toString();
			       borrowerData.BorrowerAddress = ResultsTable.getValueAt(SelectedRow, 4).toString();
			       borrowerData.BorrowerSex = ResultsTable.getValueAt(SelectedRow, 5).toString();
			       
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt.setText(borrowerData.BorrowerAccountNumber);
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt.setText(borrowerData.BorrowerName);
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox.setSelectedItem(borrowerData.BorrowerSex);
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt.setText(borrowerData.BorrowerEMail);
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_textarea.setText(borrowerData.BorrowerAddress);		
			       LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt.setText(borrowerData.BorrowerPhone);
			       
			       LibrarySystem.FrameList.NavigationFrame.repaint();
	       }
	       
	       private boolean checkSelection()
	       {
			       if(ResultsTable.getSelectedRow() == -1)
			       {
					       JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "Select a record first");
					       return false;
			       }
			       
			       return true;
	       }
}
