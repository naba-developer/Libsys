package libsys.general;

import javax.swing.ImageIcon;
import libsys.general.LIBSYSSystem;
import libsys.gui.items.SettingsFontsAndColorsPanelItems;

public class NavigationPanelsDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public NavigationPanelsDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}	
		
		public void loadBorrowerRecordsPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchparameter_panel);
                                LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchparameter_panel.setLayout(searchparameter_panelLayout);
                                searchparameter_panelLayout.setHorizontalGroup(
                                                searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameter_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_label))
                                                                .addGap(55, 55, 55)
                                                                .addGroup(searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameter_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_label)
                                                                                                .addContainerGap())
                                                                                .addGroup(searchparameter_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                                                                                .addGap(57, 57, 57)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(29, 29, 29))))
                                );
                                searchparameter_panelLayout.setVerticalGroup(
                                                searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameter_panelLayout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_label)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borroweraccno_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.search_btn))
                                                                .addContainerGap(40, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout additonalparameter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowerRecordsPanelItems.additonalparameter_panel);
                                LibrarySystem.FrameItems.borrowerRecordsPanelItems.additonalparameter_panel.setLayout(additonalparameter_panelLayout);
                                additonalparameter_panelLayout.setHorizontalGroup(
                                                additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(additonalparameter_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                                                                                .addGroup(additonalparameter_panelLayout.createSequentialGroup()
                                                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.sex_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(30, 30, 30)
                                                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_label)))
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.address_label))
                                                                .addGap(42, 42, 42)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                additonalparameter_panelLayout.setVerticalGroup(
                                                additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(additonalparameter_panelLayout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(additonalparameter_panelLayout.createSequentialGroup()
                                                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.sex_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(additonalparameter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.address_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(additonalparameter_panelLayout.createSequentialGroup()
                                                                                                .addGap(46, 46, 46)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.pendingtransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.completedtransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.alltransaction_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(28, 28, 28)))
                                                                .addGap(16, 16, 16))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, additonalparameter_panelLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchresultview_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresultview_panel);
                                LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresultview_panel.setLayout(searchresultview_panelLayout);
                                searchresultview_panelLayout.setHorizontalGroup(
                                                searchresultview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                                );
                                searchresultview_panelLayout.setVerticalGroup(
                                                searchresultview_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.serachresultview_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                                );                               

                                javax.swing.GroupLayout searchresult_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_panel);
                                LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_panel.setLayout(searchresult_panelLayout);
                                searchresult_panelLayout.setHorizontalGroup(
                                                searchresult_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresult_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresult_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresultview_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchprogress_label)
                                                                                .addGroup(searchresult_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 617, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresult_panelLayout.setVerticalGroup(
                                                searchresult_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresult_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresult_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_label)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.print_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresultview_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchparameter_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.additonalparameter_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchparameter_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.additonalparameter_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowerRecordsPanelItems.searchresult_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadAllBorrowersPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout orderbypanel1_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel.setLayout(orderbypanel1_panelLayout);
                                orderbypanel1_panelLayout.setHorizontalGroup(
                                                orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborroweraccnumber_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.selectvieworder_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborrowername_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                orderbypanel1_panelLayout.setVerticalGroup(
                                                orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.selectvieworder_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborroweraccnumber_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbyborrowername_checkbox)
                                                                .addContainerGap(48, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout orderbypanel2_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel.setLayout(orderbypanel2_panelLayout);
                                orderbypanel2_panelLayout.setHorizontalGroup(
                                                orderbypanel2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 245, Short.MAX_VALUE)
                                );
                                orderbypanel2_panelLayout.setVerticalGroup(
                                                orderbypanel2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 144, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout displaybutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel.setLayout(displaybutton_panelLayout);
                                displaybutton_panelLayout.setHorizontalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaybutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap(219, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.display_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );
                                displaybutton_panelLayout.setVerticalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaybutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap(110, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.display_btn)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.viewsettings_panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.viewsettings_panel.setLayout(viewsettings_panelLayout);
                                viewsettings_panelLayout.setHorizontalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewsettings_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                );
                                viewsettings_panelLayout.setVerticalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.orderbypanel2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.displaybutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 607, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.print_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewbooks_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBorrowersPanelItems.viewbooks_panel);
                                LibrarySystem.FrameItems.allBorrowersPanelItems.viewbooks_panel.setLayout(viewbooks_panelLayout);
                                viewbooks_panelLayout.setHorizontalGroup(
                                                viewbooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.viewsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(viewbooks_panelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewbooks_panelLayout.setVerticalGroup(
                                                viewbooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewbooks_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.viewsettings_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 833, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBorrowersPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadAllBooksPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout orderbypanel1_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel.setLayout(orderbypanel1_panelLayout);
                                orderbypanel1_panelLayout.setHorizontalGroup(
                                                orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybookaccnumber_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.selectvieworder_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybooktitle_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybookauthors_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                orderbypanel1_panelLayout.setVerticalGroup(
                                                orderbypanel1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.selectvieworder_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybookaccnumber_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybooktitle_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbybookauthors_checkbox)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout orderbypanel2_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel.setLayout(orderbypanel2_panelLayout);
                                orderbypanel2_panelLayout.setHorizontalGroup(
                                                orderbypanel2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel2_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(orderbypanel2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbyeditions_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypublishers_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbyprice_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                orderbypanel2_panelLayout.setVerticalGroup(
                                                orderbypanel2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(orderbypanel2_panelLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypublishers_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbyeditions_checkbox)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbyprice_checkbox)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout displaybutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel.setLayout(displaybutton_panelLayout);
                                displaybutton_panelLayout.setHorizontalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(displaybutton_panelLayout.createSequentialGroup()
                                                                .addGap(99, 99, 99)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.display_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(101, Short.MAX_VALUE))
                                );
                                displaybutton_panelLayout.setVerticalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaybutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap(66, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.display_btn)
                                                                .addGap(55, 55, 55))
                                );

                                javax.swing.GroupLayout viewsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel.setLayout(viewsettings_panelLayout);
                                viewsettings_panelLayout.setHorizontalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewsettings_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                );
                                viewsettings_panelLayout.setVerticalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.orderbypanel2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.displaybutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 605, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.print_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresults_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewbooks_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allBooksPanelItems.viewbooks_panel);
                                LibrarySystem.FrameItems.allBooksPanelItems.viewbooks_panel.setLayout(viewbooks_panelLayout);
                                viewbooks_panelLayout.setHorizontalGroup(
                                                viewbooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(viewbooks_panelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewbooks_panelLayout.setVerticalGroup(
                                                viewbooks_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewbooks_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.viewsettings_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allBooksPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadAllFinesPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout viewparameters1_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel);
                                LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel.setLayout(viewparameters1_panelLayout);
                                viewparameters1_panelLayout.setHorizontalGroup(
                                                viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allpaidfines_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.selectviewsettings_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allfines_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                viewparameters1_panelLayout.setVerticalGroup(
                                                viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.selectviewsettings_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allpaidfines_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allunpaidfines_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.allfines_checkbox)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchduration_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel);
                                LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel.setLayout(searchduration_panelLayout);
                                searchduration_panelLayout.setHorizontalGroup(
                                                searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.logduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.selectduration_label, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(255, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchduration_panelLayout.createSequentialGroup()
                                                                .addContainerGap(402, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.displayfines_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );
                                searchduration_panelLayout.setVerticalGroup(
                                                searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.selectduration_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.logduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.displayfines_btn)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel);
                                LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel.setLayout(viewsettings_panelLayout);
                                viewsettings_panelLayout.setHorizontalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewsettings_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewsettings_panelLayout.setVerticalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.viewparameters1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchduration_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 609, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.print_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresults_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewfines_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.allFinesPanelItems.viewfines_panel);
                                LibrarySystem.FrameItems.allFinesPanelItems.viewfines_panel.setLayout(viewfines_panelLayout);
                                viewfines_panelLayout.setHorizontalGroup(
                                                viewfines_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(viewfines_panelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewfines_panelLayout.setVerticalGroup(
                                                viewfines_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewfines_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.viewsettings_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.allFinesPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadTransactionsPanel()
		{
				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout specificbuttongroup_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel.setLayout(specificbuttongroup_panelLayout);
                                specificbuttongroup_panelLayout.setHorizontalGroup(
                                                specificbuttongroup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificbuttongroup_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(specificbuttongroup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificmonth_radiobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificdate_radiobutton)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificyear_radiobutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                specificbuttongroup_panelLayout.setVerticalGroup(
                                                specificbuttongroup_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificbuttongroup_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificdate_radiobutton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificmonth_radiobutton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificyear_radiobutton)
                                                                .addContainerGap(17, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout customdate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.customdate_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.customdate_panel.setLayout(customdate_panelLayout);
                                customdate_panelLayout.setHorizontalGroup(
                                                customdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(customdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(customdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.currenttransactions_radiobutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.customdaterange_radiobutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                                                .addContainerGap(12, Short.MAX_VALUE))
                                );
                                customdate_panelLayout.setVerticalGroup(
                                                customdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(customdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.customdaterange_radiobutton)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.currenttransactions_radiobutton)
                                                                .addContainerGap(58, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 572, Short.MAX_VALUE)
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 129, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout transactionsparameters_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel.setLayout(transactionsparameters_panelLayout);
                                transactionsparameters_panelLayout.setHorizontalGroup(
                                                transactionsparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(transactionsparameters_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.customdate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                );
                                transactionsparameters_panelLayout.setVerticalGroup(
                                                transactionsparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.specificbuttongroup_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.customdate_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout transactionviewtype_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel.setLayout(transactionviewtype_panelLayout);
                                transactionviewtype_panelLayout.setHorizontalGroup(
                                                transactionviewtype_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(transactionviewtype_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_label, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(646, Short.MAX_VALUE))
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                transactionviewtype_panelLayout.setVerticalGroup(
                                                transactionviewtype_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(transactionviewtype_panelLayout.createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionsparameters_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(19, 19, 19))
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 475, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.deleteselected_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.print_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresults_label)
                                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.deleteselected_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewtransactions_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.viewtransactions_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.viewtransactions_panel.setLayout(viewtransactions_panelLayout);
                                viewtransactions_panelLayout.setHorizontalGroup(
                                                viewtransactions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(viewtransactions_panelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewtransactions_panelLayout.setVerticalGroup(
                                                viewtransactions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewtransactions_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.transactionviewtype_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 841, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.transactionPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSystemLogPanel()
		{				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout viewparameters1_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel.setLayout(viewparameters1_panelLayout);
                                viewparameters1_panelLayout.setHorizontalGroup(
                                                viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectviewsettings_label, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                viewparameters1_panelLayout.setVerticalGroup(
                                                viewparameters1_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters1_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectviewsettings_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewlogonlogofflog_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewapplicationlockopenlog_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.systemlogclearance_checkbox)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout viewparameters2_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel.setLayout(viewparameters2_panelLayout);
                                viewparameters2_panelLayout.setHorizontalGroup(
                                                viewparameters2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters2_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(viewparameters2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.blank1_label, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox))
                                                                .addContainerGap())
                                );
                                viewparameters2_panelLayout.setVerticalGroup(
                                                viewparameters2_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters2_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.blank1_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdataentrylog_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdataupdatelog_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdatadeletelog_checkbox)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout viewparameters3_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel.setLayout(viewparameters3_panelLayout);
                                viewparameters3_panelLayout.setHorizontalGroup(
                                                viewparameters3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters3_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(viewparameters3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.blank2_label, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox)
                                                                                .addGroup(viewparameters3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                );
                                viewparameters3_panelLayout.setVerticalGroup(
                                                viewparameters3_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewparameters3_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.blank2_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewdatasearchlog_checkbox)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewsettingschangelog_checkbox)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectall_checkbox)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchduration_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel.setLayout(searchduration_panelLayout);
                                searchduration_panelLayout.setHorizontalGroup(
                                                searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                                                .addGap(10, 10, 10)
                                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.logduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectduration_label, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(116, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchduration_panelLayout.createSequentialGroup()
                                                                .addContainerGap(281, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );
                                searchduration_panelLayout.setVerticalGroup(
                                                searchduration_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchduration_panelLayout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.selectduration_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.logduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.displaylog_btn)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewsettings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel.setLayout(viewsettings_panelLayout);
                                viewsettings_panelLayout.setHorizontalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewsettings_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                );
                                viewsettings_panelLayout.setVerticalGroup(
                                                viewsettings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters1_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters2_panel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewparameters3_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchduration_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 605, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.print_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresults_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout viewtransactions_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.systemLogPanelItems.viewsystemlog_panel);
                                LibrarySystem.FrameItems.systemLogPanelItems.viewsystemlog_panel.setLayout(viewtransactions_panelLayout);
                                viewtransactions_panelLayout.setHorizontalGroup(
                                                viewtransactions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(viewtransactions_panelLayout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                viewtransactions_panelLayout.setVerticalGroup(
                                                viewtransactions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(viewtransactions_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.viewsettings_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.systemLogPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadDeleteBorrowersPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchparameters_panel);
                                LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchparameters_panel.setLayout(searchparameters_panelLayout);
                                searchparameters_panelLayout.setHorizontalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_label))
                                                                .addContainerGap())
                                );
                                searchparameters_panelLayout.setVerticalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.search_btn))
                                                                .addContainerGap(14, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchresults_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresults_panel);
                                LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresults_panel.setLayout(searchresults_panelLayout);
                                searchresults_panelLayout.setHorizontalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_label)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                searchresults_panelLayout.setVerticalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_label)
                                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.print_btn)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.deleteselected_btn)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
                                                                .addGap(17, 17, 17)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout borrowersearch_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowersearch_panel);
                                LibrarySystem.FrameItems.deleteBorrowersPanelItems.borrowersearch_panel.setLayout(borrowersearch_panelLayout);
                                borrowersearch_panelLayout.setHorizontalGroup(
                                                borrowersearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchparameters_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                borrowersearch_panelLayout.setVerticalGroup(
                                                borrowersearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowersearch_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchparameters_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBorrowersPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadDeleteBooksPanel()
		{
				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBooksPanelItems.searchparameters_Panel);
                                LibrarySystem.FrameItems.deleteBooksPanelItems.searchparameters_Panel.setLayout(searchparameters_PanelLayout);
                                searchparameters_PanelLayout.setHorizontalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(234, 234, 234))
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                                                                                                .addGap(33, 33, 33)))
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_label)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_label)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE))
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(63, 63, 63)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_label)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_spinner))))))
                                                                .addContainerGap())
                                );
                                searchparameters_PanelLayout.setVerticalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.search_btn)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.booktitle_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookauthor_label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 470, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.deleteselected_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_label)
                                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.print_btn)
                                                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.deleteselected_btn)))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout bookssearch_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_panel);
                                LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_panel.setLayout(bookssearch_panelLayout);
                                bookssearch_panelLayout.setHorizontalGroup(
                                                bookssearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                bookssearch_panelLayout.setVerticalGroup(
                                                bookssearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookssearch_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.deleteBooksPanelItems.bookssearch_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadInsertBorrowersPanel()
		{
				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout borrowerentry_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerentry_panel);
                                LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerentry_panel.setLayout(borrowerentry_panelLayout);
                                borrowerentry_panelLayout.setHorizontalGroup(
                                                borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.uploadimage_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweremail_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddresstextarea_scrollpane)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.browse_btn))
                                                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                                                .addGap(228, 228, 228)
                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.addborrower_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(70, Short.MAX_VALUE))
                                );
                                borrowerentry_panelLayout.setVerticalGroup(
                                                borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowersex_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweremail_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddress_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.uploadimage_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagepath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.browse_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.addborrower_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.print_btn))
                                                                .addContainerGap(47, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerentry_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.insertBorrowersPanelItems.borrowerentry_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadInsertBooksPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout WorkSpaceBookEntry_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.insertBooksPanelItems.WorkSpaceBookEntry_Panel);
                                LibrarySystem.FrameItems.insertBooksPanelItems.WorkSpaceBookEntry_Panel.setLayout(WorkSpaceBookEntry_PanelLayout);
                                WorkSpaceBookEntry_PanelLayout.setHorizontalGroup(
                                                WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                                                                                .addGap(299, 299, 299))
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE))
                                                                                                .addGap(299, 299, 299))))
                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                .addGap(189, 189, 189)
                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(335, Short.MAX_VALUE))
                                );
                                WorkSpaceBookEntry_PanelLayout.setVerticalGroup(
                                                WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.booktitle_label))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookauthor_label)
                                                                                                .addGap(182, 182, 182))
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(54, 54, 54)))
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookpublisher_label))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_label)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(37, 37, 37)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.bookprice_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.submit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.print_btn))
                                                                .addContainerGap(77, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_PanelLayout);
                                tab_PanelLayout.setHorizontalGroup(
                                                tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.BookEntryScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
                                );
                                tab_PanelLayout.setVerticalGroup(
                                                tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.insertBooksPanelItems.BookEntryScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadUpdateBorrowersPanel()
		{
				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchparameters_panel);
                                LibrarySystem.FrameItems.updateBorrowerPanelItems.searchparameters_panel.setLayout(searchparameters_panelLayout);
                                searchparameters_panelLayout.setHorizontalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE))
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_label))
                                                                .addContainerGap())
                                );
                                searchparameters_panelLayout.setVerticalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.search_btn))
                                                                .addContainerGap(14, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchresults_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresults_panel);
                                LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresults_panel.setLayout(searchresults_panelLayout);
                                searchresults_panelLayout.setHorizontalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 608, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.printsearchresults_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                searchresults_panelLayout.setVerticalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.printsearchresults_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                                                .addGap(17, 17, 17)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchborrowerstoupdate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchborrowerstoupdate_panel);
                                LibrarySystem.FrameItems.updateBorrowerPanelItems.searchborrowerstoupdate_panel.setLayout(searchborrowerstoupdate_panelLayout);
                                searchborrowerstoupdate_panelLayout.setHorizontalGroup(
                                                searchborrowerstoupdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchparameters_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                searchborrowerstoupdate_panelLayout.setVerticalGroup(
                                                searchborrowerstoupdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchborrowerstoupdate_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchparameters_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout borrowerentry_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowerentry_panel);
                                LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowerentry_panel.setLayout(borrowerentry_panelLayout);
                                borrowerentry_panelLayout.setHorizontalGroup(
                                                borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newuploadimage_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_label1, javax.swing.GroupLayout.Alignment.LEADING))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraddresstextarea_scrollpane)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.browse_btn))
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                                                .addGap(228, 228, 228)
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.printupdate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(124, Short.MAX_VALUE))
                                );
                                borrowerentry_panelLayout.setVerticalGroup(
                                                borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowerentry_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_label1)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_label1)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowersex_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborrowerphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweremail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newborroweraddress_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(15, 15, 15)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newuploadimage_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagepath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.browse_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.newimagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                                .addGroup(borrowerentry_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.submit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.printupdate_btn))
                                                                .addContainerGap(83, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout updatebook_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBorrowerPanelItems.updatebook_panel);
                                LibrarySystem.FrameItems.updateBorrowerPanelItems.updatebook_panel.setLayout(updatebook_panelLayout);
                                updatebook_panelLayout.setHorizontalGroup(
                                                updatebook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowerentry_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                updatebook_panelLayout.setVerticalGroup(
                                                updatebook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.borrowerentry_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 817, Short.MAX_VALUE)
                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.updateborrowers_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                                                                                .addGap(0, 0, 0)))
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 713, Short.MAX_VALUE)
                                                .addGroup(tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(tab_panelLayout.createSequentialGroup()
                                                                                .addGap(0, 0, 0)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBorrowerPanelItems.updateborrowers_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                                                                                .addGap(0, 0, 0)))
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadUpdateBooksPanel()
		{				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBooksPanelItems.searchparameters_Panel);
                                LibrarySystem.FrameItems.updateBooksPanelItems.searchparameters_Panel.setLayout(searchparameters_PanelLayout);
                                searchparameters_PanelLayout.setHorizontalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.booktitle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(234, 234, 234))
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                                                                                                .addGap(33, 33, 33)))
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookauthor_label)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookpublisher_label)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE))
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(63, 63, 63)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_label)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_spinner))))))
                                                                .addContainerGap())
                                );
                                searchparameters_PanelLayout.setVerticalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.search_btn)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.booktitle_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.bookauthor_label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                                                .addContainerGap(18, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 589, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.print_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchbookstoupdate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBooksPanelItems.searchbookstoupdate_panel);
                                LibrarySystem.FrameItems.updateBooksPanelItems.searchbookstoupdate_panel.setLayout(searchbookstoupdate_panelLayout);
                                searchbookstoupdate_panelLayout.setHorizontalGroup(
                                                searchbookstoupdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                searchbookstoupdate_panelLayout.setVerticalGroup(
                                                searchbookstoupdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchbookstoupdate_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout WorkSpaceBookEntry_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBooksPanelItems.WorkSpaceBookEntry_Panel);
                                LibrarySystem.FrameItems.updateBooksPanelItems.WorkSpaceBookEntry_Panel.setLayout(WorkSpaceBookEntry_PanelLayout);
                                WorkSpaceBookEntry_PanelLayout.setHorizontalGroup(
                                                WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthors_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                                                                                                .addGap(299, 299, 299))
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                                                                                                .addGap(299, 299, 299))))
                                );
                                WorkSpaceBookEntry_PanelLayout.setVerticalGroup(
                                                WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                .addGap(46, 46, 46)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbooktitle_label))
                                                                .addGap(20, 20, 20)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookauthors_label)
                                                                                                .addGap(126, 126, 126))
                                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(35, 35, 35)))
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookpublisher_label))
                                                                .addGap(45, 45, 45)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_label)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(37, 37, 37)
                                                                .addGroup(WorkSpaceBookEntry_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.newbookprice_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.submit_btn)
                                                                .addGap(67, 67, 67))
                                );

                                javax.swing.GroupLayout updatebook_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.updateBooksPanelItems.updatebook_panel);
                                LibrarySystem.FrameItems.updateBooksPanelItems.updatebook_panel.setLayout(updatebook_panelLayout);
                                updatebook_panelLayout.setHorizontalGroup(
                                                updatebook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.WorkSpaceBookEntry_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                updatebook_panelLayout.setVerticalGroup(
                                                updatebook_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.WorkSpaceBookEntry_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.updatebooks_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 819, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.updateBooksPanelItems.updatebooks_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadFinesImposePanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout WorkspaceImposeFine_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.finesImposePanelItems.WorkspaceImposeFine_Panel);
                                LibrarySystem.FrameItems.finesImposePanelItems.WorkspaceImposeFine_Panel.setLayout(WorkspaceImposeFine_PanelLayout);
                                WorkspaceImposeFine_PanelLayout.setHorizontalGroup(
                                                WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowername_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.finereason_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_label))
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(4, 4, 4)
                                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                                                                                                                                                .addGap(90, 90, 90)
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox))))
                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jLabel3)
                                                                                                .addGap(462, 462, 462))
                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addGap(67, 67, 67)
                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(334, 334, 334))
                                );
                                WorkspaceImposeFine_PanelLayout.setVerticalGroup(
                                                WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addGap(42, 42, 42)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowername_label))
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowersex_label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borrowerphonenumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweremail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.borroweraddress_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                                                                                .addGap(39, 39, 39)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_label)
                                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.fineamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.paynow_checkbox)))
                                                                                                .addGap(41, 41, 41)
                                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.finereason_label))
                                                                                                .addGap(34, 34, 34))
                                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createSequentialGroup()
                                                                                                .addGap(40, 40, 40)
                                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(WorkspaceImposeFine_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.imposefine_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.print_btn))
                                                                .addGap(36, 36, 36))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.ImposeFineScroll_Pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.finesImposePanelItems.ImposeFineScroll_Pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadFinesPaymentPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchresults_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.finesPaymentPanelItems.searchresults_panel);
                                LibrarySystem.FrameItems.finesPaymentPanelItems.searchresults_panel.setLayout(searchresults_panelLayout);
                                searchresults_panelLayout.setHorizontalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_label, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetailsprint_btn)
                                                                .addContainerGap())
                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                                );
                                searchresults_panelLayout.setVerticalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_label)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetailsprint_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finedetails_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout finespayment_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_panel);
                                LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_panel.setLayout(finespayment_panelLayout);
                                finespayment_panelLayout.setHorizontalGroup(
                                                finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addContainerGap())
                                                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweremail_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_label, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                                                                                                                .addGap(69, 69, 69)))
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.email_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.payfine_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.print_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                                .addGap(180, 180, 180))))
                                );
                                finespayment_panelLayout.setVerticalGroup(
                                                finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(finespayment_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.imagedestination_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, finespayment_panelLayout.createSequentialGroup()
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borrowerphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweremail_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddress_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(finespayment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_label)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.fineamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.payfine_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.print_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.finesPaymentPanelItems.finespayment_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSearchBorrowerspanel()
		{
				
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchparameters_panel);
                                LibrarySystem.FrameItems.searchBorrowerPanelItems.searchparameters_panel.setLayout(searchparameters_panelLayout);
                                searchparameters_panelLayout.setHorizontalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE))
                                                                                                .addGap(145, 145, 145)
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_label))
                                                                .addContainerGap())
                                );
                                searchparameters_panelLayout.setVerticalGroup(
                                                searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_panelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.search_btn))
                                                                .addContainerGap(14, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchresults_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresults_panel);
                                LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresults_panel.setLayout(searchresults_panelLayout);
                                searchresults_panelLayout.setHorizontalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 633, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_label)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE))
                                                                .addContainerGap())
                                );
                                searchresults_panelLayout.setVerticalGroup(
                                                searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_label)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.print_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresult_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                                                                .addGap(17, 17, 17)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout borrowersearch_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowersearch_panel);
                                LibrarySystem.FrameItems.searchBorrowerPanelItems.borrowersearch_panel.setLayout(borrowersearch_panelLayout);
                                borrowersearch_panelLayout.setHorizontalGroup(
                                                borrowersearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchparameters_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                borrowersearch_panelLayout.setVerticalGroup(
                                                borrowersearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowersearch_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchparameters_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.searchresults_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );                               

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBorrowerPanelItems.tabpanel_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSearchBooksPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout searchparameters_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBooksPanelItems.searchparameters_Panel);
                                LibrarySystem.FrameItems.searchBooksPanelItems.searchparameters_Panel.setLayout(searchparameters_PanelLayout);
                                searchparameters_PanelLayout.setHorizontalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_label, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(234, 234, 234))
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_label, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                                                                                                .addGap(33, 33, 33)))
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_label)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_label)
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE))
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(63, 63, 63)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_label)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_spinner))))))
                                                                .addContainerGap())
                                );
                                searchparameters_PanelLayout.setVerticalGroup(
                                                searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                .addGap(14, 14, 14)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookedition_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.search_btn)
                                                                                .addGroup(searchparameters_PanelLayout.createSequentialGroup()
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.booktitle_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookauthor_label))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(searchparameters_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))))
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout searchresults_PanelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_Panel);
                                LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_Panel.setLayout(searchresults_PanelLayout);
                                searchresults_PanelLayout.setHorizontalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_label)
                                                                                .addGroup(searchresults_PanelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                searchresults_PanelLayout.setVerticalGroup(
                                                searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchresults_PanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(searchresults_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_label)
                                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.print_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresultstable_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_label)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchprogress_progressbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap())
                                );

                                javax.swing.GroupLayout bookssearch_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_panel);
                                LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_panel.setLayout(bookssearch_panelLayout);
                                bookssearch_panelLayout.setHorizontalGroup(
                                                bookssearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                bookssearch_panelLayout.setVerticalGroup(
                                                bookssearch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookssearch_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchparameters_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.searchresults_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.searchBooksPanelItems.bookssearch_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadQueryBrowserPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout queryarea_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.queryarea_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.queryarea_panel.setLayout(queryarea_panelLayout);
                                queryarea_panelLayout.setHorizontalGroup(
                                                queryarea_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(queryarea_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(queryarea_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querytextarea_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queryarea_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_label, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                                                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap())
                                );
                                queryarea_panelLayout.setVerticalGroup(
                                                queryarea_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(queryarea_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(queryarea_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.executequery_label))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querytextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout table_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.table_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.table_panel.setLayout(table_panelLayout);
                                table_panelLayout.setHorizontalGroup(
                                                table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.tables_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                                );
                                table_panelLayout.setVerticalGroup(
                                                table_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.tables_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout databasebrowser_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.databasebrowser_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.databasebrowser_panel.setLayout(databasebrowser_panelLayout);
                                databasebrowser_panelLayout.setHorizontalGroup(
                                                databasebrowser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.queryarea_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.table_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                databasebrowser_panelLayout.setVerticalGroup(
                                                databasebrowser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(databasebrowser_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.queryarea_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.table_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout browsedatabase_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.browsedatabase_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.browsedatabase_panel.setLayout(browsedatabase_panelLayout);
                                browsedatabase_panelLayout.setHorizontalGroup(
                                                browsedatabase_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.browsedatabase_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                                );
                                browsedatabase_panelLayout.setVerticalGroup(
                                                browsedatabase_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.browsedatabase_scrollpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                                );
				
				

                               javax.swing.GroupLayout previewdatabase_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.previewdatabase_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.previewdatabase_panel.setLayout(previewdatabase_panelLayout);
                                previewdatabase_panelLayout.setHorizontalGroup(
                                                previewdatabase_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.prewiewdatabasedesignimages_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
                                );
                                previewdatabase_panelLayout.setVerticalGroup(
                                                previewdatabase_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.prewiewdatabasedesignimages_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout querybrowser_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_panel);
                                LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_panel.setLayout(querybrowser_panelLayout);
                                querybrowser_panelLayout.setHorizontalGroup(
                                                querybrowser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                                );
                                querybrowser_panelLayout.setVerticalGroup(
                                                querybrowser_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.queryBrowserPanelItems.querybrowser_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadNavigationBooksBorrowingsPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout borrowingbooksdata_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel);
                                LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel.setLayout(borrowingbooksdata_panelLayout);
                                borrowingbooksdata_panelLayout.setHorizontalGroup(
                                                borrowingbooksdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowingbooksdata_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(borrowingbooksdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookprice_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookedition_lbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(borrowingbooksdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(407, Short.MAX_VALUE))
                                );
                                borrowingbooksdata_panelLayout.setVerticalGroup(
                                                borrowingbooksdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowingbooksdata_panelLayout.createSequentialGroup()
                                                                .addGroup(borrowingbooksdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(borrowingbooksdata_panelLayout.createSequentialGroup()
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_label)
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_label)
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_label)
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_label)
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookedition_lbl)
                                                                                                .addGap(17, 17, 17)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookprice_label)
                                                                                                .addGap(64, 64, 64)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_label)
                                                                                                .addGap(24, 24, 24)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_label))
                                                                                .addGroup(borrowingbooksdata_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.booktitle_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookauthor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookpublisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookedition_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(58, 58, 58)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(26, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout borrowerimagelabelholder_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowingPanelItems.borrowerimagelabelholder_panel);
                                LibrarySystem.FrameItems.borrowingPanelItems.borrowerimagelabelholder_panel.setLayout(borrowerimagelabelholder_panelLayout);
                                borrowerimagelabelholder_panelLayout.setHorizontalGroup(
                                                borrowerimagelabelholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                );
                                borrowerimagelabelholder_panelLayout.setVerticalGroup(
                                                borrowerimagelabelholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.imagedestination_label, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                );

                                javax.swing.GroupLayout borrowingstudentsdata_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel);
                                LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel.setLayout(borrowingstudentsdata_panelLayout);
                                borrowingstudentsdata_panelLayout.setHorizontalGroup(
                                                borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                .addContainerGap(708, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(20, 20, 20))
                                                .addGroup(borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweremail_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowername_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.email_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerimagelabelholder_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                                                                .addContainerGap())
                                                .addGroup(borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                .addGap(117, 117, 117)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(44, 44, 44)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(320, Short.MAX_VALUE))
                                );
                                borrowingstudentsdata_panelLayout.setVerticalGroup(
                                                borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerimagelabelholder_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, borrowingstudentsdata_panelLayout.createSequentialGroup()
                                                                                                .addGap(20, 20, 20)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowername_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowerphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweremail_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraddress_label)
                                                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                                                .addGroup(borrowingstudentsdata_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.exit_btn)
                                                                .addGap(22, 22, 22))
                                );

                                javax.swing.GroupLayout booksborrowingcomponentholder_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.borrowingPanelItems.booksborrowingcomponentholder_panel);
                                LibrarySystem.FrameItems.borrowingPanelItems.booksborrowingcomponentholder_panel.setLayout(booksborrowingcomponentholder_panelLayout);
                                booksborrowingcomponentholder_panelLayout.setHorizontalGroup(
                                                booksborrowingcomponentholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 812, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
                                booksborrowingcomponentholder_panelLayout.setVerticalGroup(
                                                booksborrowingcomponentholder_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 732, Short.MAX_VALUE)
                                                .addGroup(booksborrowingcomponentholder_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingbooksdata_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingstudentsdata_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );

                                LibrarySystem.FrameItems.borrowingPanelItems.borrowingspanelholder_scrollpane.setViewportView(LibrarySystem.FrameItems.borrowingPanelItems.booksborrowingcomponentholder_panel);

                                javax.swing.GroupLayout bookborrowings_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(bookborrowings_panelLayout);
                                bookborrowings_panelLayout.setHorizontalGroup(
                                                bookborrowings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingspanelholder_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                                );
                                bookborrowings_panelLayout.setVerticalGroup(
                                                bookborrowings_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.borrowingPanelItems.borrowingspanelholder_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadNavigationBooksReturnsPanel()
		{
				LibrarySystem.FrameItems.navigationFrameItems.tab_panel.removeAll();				
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout bookreturns_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.returnPanelItems.booksreturncomponentholder_panel);
                                LibrarySystem.FrameItems.returnPanelItems.booksreturncomponentholder_panel.setLayout(bookreturns_panelLayout);
                                bookreturns_panelLayout.setHorizontalGroup(
                                                bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookprice_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookedition_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookpublisher_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookauthor_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookname_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bookreturns_panelLayout.createSequentialGroup()
                                                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.fineamount_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookborrowddate_label, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.fineamount_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt, javax.swing.GroupLayout.Alignment.LEADING))))
                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                                                .addGap(69, 69, 69)
                                                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookprice_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookname_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookedition_txt)))
                                                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                                                .addGap(54, 54, 54)
                                                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox)
                                                                                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookduedate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(54, 54, 54)
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookreturndate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox))))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookreturns_panelLayout.createSequentialGroup()
                                                                                                                                .addGap(219, 219, 219)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.finereason_label, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                .addGap(183, 183, 183)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnstransmit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(56, 56, 56)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnprint_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweraddress_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweremail_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowerphone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowersex_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowername_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowernumber_label))
                                                                                                .addGap(148, 148, 148)
                                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowername_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.imagedestination_label, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(76, Short.MAX_VALUE))
                                );
                                bookreturns_panelLayout.setVerticalGroup(
                                                bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookaccnumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookname_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookauthor_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookauthor_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookpublisher_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookpublisher_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookedition_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookedition_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookprice_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookprice_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(30, 30, 30)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookborrowddate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookduedate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookduedate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookborrowdate_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookreturndate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.bookreturndate_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.imposefine_checkbox))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.fineamount_label)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.finereason_label)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.fineamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.finepaid_checkbox))
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(58, 58, 58)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowernumber_label)
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowername_label)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowersex_label)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowerphone_label)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweremail_label)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweraddress_label))
                                                                                .addGroup(bookreturns_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowernumber_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowername_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowersex_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borrowerphone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweremail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.borroweraddresstextarea_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.imagedestination_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                                                .addGroup(bookreturns_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnstransmit_btn)
                                                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnprint_btn))
                                                                .addContainerGap(47, Short.MAX_VALUE))
                                );

                                

                                javax.swing.GroupLayout tab_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.navigationFrameItems.tab_panel);
                                LibrarySystem.FrameItems.navigationFrameItems.tab_panel.setLayout(tab_panelLayout);
                                tab_panelLayout.setHorizontalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnspanelholder_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                                );
                                tab_panelLayout.setVerticalGroup(
                                                tab_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.returnPanelItems.returnspanelholder_scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
}