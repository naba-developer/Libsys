package libsys.listeners;

import java.awt.event.KeyEvent;
import java .awt.event.KeyListener;
import libsys.general.LIBSYSSystem;
import libsys.gui.items.CalculatorFrameItems;
import libsys.general.Convert;
import javax.swing.JOptionPane;

public class CalculatorKeyBoardListener implements KeyListener
{		
	public LIBSYSSystem LibrarySystem;
	
	
	public CalculatorKeyBoardListener(LIBSYSSystem LibrarySystem)
	{
			this.LibrarySystem = LibrarySystem;
	}
	public void keyTyped(KeyEvent ke)
	{
		String expression =""; 
		String text;
		if(ke.getKeyChar()=='0')
		{
				
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"0");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="0";
							return;
						}
						LibrarySystem.expression+="0";
		}
		
		if(ke.getKeyChar()=='1')
		{
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "1");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="1";
							return;
						}
						LibrarySystem.expression+="1";
		}
		
		if(ke.getKeyChar()=='2')
		{
				
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "2");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="2";
							return;
						}
						LibrarySystem.expression+="2";
		}
		
		if(ke.getKeyChar()=='3')
		{
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "3");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="3";
							return;
						}
						LibrarySystem.expression+="3";
		}
		
		if(ke.getKeyChar()=='4')
		{
				if( LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "4");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="4";
							return;
						}
						LibrarySystem.expression+="4";
		}
		if(ke.getKeyChar()=='5')
		{
				if( LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "5");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="5";
							return;
						}
						LibrarySystem.expression+="5";
		}
		
		if(ke.getKeyChar()=='6')
		{
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "6");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="6";
							return;
						}
						LibrarySystem.expression+="6";
		}
		
		if(ke.getKeyChar()=='7')
		{
				if( LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "7");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="7";
							return;
						}
						LibrarySystem.expression+="7";
		}
		
		if(ke.getKeyChar()=='8')
		{
				if( LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "8");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="8";
							return;
						}
						LibrarySystem.expression+="8";
		}
		
		if(ke.getKeyChar()=='9')
		{
				if(LibrarySystem.last==")")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
				if(LibrarySystem.last=="=")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText("");
						LibrarySystem.expression="";
				}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() + "9");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="9";
							return;
						}
						LibrarySystem.expression+="9";
		}
		
		if(ke.getKeyChar()=='(')
		{
				if(LibrarySystem.last=="=" || LibrarySystem.last==")"|| LibrarySystem.last=="digit"||LibrarySystem.last==".")
						return;
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"(");
							LibrarySystem.expression="(";
							return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"(");
						LibrarySystem.last="(";

						LibrarySystem.expression+="(";
		}
		
		if(ke.getKeyChar()==')')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="="|| LibrarySystem.last=="(" ||LibrarySystem.last=="op"||LibrarySystem.last=="."||text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+")");
						LibrarySystem.last=")";
						LibrarySystem.expression+=")";
						
		}
		
		if(ke.getKeyChar()=='+')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="(" || text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"+");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="+";
		}
		
		if(ke.getKeyChar()=='-')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"-");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="-";
		}
		
		if(ke.getKeyChar()=='*')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"*");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="*";
		}
		
		if(ke.getKeyChar()=='/')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"/");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="/";
		}
		
		if(ke.getKeyChar()=='%')
		{
				text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="(" ||text.length()==0)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"%");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="%";
		}
		
		if(ke.getKeyChar()=='.')
		{
					text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op" || LibrarySystem.last=="." || LibrarySystem.last=="="||LibrarySystem.last==")"||LibrarySystem.last=="(" || text.length()==0||LibrarySystem.seen)
						return;
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+".");
						LibrarySystem.last=".";
						LibrarySystem.seen=true;
						LibrarySystem.expression+=".";
		}
		
		if(ke.getKeyChar()=='=')
		{
			if(LibrarySystem.expression==null||LibrarySystem.expression.length()==0 || LibrarySystem.last=="=")
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
								
						}
						boolean isValid=Convert.checkExpression(LibrarySystem.expression);
						if(!isValid)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.CalculatorFrame,"You have entered a wrong data");
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
								return;
						}
						
						try
						{
								String result = Convert.evaluateExpression(LibrarySystem.expression);
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(result);
								if(result==null)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.CalculatorFrame,"Cannot divide by zero");
										LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
										LibrarySystem.expression=null;
										return;	
								}
								
								if(result.charAt(0)=='-')
								{
										result=result.replace('-','~');
										
								}
								
								LibrarySystem.expression=result;
								
						}
						catch(Exception ex)
						{
								ex.printStackTrace();
						}
						LibrarySystem.last="=";
		}
		
					
	}
	
	public void keyPressed(KeyEvent ke)
	{
			String expression="";
			if(ke.getKeyCode()== KeyEvent.VK_BACK_SPACE)
			{
					
				
						if(LibrarySystem.last=="=")
						return;
						String s=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
					
						if((LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText() == null) || (LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText().length() == 0))
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
						
						if((LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText().length() == 1))
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
								LibrarySystem.expression="";
								return;
						}
						if(LibrarySystem.last==".")
						LibrarySystem.seen=false;
						
						String sub=s.substring(0,s.length()-1);
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(sub);
						LibrarySystem.last=check(sub.charAt(sub.length()-1));
						LibrarySystem.expression=LibrarySystem.expression.substring(0,sub.length());						
		}
			if(ke.getKeyCode()==KeyEvent.VK_ENTER)
			{
					if(LibrarySystem.expression==null|| LibrarySystem.expression.length()==0 || LibrarySystem.last=="=")
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
								
						}
						boolean isValid=Convert.checkExpression(LibrarySystem.expression);
						if(!isValid)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								JOptionPane.showMessageDialog(LibrarySystem.FrameList.CalculatorFrame,"You have entered a wrong data");
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
								return;
						}
						
						try
						{
								String result = Convert.evaluateExpression(LibrarySystem.expression);
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(result);
								if(result==null)
								{
										JOptionPane.showMessageDialog(LibrarySystem.FrameList.CalculatorFrame,"Cannot divide by zero");
										LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
										LibrarySystem.expression=null;
										return;	
								}
								if(result.charAt(0)=='-')
								{
										result=result.replace('-','~');
										
								}
								
								LibrarySystem.expression=result;
								
						}
						catch(Exception ex)
						{
								ex.printStackTrace();
						}
						LibrarySystem.last="=";
					
			}
			
			
	}
	
	public void keyReleased(KeyEvent ke)
	{
			
	}
		public String check(char ch)
		{
				for(int i=48;i<57;i++)
				{
						if(ch==i)
						return "digit";
				}
				if(ch=='+'||ch=='-' || ch=='*' ||ch=='/'||ch=='%')
				return "op";
				if(ch=='.')
				return ".";
				if(ch==')')
				return ")";
				if(ch=='(')
				return "(";
				
				return null;
				
				
		}
}
