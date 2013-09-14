package libsys.general;

import java.util.Stack;
import java.util.Scanner;

import java.io.IOException;
import javax.swing.JOptionPane;

public abstract class Convert {
		private static stack theStack;
		private static String input;
		private static String output = "";
		
		public static void initStack(String expression) {
				input = expression;
			
				System.out.println("in inpu"+input);
				int stackSize = input.length();
				theStack = new stack(stackSize);
		}
		
		
		public static String evaluateExpression(String expression) throws Exception {
				String postfix_expr;
				String value;
				System.out.println(expression);
				initStack(expression);
				postfix_expr=infixToPostfix(expression);
				value=calculateExpression(postfix_expr);
				return value;
		}
		public static String infixToPostfix(String expression) {
				
				theStack.emptyStack();
				output="";
				for (int j = 0; j < input.length(); j++) {
						char ch = input.charAt(j);
						switch (ch) {
								case '~':
										 gotOper(ch,4);
										 break;
								case '+':
								case '-':
										if(j!=0 && isDigit(input.charAt(j-1)))
												output=output+"?";
										
										gotOper(ch, 1);
										break; //   (precedence 1)
								case '*': // it's * or /
								case '/':
										if(j!=0 && isDigit(input.charAt(j-1)))
												output=output+"?";
										gotOper(ch, 2); // go pop operators
										break; //   (precedence 2)
								case '%':
										if(j!=0 && isDigit(input.charAt(j-1)))
												output=output+"?";
										gotOper(ch, 3); // go pop operators
										break; //   (precedence 2)
										
										
								case '(': // it's a left paren
										theStack.push(ch); // push it
										break;
								case ')': // it's a right paren
										output=output+"?";
										gotParen(ch); // go pop operators
										break;
										
								default: // must be an operand
										output = output + ch; // write it to output
										break;
						}
				}
				
				if(isDigit(input.charAt(input.length()-1)))
						output=output+"?";
				while (!theStack.isEmpty()) {
						output = output + theStack.pop();
						
				}
				System.out.println(output);
				return output; // return postfix
				
		}
		public static void gotOper(char opThis, int prec1) {
				while (!theStack.isEmpty()) {
						char opTop = theStack.pop();
						if (opTop == '(') {
								theStack.push(opTop);
								break;
						}// it's an operator
						else {// precedence of new op
								int prec2;
								if (opTop == '+' || opTop == '-')
										prec2 = 1;
								else
										prec2 = 2;
								if (prec2 < prec1) // if prec of new op less
								{ //    than prec of old
										theStack.push(opTop); // save newly-popped op
										break;
								} else
										// prec of new not less
										output = output + opTop; // than prec of old
						}
				}
				theStack.push(opThis);
		}
		public static void gotParen(char ch) {
				while (!theStack.isEmpty()) {
						char chx = theStack.pop();
						if (chx == '(') {
								//output=output+'?';
								break;
						} else
								output = output + chx;
				}
				
		}
		public static boolean isDigit(char c) {
				String s = String.valueOf(c);
				
				try {
						Long.parseLong(s);
				} catch(Exception ex) {
						return false;
				}
				
				return true;
		}
		public static String calculateExpression(String expression) throws Exception 
		{
				Stack  post_expr=new Stack();
				long a,b,result=0;
				double	dop1,dop2,resultd;
				String input="";
				post_expr.clear();
				System.out.println("expr"+expression);
				boolean check=isLong(expression);
				System.out.println(check);
				for(int i=0;i<expression.length();i++) 
				{
						char ch=expression.charAt(i);
						//System.out.println("scanning character"+ch);
						
						switch(ch)
						{
								case '+':
										
										if(!check)
										{
												a=Long.parseLong(post_expr.pop().toString());
												b=Long.parseLong(post_expr.pop().toString());
												result=a+b;
												System.out.println("Pushed item at +"+result);
												post_expr.push(new Long(result));
												
										} 
										else
										{
												dop1=Double.parseDouble(post_expr.pop().toString());
												dop2=Double.parseDouble(post_expr.pop().toString());
												resultd=dop1+dop2;
												post_expr.push(new Double(resultd));
												
										}
										
										break;
								case '-' :
										if(!check)
										{
												a=Long.parseLong(post_expr.pop().toString());
												b=Long.parseLong(post_expr.pop().toString());
												result=b-a;
												System.out.println("Pushed item at -"+result);
												post_expr.push(new Long(result));
										}
										else
										{
												dop1=Double.parseDouble(post_expr.pop().toString());
												dop2=Double.parseDouble(post_expr.pop().toString());
												resultd=dop2-dop1;
												post_expr.push(new Double(resultd));
										}
										
										
										break;
								case '*' :
										
										if(!check)
										{
												a=Long.parseLong(post_expr.pop().toString());
												b=Long.parseLong(post_expr.pop().toString());
												result=a*b;
												System.out.println("Pushed item at *"+result);
												post_expr.push(new Long(result));
										}
										
										else 
										{
												dop1=Double.parseDouble(post_expr.pop().toString());
												dop2=Double.parseDouble(post_expr.pop().toString());
												resultd=dop1*dop2;
												post_expr.push(new Double(resultd));
												
										}
										
										
										
										break;
								case '/':
										
										if(!check) {
												a=Long.parseLong(post_expr.pop().toString());
												b=Long.parseLong(post_expr.pop().toString());
												if(a==0)
												{
														return null;
												}
												result=b/a;
												resultd=(double)b/a;
												if(Math.abs(resultd)-Math.abs(result)>0)
												{
														post_expr.push(new Double(resultd));
														check=true;
												}
												//System.out.println("Pushed item at /"+result);
												else
												post_expr.push(new Long(result));
												
										} 
										else
										{
												dop1=Double.parseDouble(post_expr.pop().toString());
												dop2=Double.parseDouble(post_expr.pop().toString());
												if(dop2==0)
												{
														return null;
												}
												resultd=dop2/dop1;
												post_expr.push(new Double(resultd));
												
										}
										
										
										break;
								case '%':
										if(!check) 
										{
												a=Long.parseLong(post_expr.pop().toString());
												b=Long.parseLong(post_expr.pop().toString());
												resultd=(double)a*b/100;
												System.out.println("Pushed item at %"+resultd);
												post_expr.push(new Double(resultd));
												check=true;
										}
										else 
										{
												dop1=Double.parseDouble(post_expr.pop().toString());
												dop2=Double.parseDouble(post_expr.pop().toString());
												resultd=dop1*dop2/100;
												post_expr.push(new Double(resultd));
												
										}
										
										break;
										
								case '?':
										
										
										post_expr.push(input);
										
										input="";
										
										break;
							      case  '~':
									      if(!check)
									      {
												a=Long.parseLong(post_expr.pop().toString());
												result=-a;
												post_expr.push(new Long(result));
									      }
									      else
									      {
											    
										resultd=Double.parseDouble(post_expr.pop().toString());
										resultd=-resultd;
										post_expr.push(new Double(resultd));
										break;
								
									      }
										break;
								
										
										
								default:
										//System.out.println("in default");
										
										input=input+String.valueOf(ch);
										
										//System.out.println("Char"+ch+"input"+input);
						}
				}
				
				 
				
					
				
				
				
				return(post_expr.pop().toString());
				
		}
		public static boolean isLong(String s)
		{
				int x=0;
				x=s.indexOf('.');
				if(x==-1)
				return false;
				else
				return true;
		}
		
		public  static  boolean checkExpression(String expression)
		{
				int count1=0,count2=0;
				if(expression.charAt(expression.length()-1)=='+'||expression.charAt(expression.length()-1)=='-'||expression.charAt(expression.length()-1)=='/'||expression.charAt(expression.length()-1)=='*'||expression.charAt(expression.length()-1)=='%')
				return false;
				for (int i=0;i<expression.length();i++)
				{
						if(expression.charAt(i)=='(')
						{
								count1++;
						}
						if(expression.charAt(i)==')')
						{
								count2++;
						}
					
				}
				if(count1!=count2)
				return false;
				return true;
		}

		
		
		
		
}

class stack {
		
		private int maxSize;
		private char[] stackArray;
		private int top;
		
		public stack(int max) {
				maxSize = max;
				stackArray = new char[maxSize];
				top = -1;
		}
		
		public void push(char j) {
				stackArray[++top] = j;
		}
		
		public char pop() {
				return stackArray[top--];
		}
		
		public char peek() {
				return stackArray[top];
		}
		
		public boolean isEmpty() {
				return (top == -1);
		}
		public void emptyStack()
		{
			for(int i=0;i<stackArray.length;i++)
			{
				stackArray[i]='\0';
			}
		}
}