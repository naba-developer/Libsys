package libsys.general;

public class AccountRegistrationPanelDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public AccountRegistrationPanelDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void loadAccountRegistrationPanel()
		{
				LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel.removeAll();
				LibrarySystem.FrameList.AccountRegistrationFrame.repaint();
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel);
                                LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_label)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_label)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_label)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_label)
                                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_txt)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(43, Short.MAX_VALUE))
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(103, 103, 103)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addaccount_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                                .addGap(91, 91, 91)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                                                .addGap(103, 103, 103))
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(component_panelLayout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminusername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.adminpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.confirmpassword_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addsecurityquestion_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.securityanswer_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addGroup(component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.addaccount_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.accountRegistrationPanelItems.cancel_btn))
                                                                .addGap(21, 21, 21))
                                );
				
				LibrarySystem.FrameList.AccountRegistrationFrame.repaint();
		}
}
