package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPopupMenu;

import com.zfqjava.swing.JCalendar;
import com.zfqjava.swing.cell.AttributesProvider;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import javax.swing.event.*;

import java.util.Date;
import java.text.*;

import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import com.zfqjava.swing.JCalendar;
import com.zfqjava.swing.cell.*;
import com.zfqjava.swing.AComboBox;
import com.zfqjava.swing.JBean;
import com.zfqjava.swing.JCommonPane;
import libsys.general.LIBSYSSystem;

public class CalendarGenerator implements ActionListener
{
		LIBSYSSystem LibrarySystem;
		ActionEvent ae;
		
		public CalendarGenerator(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				this.ae = ae;
				showCalendar();
		}
		
		private void showCalendar()  
		{
				final JCalendar calendar = new JCalendar();
				calendar.setCellProvider(new DefaultAttributesProvider());
				calendar.addActionListener(new ActionListener() 
				{
						public void actionPerformed(ActionEvent e) 
						{
								setValue(calendar.getTime());
								checkDate();
								hidePopup();
						}
				});
				calendar.addChangeListener(new ChangeListener() 
				{
						public void stateChanged(ChangeEvent e) 
						{
								setValue(calendar.getTime());
						}
				});
				
				popup = new JPopupMenu("Calendar");
				popup.setPopupSize(190, 190);
				popup.add(calendar);
				setValue(calendar.getTime());
				popup.show(LibrarySystem.FrameList.NavigationFrame, getPopupX(), getPopupY());
		}
		
		public void checkDate() 
		{
				SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
				try
				{
						Date  borrowdate = format.parse(LibrarySystem.FrameItems.borrowingPanelItems.bookborrowdate_btn.getText());
						Date duedate=format.parse(LibrarySystem.FrameItems.borrowingPanelItems.bookduedate_btn.getText());
						if(duedate.compareTo(borrowdate)<0)
						{
								LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn.setEnabled(false);
								LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.setEnabled(false);
						}
						else
						{
								LibrarySystem.FrameItems.borrowingPanelItems.borrowingtransmit_btn.setEnabled(true);
								LibrarySystem.FrameItems.borrowingPanelItems.borrowingprint_btn.setEnabled(true);
						}
				}
				catch(Exception e)
				{
						e.printStackTrace();
				}
				
		}
		
		private static class DefaultAttributesProvider implements AttributesProvider 
		{
				private SimpleAttributeSet a;
				public DefaultAttributesProvider() 
				{
						a = new SimpleAttributeSet();
						StyleConstants.setForeground(a, Color.red);
						StyleConstants.setBackground(a, Color.yellow);
				}
				
				public AttributeSet getAttributes(Object value) 
				{
						if(value != null) {
								int day = ((Integer)value).intValue();
								switch(day) {
										case 101:
										case 301:
										case 501:
										case 701:
										case 2301:
												return a;
								}
						}
						return null;
				}
		}
		
		protected void setValue(Date date) 
		{
				((JButton)(ae.getSource())).setText(formatDate(date));
		}
		
		private String formatDate(Date date) 
		{
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return format.format(date);
		}
		
		private void hidePopup() 
		{
				popup.setVisible(false);
		}
		
		private int getPopupX() 
		{
				int width = popup.getPreferredSize().width;
				
				Rectangle r = ((JButton)(ae.getSource())).getBounds();
				
				int x = r.x;
				return (x + 195);
		}
		
		private int getPopupY() 
		{
				Rectangle r = ((JButton)(ae.getSource())).getBounds();
				
				int y = r.y;
				return (y + 86);
		}
		
		private JPopupMenu popup;
}
