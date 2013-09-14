package libsys.general;

import javax.swing.JFrame;
import libsys.general.LIBSYSSystem;

public class FrameDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public FrameDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void designAboutFrame()
		{
				LibrarySystem.FrameList.AboutLIBSYSFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
				javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.aboutFrameItems.tab_panel);
                                LibrarySystem.FrameItems.aboutFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.aboutFrameItems.main_panel);
                                LibrarySystem.FrameItems.aboutFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.AboutLIBSYSFrame.getContentPane());
                                LibrarySystem.FrameList.AboutLIBSYSFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.aboutFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameList.AboutLIBSYSFrame.pack();
		}
		
		public void designPrintPreviewFrame()
		{
				LibrarySystem.FrameList.PrintPreviewFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
				javax.swing.GroupLayout parameters_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.printPreviewFrameItems.parameters_panel);
                                LibrarySystem.FrameItems.printPreviewFrameItems.parameters_panel.setLayout(parameters_panelLayout);
                                parameters_panelLayout.setHorizontalGroup(
                                                parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parameters_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)))
                                );
                                parameters_panelLayout.setVerticalGroup(
                                                parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parameters_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jLabel1)
                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(parameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(parameters_panelLayout.createSequentialGroup()
                                                                                                .addGap(24, 24, 24)
                                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jLabel2))
                                                                                .addGroup(parameters_panelLayout.createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel2);
                                LibrarySystem.FrameItems.printPreviewFrameItems.jPanel2.setLayout(jPanel2Layout);
                                jPanel2Layout.setHorizontalGroup(
                                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                                );
                                jPanel2Layout.setVerticalGroup(
                                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.preview_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel1);
                                LibrarySystem.FrameItems.printPreviewFrameItems.jPanel1.setLayout(jPanel1Layout);
                                jPanel1Layout.setHorizontalGroup(
                                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                );
                                jPanel1Layout.setVerticalGroup(
                                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(17, 17, 17)
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.print_btn))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.printPreviewFrameItems.tab_panel);
                                LibrarySystem.FrameItems.printPreviewFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.parameters_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.parameters_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.printPreviewFrameItems.main_panel);
                                LibrarySystem.FrameItems.printPreviewFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.PrintPreviewFrame.getContentPane());
                                LibrarySystem.FrameList.PrintPreviewFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.printPreviewFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameList.PrintPreviewFrame.pack();
		}
		
		public void designMySQLFrame()
		{
				
				LibrarySystem.FrameList.MySQLFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.MySQLFrame.setResizable(false);
				
				javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.mysqlFrameItems.tab_panel);
                                LibrarySystem.FrameItems.mysqlFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.prompt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                                                .addGap(46, 46, 46)
                                                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.password_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.username_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.password_password)
                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                                                                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.ok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(46, 46, 46)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap(68, Short.MAX_VALUE))
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.prompt_label)
                                                                .addGap(29, 29, 29)
                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.username_label)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(46, 46, 46)
                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.password_label)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.password_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(50, 50, 50)
                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.ok_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.cancel_btn))
                                                                .addContainerGap(44, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.mysqlFrameItems.main_panel);
                                LibrarySystem.FrameItems.mysqlFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.tab_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.MySQLFrame.getContentPane());
                                LibrarySystem.FrameList.MySQLFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.mysqlFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );

                                LibrarySystem.FrameList.MySQLFrame.pack();
		}
		
		public void designAccountRegistrationFrame()
		{			
				LibrarySystem.FrameList.AccountRegistrationFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.AccountRegistrationFrame.setResizable(false);
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel);
                                LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 599, Short.MAX_VALUE)
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 384, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.AccountRegistrationFrameItems.main_panel);
                                LibrarySystem.FrameItems.AccountRegistrationFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 619, Short.MAX_VALUE)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 406, Short.MAX_VALUE)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.AccountRegistrationFrameItems.component_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.AccountRegistrationFrame.getContentPane());
                                LibrarySystem.FrameList.AccountRegistrationFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.AccountRegistrationFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.AccountRegistrationFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );

                                LibrarySystem.FrameList.AccountRegistrationFrame.pack();
		}
		
		public void designAccountsFrame()
		{				
				LibrarySystem.FrameList.AccountsManagerFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.AccountsManagerFrame.setResizable(false);
				
				javax.swing.GroupLayout component_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel);
                                LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel.setLayout(component_panelLayout);
                                component_panelLayout.setHorizontalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 599, Short.MAX_VALUE)
                                );
                                component_panelLayout.setVerticalGroup(
                                                component_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 384, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.accountsManagerFrameItems.main_panel);
                                LibrarySystem.FrameItems.accountsManagerFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 619, Short.MAX_VALUE)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 406, Short.MAX_VALUE)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.accountsManagerFrameItems.component_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.AccountsManagerFrame.getContentPane());
                                LibrarySystem.FrameList.AccountsManagerFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.accountsManagerFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.accountsManagerFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );

                                LibrarySystem.FrameList.AccountsManagerFrame.pack();

                                LibrarySystem.FrameList.AccountsManagerFrame.pack();
		}
		
		public void designCalculatorFrame()
		{
				LibrarySystem.FrameList.CalculatorFrame.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.CalculatorFrame.setResizable(false);
				
				javax.swing.GroupLayout Calculator_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.calculatorFrameItems.Calculator_Panel);
                                LibrarySystem.FrameItems.calculatorFrameItems.Calculator_Panel.setLayout(Calculator_PanelLayout);
                                Calculator_PanelLayout.setHorizontalGroup(
                                                Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculator_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.result_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Backspace_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.redundant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.eight_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.braceopen_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.two_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.point_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.braceclose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.percentage_btn))
                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Clear_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.divide_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(Calculator_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                                .addContainerGap())
                                );

                                Calculator_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {LibrarySystem.FrameItems.calculatorFrameItems.braceclose_btn, LibrarySystem.FrameItems.calculatorFrameItems.braceopen_btn, LibrarySystem.FrameItems.calculatorFrameItems.divide_btn, LibrarySystem.FrameItems.calculatorFrameItems.eight_btn, LibrarySystem.FrameItems.calculatorFrameItems.equal_btn, LibrarySystem.FrameItems.calculatorFrameItems.five_btn, LibrarySystem.FrameItems.calculatorFrameItems.four_btn, LibrarySystem.FrameItems.calculatorFrameItems.minus_btn, LibrarySystem.FrameItems.calculatorFrameItems.multiply_btn, LibrarySystem.FrameItems.calculatorFrameItems.nine_btn, LibrarySystem.FrameItems.calculatorFrameItems.one_btn, LibrarySystem.FrameItems.calculatorFrameItems.percentage_btn, LibrarySystem.FrameItems.calculatorFrameItems.plus_btn, LibrarySystem.FrameItems.calculatorFrameItems.point_btn, LibrarySystem.FrameItems.calculatorFrameItems.redundant_btn, LibrarySystem.FrameItems.calculatorFrameItems.seven_btn, LibrarySystem.FrameItems.calculatorFrameItems.six_btn, LibrarySystem.FrameItems.calculatorFrameItems.three_btn, LibrarySystem.FrameItems.calculatorFrameItems.two_btn, LibrarySystem.FrameItems.calculatorFrameItems.zero_btn});

                                Calculator_PanelLayout.setVerticalGroup(
                                                Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Calculator_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.result_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Backspace_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Clear_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.braceopen_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.braceclose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.percentage_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.redundant_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.seven_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.eight_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.nine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.divide_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.four_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.multiply_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.six_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.five_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.one_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.two_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.three_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.minus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(Calculator_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.zero_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.point_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.equal_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.plus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                );

                                Calculator_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LibrarySystem.FrameItems.calculatorFrameItems.Backspace_btn, LibrarySystem.FrameItems.calculatorFrameItems.Clear_btn, LibrarySystem.FrameItems.calculatorFrameItems.braceclose_btn, LibrarySystem.FrameItems.calculatorFrameItems.braceopen_btn, LibrarySystem.FrameItems.calculatorFrameItems.divide_btn, LibrarySystem.FrameItems.calculatorFrameItems.eight_btn, LibrarySystem.FrameItems.calculatorFrameItems.equal_btn, LibrarySystem.FrameItems.calculatorFrameItems.five_btn, LibrarySystem.FrameItems.calculatorFrameItems.four_btn, LibrarySystem.FrameItems.calculatorFrameItems.minus_btn, LibrarySystem.FrameItems.calculatorFrameItems.multiply_btn, LibrarySystem.FrameItems.calculatorFrameItems.nine_btn, LibrarySystem.FrameItems.calculatorFrameItems.one_btn, LibrarySystem.FrameItems.calculatorFrameItems.percentage_btn, LibrarySystem.FrameItems.calculatorFrameItems.plus_btn, LibrarySystem.FrameItems.calculatorFrameItems.point_btn, LibrarySystem.FrameItems.calculatorFrameItems.redundant_btn, LibrarySystem.FrameItems.calculatorFrameItems.seven_btn, LibrarySystem.FrameItems.calculatorFrameItems.six_btn, LibrarySystem.FrameItems.calculatorFrameItems.three_btn, LibrarySystem.FrameItems.calculatorFrameItems.two_btn, LibrarySystem.FrameItems.calculatorFrameItems.zero_btn});

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.calculatorFrameItems.main_panel);
                                LibrarySystem.FrameItems.calculatorFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Calculator_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.Calculator_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.CalculatorFrame.getContentPane());
                                LibrarySystem.FrameList.CalculatorFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.calculatorFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameList.CalculatorFrame.pack();
		}
		
		public void designSettingsFrame()
		{
				LibrarySystem.FrameList.SettingsFrame.setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.SettingsFrame.setResizable(false);
				
				javax.swing.GroupLayout settingstree_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.settingstree_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.settingstree_panel.setLayout(settingstree_panelLayout);
                                settingstree_panelLayout.setHorizontalGroup(
                                                settingstree_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.settingstree_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                );
                                settingstree_panelLayout.setVerticalGroup(
                                                settingstree_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.settingstree_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setBackground(new java.awt.Color(204, 204, 255));

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.tab_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 420, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 384, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.settingsFrameItems.main_panel);
                                LibrarySystem.FrameItems.settingsFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.settingstree_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.tab_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.settingstree_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.SettingsFrame.getContentPane());
                                LibrarySystem.FrameList.SettingsFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.settingsFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameList.SettingsFrame.pack();
		}
		
		public void designLoginFrame()
		{
				LibrarySystem.FrameList.LoginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				LibrarySystem.FrameList.LoginFrame.setResizable(false);
				
				javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.loginFrameItems.main_panel);
                                LibrarySystem.FrameItems.loginFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addGap(94, 94, 94)
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.loginprompt_label, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.forgotpassword_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.password_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.username_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.password_password)
                                                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.username_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox)
                                                                .addContainerGap(22, Short.MAX_VALUE))
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.loginprompt_label)
                                                                .addGap(36, 36, 36)
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.username_label)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.username_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.password_label)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.password_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.rememberpassword_checkbox))
                                                                .addGap(58, 58, 58)
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.login_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.exit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.forgotpassword_btn))
                                                                .addContainerGap(50, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.LoginFrame.getContentPane());
                                LibrarySystem.FrameList.LoginFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.loginFrameItems.main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );

                                LibrarySystem.FrameList.LoginFrame.pack();
		}
		
		public void designNavigationFrame()
		{		
				LibrarySystem.FrameList.NavigationFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
				javax.swing.GroupLayout tree_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tree_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tree_panel.setLayout(tree_panelLayout);
                                tree_panelLayout.setHorizontalGroup(
                                                tree_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tree_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                );
                                tree_panelLayout.setVerticalGroup(
                                                tree_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tree_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                                );

                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setBackground(new java.awt.Color(204, 204, 255));

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 633, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 618, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.main_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.main_panel.setLayout(main_panelLayout);
                                main_panelLayout.setHorizontalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tree_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tab_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                main_panelLayout.setVerticalGroup(
                                                main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(main_panelLayout.createSequentialGroup()
                                                                .addGap(11, 11, 11)
                                                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tab_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.tree_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );

                                LibrarySystem.FrameList.NavigationFrame.setJMenuBar(LibrarySystem.FrameItems.navigationFrameItems.MainMenuBar);		
				
                                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(LibrarySystem.FrameList.NavigationFrame.getContentPane());
                                LibrarySystem.FrameList.NavigationFrame.getContentPane().setLayout(layout);
                                layout.setHorizontalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                layout.setVerticalGroup(
                                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.navigationFrameItems.main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
                                LibrarySystem.FrameList.NavigationFrame.pack();
		}
}