package libsys.listeners;

import javax.swing.JOptionPane;
import libsys.general.LIBSYSSystem;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class NavigationTreeListener implements TreeSelectionListener
{
		LIBSYSSystem LibrarySystem;
		
		public NavigationTreeListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void valueChanged(TreeSelectionEvent te)
		{
				TreePath path = LibrarySystem.FrameItems.navigationFrameItems.navigation_tree.getSelectionPath();
				
				if(path == null)
				{
						return;
				}
				
				DefaultMutableTreeNode node = (DefaultMutableTreeNode)path.getLastPathComponent();
				
				String leaf = node.getUserObject().toString();
				
				if(leaf.equals("Borrower Records"))
				{				
						LibrarySystem.loadBorrowerRecordsPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Borrowings"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to lend new books. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadNavigationBooksBorrowingsPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Returns"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to return loaned books. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadNavigationBooksReturnsPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Search Books"))
				{
						LibrarySystem.loadSearchBooksPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
						
						LibrarySystem.itemEnabler.enableSearchBooksPanelItems();
				}
				
				else if(leaf.equals("Search Borrowers"))
				{
						LibrarySystem.loadSearchBorrowersPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Impose"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to impose fine on borrowers. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadFinesImposePanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Payment"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to pay fine against borrowers. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadFinesPaymentPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Update Books"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to update book details. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadUpdateBooksPanel();
												
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
						
						LibrarySystem.itemEnabler.enableUpdateBooksSearchItems();
				}
				
				else if(leaf.equals("Update Borrowers"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to update borrower details. Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadUpdateBorrowersPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Insert Books"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to insert new books to database . Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadInsertBooksPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Insert Borrowers"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to insert new borrowers to database . Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadInsertBorrowersPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("Delete Books"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to delete existing books from database . Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadDeleteBooksPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
						
						LibrarySystem.itemEnabler.enableDeleteBooksPanelItems();
				}
				
				else if(leaf.equals("Delete Borrowers"))
				{
						try
						{
								if(LibrarySystem.loginManager.isUserGuest(LibrarySystem.current, LibrarySystem.GuestFile) == true)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.NavigationFrame, "User Access Control prevents you to delete existing borrowers from database . Please log into an administrator account to do so");
								
										return;
								}
						}
						catch(Exception ex)
						{
								LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
								return;
						}
						
						LibrarySystem.loadDeleteBorrowersPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("System Log"))
				{
						LibrarySystem.loadSystemLogPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("All Transactions"))
				{
						LibrarySystem.loadTransactionPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("All Fines"))
				{
						LibrarySystem.loadAllFinesPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("All Books"))
				{
						LibrarySystem.loadAllBooksPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}
				
				else if(leaf.equals("All Borrowers"))
				{
						LibrarySystem.loadAllBorrowersPanel();
						
						LibrarySystem.systemResetter.resetNavigationFrame();
						LibrarySystem.itemDisabler.disableNavigationFrameItems();
				}			
		}	
}