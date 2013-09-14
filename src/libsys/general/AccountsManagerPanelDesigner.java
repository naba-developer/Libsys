package libsys.general;

public class AccountsManagerPanelDesigner 
{		
		LIBSYSSystem LibrarySystem;
		
		public AccountsManagerPanelDesigner(LIBSYSSystem LibrarySystem) 
		{
				this.LibrarySystem = LibrarySystem;
		}	
		
		public void loadDeleteAccountsPanel()
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.removeAll();
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel);
                                LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountlist_label)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_label)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.SelectedUserScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, component_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.forgotpassword_btn))
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                                                .addGap(46, 46, 46)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.deleteselectedaccounts_btn)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(42, 42, 42)))
                                                                .addGap(49, 49, 49))
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(24, 24, 24)
                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.adminpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.forgotpassword_btn))
                                                                .addGap(32, 32, 32)
                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.useraccountlist_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.SelectedUserScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(67, 67, 67)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.deleteselectedaccounts_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteUserAccountPanelItems.cancel_btn))
                                                                .addContainerGap(24, Short.MAX_VALUE))
                                );
				
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
		}
		
		public void loadEditAccountsPanel()
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.removeAll();
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel);
                                LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(40, 40, 40)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.confirmpassword_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newusername_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentusername_label))
                                                                                                .addContainerGap(379, Short.MAX_VALUE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, component_panelLayout.createSequentialGroup()
                                                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                                                                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.forgotpassword_btn))
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newusername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.confirmnewpassword_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                                                                                                .addGap(45, 45, 45))))
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(126, 126, 126)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(132, 132, 132))
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentusername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.currentpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.forgotpassword_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newusername_label)
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.confirmpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.confirmnewpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityquestion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.newsecurityanswer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(17, 17, 17)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.submit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.editAccountPanelItems.cancel_btn))
                                                                .addContainerGap())
                                );
				
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
		}
		
		public void loadAddAccountsPanel()
		{
				LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.removeAll();
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel);
                                LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_label)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_label)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_label)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_label)
                                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newusername_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(43, Short.MAX_VALUE))
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(103, 103, 103)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addaccount_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                                .addGap(91, 91, 91)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                                .addGap(103, 103, 103))
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newusername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.newpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.confirmpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addsecurityquestion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.securityanswer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.addaccount_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.addAccountPanelItems.cancel_btn))
                                                                .addGap(21, 21, 21))
                                );
				
				LibrarySystem.FrameList.AccountsManagerFrame.repaint();
		}
}
