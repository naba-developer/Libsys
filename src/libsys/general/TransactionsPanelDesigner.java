package libsys.general;

public class TransactionsPanelDesigner
{
		LIBSYSSystem LibrarySystem;
		
		public TransactionsPanelDesigner(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void loadCurrentTransactionPanelItems()
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addGap(83, 83, 83)
                                                                .addComponent(LibrarySystem.FrameItems.currentTransactionPanelItems.transactionduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(37, 37, 37)
                                                                .addComponent(LibrarySystem.FrameItems.currentTransactionPanelItems.displaytransaction_button, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(38, Short.MAX_VALUE))
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addGap(50, 50, 50)
                                                                .addGroup(parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.currentTransactionPanelItems.transactionduration_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(LibrarySystem.FrameItems.currentTransactionPanelItems.displaytransaction_button))
                                                                .addContainerGap(59, Short.MAX_VALUE))
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadCustomDateRangePanel()
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout startdate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_panel);
                                LibrarySystem.FrameItems.customDateRangePanelItems.startdate_panel.setLayout(startdate_panelLayout);
                                startdate_panelLayout.setHorizontalGroup(
                                                startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(startdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_label, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startyear_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(startdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(71, Short.MAX_VALUE))
                                                                                .addGroup(startdate_panelLayout.createSequentialGroup()
                                                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox, javax.swing.GroupLayout.Alignment.LEADING, 0, 89, Short.MAX_VALUE))
                                                                                                .addContainerGap())))
                                );
                                startdate_panelLayout.setVerticalGroup(
                                                startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(startdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startmonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(startdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startyear_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startyear_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(22, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout enddate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_panel);
                                LibrarySystem.FrameItems.customDateRangePanelItems.enddate_panel.setLayout(enddate_panelLayout);
                                enddate_panelLayout.setHorizontalGroup(
                                                enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(enddate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(enddate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enddate_panelLayout.createSequentialGroup()
                                                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endyear_label, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                                                                                                .addGap(31, 31, 31)))
                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(enddate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(77, Short.MAX_VALUE))
                                                                                .addGroup(enddate_panelLayout.createSequentialGroup()
                                                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner, javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox, javax.swing.GroupLayout.Alignment.LEADING, 0, 89, Short.MAX_VALUE))
                                                                                                .addContainerGap())))
                                );
                                enddate_panelLayout.setVerticalGroup(
                                                enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(enddate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endmonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(enddate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endyear_label)
                                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.endyear_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(22, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout displaybutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.customDateRangePanelItems.displaybutton_panel);
                                LibrarySystem.FrameItems.customDateRangePanelItems.displaybutton_panel.setLayout(displaybutton_panelLayout);
                                displaybutton_panelLayout.setHorizontalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(displaybutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.display_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                                .addContainerGap())
                                );
                                displaybutton_panelLayout.setVerticalGroup(
                                                displaybutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(displaybutton_panelLayout.createSequentialGroup()
                                                                .addGap(51, 51, 51)
                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.display_btn)
                                                                .addContainerGap(55, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.displaybutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.startdate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.enddate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(LibrarySystem.FrameItems.customDateRangePanelItems.displaybutton_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSpecificYearPanel()
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout specificyear_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificYearPanelItems.specificyear_panel);
                                LibrarySystem.FrameItems.specificYearPanelItems.specificyear_panel.setLayout(specificyear_panelLayout);
                                specificyear_panelLayout.setHorizontalGroup(
                                                specificyear_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificyear_panelLayout.createSequentialGroup()
                                                                .addGap(44, 44, 44)
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_label, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                                                .addGap(31, 31, 31)
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                                                .addGap(93, 93, 93))
                                );
                                specificyear_panelLayout.setVerticalGroup(
                                                specificyear_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificyear_panelLayout.createSequentialGroup()
                                                                .addGap(43, 43, 43)
                                                                .addGroup(specificyear_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificdateyear_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(66, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout displaytransactionbutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificYearPanelItems.displaytransactionbutton_panel);
                                LibrarySystem.FrameItems.specificYearPanelItems.displaytransactionbutton_panel.setLayout(displaytransactionbutton_panelLayout);
                                displaytransactionbutton_panelLayout.setHorizontalGroup(
                                                displaytransactionbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displaytransactionbutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap(57, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.displaytransactions_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53))
                                );
                                displaytransactionbutton_panelLayout.setVerticalGroup(
                                                displaytransactionbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(displaytransactionbutton_panelLayout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.displaytransactions_btn)
                                                                .addContainerGap(64, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificyear_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.displaytransactionbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.specificyear_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.specificYearPanelItems.displaytransactionbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSpecificMonthPanel()
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout specificmonth_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificMonthPanelItems.specificmonth_panel);
                                LibrarySystem.FrameItems.specificMonthPanelItems.specificmonth_panel.setLayout(specificmonth_panelLayout);
                                specificmonth_panelLayout.setHorizontalGroup(
                                                specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificmonth_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(specificmonth_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(51, 51, 51))
                                                                                .addGroup(specificmonth_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_label, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                                                                                .addGap(31, 31, 31)))
                                                                .addGroup(specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(specificmonth_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_spinner, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                                                                                .addGap(71, 71, 71))
                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(59, 59, 59))
                                );
                                specificmonth_panelLayout.setVerticalGroup(
                                                specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificmonth_panelLayout.createSequentialGroup()
                                                                .addGap(31, 31, 31)
                                                                .addGroup(specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdatemonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(specificmonth_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificdateyear_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(40, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchbutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificMonthPanelItems.searchbutton_panel);
                                LibrarySystem.FrameItems.specificMonthPanelItems.searchbutton_panel.setLayout(searchbutton_panelLayout);
                                searchbutton_panelLayout.setHorizontalGroup(
                                                searchbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchbutton_panelLayout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.displaytransactions_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(57, Short.MAX_VALUE))
                                );
                                searchbutton_panelLayout.setVerticalGroup(
                                                searchbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchbutton_panelLayout.createSequentialGroup()
                                                                .addGap(55, 55, 55)
                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.displaytransactions_btn)
                                                                .addContainerGap(51, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificmonth_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.searchbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.specificmonth_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.specificMonthPanelItems.searchbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
		
		public void loadSpecificDatePanel()
		{
				LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.removeAll();
				LibrarySystem.FrameList.NavigationFrame.repaint();
				
				javax.swing.GroupLayout specificdate_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificDatePanelItems.specificdate_panel);
                                LibrarySystem.FrameItems.specificDatePanelItems.specificdate_panel.setLayout(specificdate_panelLayout);
                                specificdate_panelLayout.setHorizontalGroup(
                                                specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                .addGap(51, 51, 51))
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_label, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                                                                                                .addGap(31, 31, 31)))
                                                                .addGroup(specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner)
                                                                                                .addGap(401, 401, 401))
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap(123, Short.MAX_VALUE))
                                                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addContainerGap())))
                                );
                                specificdate_panelLayout.setVerticalGroup(
                                                specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(specificdate_panelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatedate_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdatemonth_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(specificdate_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_label)
                                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdateyear_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(22, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout searchbutton_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.specificDatePanelItems.searchbutton_panel);
                                LibrarySystem.FrameItems.specificDatePanelItems.searchbutton_panel.setLayout(searchbutton_panelLayout);
                                searchbutton_panelLayout.setHorizontalGroup(
                                                searchbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchbutton_panelLayout.createSequentialGroup()
                                                                .addContainerGap(70, Short.MAX_VALUE)
                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.displaytransactions_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(70, 70, 70))
                                );
                                searchbutton_panelLayout.setVerticalGroup(
                                                searchbutton_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(searchbutton_panelLayout.createSequentialGroup()
                                                                .addGap(49, 49, 49)
                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.displaytransactions_btn)
                                                                .addContainerGap(57, Short.MAX_VALUE))
                                );

                                javax.swing.GroupLayout parametersenter_panelLayout = new javax.swing.GroupLayout(LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel);
                                LibrarySystem.FrameItems.transactionPanelItems.parametersenter_panel.setLayout(parametersenter_panelLayout);
                                parametersenter_panelLayout.setHorizontalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(parametersenter_panelLayout.createSequentialGroup()
                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdate_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.searchbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                );
                                parametersenter_panelLayout.setVerticalGroup(
                                                parametersenter_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.specificdate_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(LibrarySystem.FrameItems.specificDatePanelItems.searchbutton_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                );
				
				LibrarySystem.FrameList.NavigationFrame.repaint();
		}
}
