package libsys.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import libsys.general.Convert;
import libsys.general.LIBSYSSystem;

public class CalculatorButtonListener implements ActionListener
{
		public LIBSYSSystem LibrarySystem;
		
		
		
		public CalculatorButtonListener(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void actionPerformed(ActionEvent ae)
		{
				String expression =""; 
				String text;
		
				if(ae.getActionCommand()=="0")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"0");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="0";
							return;
						}
						LibrarySystem.expression+="0";
						
				}

				if(ae.getActionCommand().equals("1"))
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
				
				if(ae.getActionCommand()=="2")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"2");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="2";
							return;
						}
						LibrarySystem.expression+="2";
				}
				
				if(ae.getActionCommand()=="3")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"3");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="3";
							return;
						}
						LibrarySystem.expression+="3";
				}
				
				if(ae.getActionCommand()=="4")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"4");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="4";
							return;
						}
						LibrarySystem.expression+="4";
				}
				
				if(ae.getActionCommand()=="5")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"5");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="5";
							return;
						}
						LibrarySystem.expression+="5";
				}
				
				if(ae.getActionCommand()=="6")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"6");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="6";
							return;
						}
						LibrarySystem.expression+="6";
				}
				
				if(ae.getActionCommand()=="7")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"7");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="7";
							return;
						}
						LibrarySystem.expression+="7";
				}
				
				if(ae.getActionCommand()=="8")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"8");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="8";
							return;
						}
						LibrarySystem.expression+="8";
				}
				
				if(ae.getActionCommand()=="9")
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
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"9");
						LibrarySystem.last="digit";
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="9";
							return;
						}
						LibrarySystem.expression+="9";
				}
				
				if(ae.getActionCommand()=="(")
				{
						if(LibrarySystem.last=="=" || LibrarySystem.last==")"|| LibrarySystem.last=="digit"||LibrarySystem.last==".")
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
						if(LibrarySystem.expression==null)
						{
							LibrarySystem.expression="(";
							LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"(");
							return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"(");
						LibrarySystem.last="(";
						
						LibrarySystem.expression+="(";
				}
				
				if(ae.getActionCommand()==")")
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="="|| LibrarySystem.last=="(" ||LibrarySystem.last=="op"||LibrarySystem.last=="."||text.length()==0)
						{		
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+")");
						LibrarySystem.last=")";
						LibrarySystem.expression+=")";
				}
				
				if(ae.getActionCommand()==".")
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op" || LibrarySystem.last=="." || LibrarySystem.last=="="||LibrarySystem.last==")"||LibrarySystem.last=="(" || text.length()==0||LibrarySystem.seen)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
						
						return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+".");
						LibrarySystem.last=".";
						LibrarySystem.seen=true;
						LibrarySystem.expression+=".";
				}
				
				if(ae.getActionCommand()=="+" )
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="(" || text.length()==0)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
						return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"+");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="+";
				}
				
				if(ae.getActionCommand()=="-" )
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
						return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"-");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="-";
				}
				
				if(ae.getActionCommand()=="/")
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"/");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="/";
				}
				
				if(ae.getActionCommand()=="*")
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="("||text.length()==0)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
						return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"*");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="*";
				}
				
				if(ae.getActionCommand()=="%")
				{
						text=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.last=="op"|| LibrarySystem.last=="."||LibrarySystem.last=="(" ||text.length()==0)
						{
								LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
								return;
						}
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText()+"%");
						LibrarySystem.last="op";
						LibrarySystem.seen=false;
						LibrarySystem.expression+="%";
				}
				
				if(ae.getActionCommand()=="Clear")
				{
						LibrarySystem.FrameItems.calculatorFrameItems.result_txt.setText(null);
						LibrarySystem.last=null;
						LibrarySystem.seen=false;
						LibrarySystem.expression="";
				}
				
				if(ae.getActionCommand()=="Backspace")
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
				if(ae.getActionCommand()=="=")
				{
						//expression=LibrarySystem.FrameItems.calculatorFrameItems.result_txt.getText();
						if(LibrarySystem.expression==null || LibrarySystem.expression.length()==0 || LibrarySystem.last=="=")
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
				
				LibrarySystem.FrameItems.calculatorFrameItems.result_txt.requestFocus();
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