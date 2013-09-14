package libsys.general.utilities;

import java.io.File;
import java.io.RandomAccessFile;
import libsys.general.LIBSYSSystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.StreamTokenizer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.StringTokenizer;

public class LoginManager
{
		LIBSYSSystem LibrarySystem;
		
		public LoginManager(LIBSYSSystem LibrarySystem)
		{
				this.LibrarySystem = LibrarySystem;
		}
		
		public void addNewAccount(String Username,  String Password,  String SecurityQuestion,  String Answer,  String AccountFileName,  String QuestionsFile,  String AnswersFile, String RememberFile, String GuestFile, boolean isRemembered) throws Exception
		{
				File f=new File(AccountFileName);
				
				boolean val=f.exists();
				
				FileOutputStream fout=new FileOutputStream(AccountFileName, true);
				FileOutputStream fques=new FileOutputStream(QuestionsFile, true);
				FileOutputStream fans=new FileOutputStream(AnswersFile, true);
				FileOutputStream frem =new FileOutputStream(RememberFile, true);
				
				byte write_user[]=new byte[Username.length()];
				byte write_pass[]=new byte[Password.length()];
				byte write_question[]=new byte[SecurityQuestion.length()];
				byte write_answer[]=new byte[Answer.length()];
				
				for(int i=0;i<Username.length();i++) 
				{
						write_user[i]=(byte)((Username.getBytes()[i]*255)-128);
				}
				
				if(val) 
				{
						FileOutputStream fgues=new FileOutputStream(GuestFile, true);
						fgues.write(write_user);
						fgues.write('b');
						fgues.close();
				}
				
				fout.write(write_user);
				fques.write(write_user);
				fans.write(write_user);
				
				if(isRemembered) 
				{
						frem.write(write_user);
						frem.write('b');
						frem.close();
				}
				
				fout.write('b');
				fques.write('b');
				fans.write('b');
				
				for(int i=0;i<Password.length();i++) 
				{
						write_pass[i]=(byte)((Password.getBytes()[i]*255)-128);
				}
				
				fout.write(write_pass);
				fout.write('k');
				fout.close();
				
				for(int i=0;i<SecurityQuestion.length();i++) 
				{
						write_question[i]=(byte)((SecurityQuestion.getBytes()[i]*255)-128);
				}
				
				fques.write(write_question);
				fques.write('k');
				fques.close();
				
				for(int i=0;i<Answer.length();i++) 
				{
						write_answer[i]=(byte)((Answer.getBytes()[i]*255)-128);
				}
				
				fans.write(write_answer);
				fans.write('k');
				fans.close();
		}
		
		public boolean checkLogin(String Username,  String Password,  String FileName) throws Exception
		{
				FileInputStream fin=new FileInputStream(FileName);
				
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY, 0, fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];				
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[Username.length()];
				byte [] pass=new byte[Password.length()];
				
				buffer.rewind();
				int i=0, index=0, index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b', index);
						if(index1-index>Username.length()) 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
								continue;
								
						}
						
						buffer.get(user, 0, index1-index);
						
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}						
						
						if((new String(user)).equals(Username)) 
						{								
								index=content.indexOf('k', index1);
								buffer.position(index1+1);
								
								if(index-index1-1>Password.length()) 
								{
										fchan.close();
				
										fin.close();
										buffer=null;
										System.gc();
										return false;
								}
								
								buffer.get(pass, 0, index-index1-1);
								
								for( i=0;i<pass.length;i++) 
								{
										pass[i]=(byte)(128-pass[i]);										
								}
								
								if(new String(pass).equals(Password)) 
								{
										fchan.close();
				
										fin.close();
										buffer=null;
										System.gc();
										return true;
								}
									
								fchan.close();
				
								fin.close();
								buffer=null;
								System.gc();
								return false;
						} 
						else 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
						}						
				}
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				
				return false;
		}
		
		public boolean verifyAnswer(String Username, String answer,  String AnswersFile) throws Exception
		{
				FileInputStream fin=new FileInputStream(AnswersFile);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY, 0, fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[Username.length()];
				byte [] ans=new byte[answer.length()];
				
				buffer.rewind();
				
				int i=0, index=0, index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b', index);
						
						if(index1-index>Username.length()) 
						{								
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
								continue;								
						}
						
						buffer.get(user, 0, index1-index);
												
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}						
						
						if((new String(user)).equals(Username)) 
						{								
								index=content.indexOf('k', index1);
								buffer.position(index1+1);
								
								if(index-index1-1>answer.length()) 
								{
										fchan.close();
				
										fin.close();
				
										buffer=null;
										System.gc();
										return false;
								}
								
								buffer.get(ans, 0, index-index1-1);
								
								for( i=0;i<ans.length;i++) 
								{
										ans[i]=(byte)(128-ans[i]);										
								}
								
								if(new String(ans).equals(answer)) 
								{
										fchan.close();
				
										fin.close();
				
										buffer=null;
										System.gc();
										return true;
								}
								
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								
								return false;
						} 
						else 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
						}						
				}
				
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				
				return false;
				
		}
				
		public String getPassword(String username,  String AccountFile) throws Exception 
		{
				FileInputStream fin=new FileInputStream(AccountFile);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY, 0, fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				byte[] user =new byte[username.length()];
				
				buffer.rewind();
				int i=0, index=0, index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b', index);
						
						if(index1-index>username.length()) 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
								continue;								
						}
						
						buffer.get(user, 0, index1-index);
						
						System.out.println(index1);
						
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}						
						
						if((new String(user)).equals(username)) 
						{								
								index=content.indexOf('k', index1);
								
								byte[] pass=new byte[index-index1-1];
								
								buffer.position(index1+1);
								buffer.get(pass, 0, index-index1-1);
								
								for( i=0;i<pass.length;i++) 
								{
										pass[i]=(byte)(128-pass[i]);
										
								}
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								
								return new String(pass);
						} 
						else 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
						}
						
				}
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				return null;
		}
		
		public String getQuestion(String username,  String QuestionsFile) throws Exception
		{
				FileInputStream fin=new FileInputStream(QuestionsFile);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY, 0, fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[username.length()];
				buffer.rewind();
				
				int i=0, index=0, index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b', index);
						
						if(index1-index>username.length()) 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
								continue;
								
						}
						
						buffer.get(user, 0, index1-index);
						
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}						
						
						if((new String(user)).equals(username)) 
						{								
								index=content.indexOf('k', index1);
								
								byte[] question=new byte[index-index1-1];
								
								buffer.position(index1+1);
								
								buffer.get(question, 0, index-index1-1);
								
								for( i=0;i<question.length;i++) 
								{
										question[i]=(byte)(128-question[i]);										
								}
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								
								return new String(question);
						} 
						else 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
						}						
				}
				
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				
				return null;
				
		}
				
		public boolean isUsernameExists(String username,  String AccountFile) throws Exception 
		{
				FileInputStream fin=new FileInputStream(AccountFile);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY, 0, fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[username.length()];
				
				buffer.rewind();
				int i=0, index=0, index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b', index);
						
						if(index1-index>username.length()) 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
								continue;
								
						}
						buffer.get(user, 0, index1-index);
						
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}
						
						
						if((new String(user)).equals(username)) 
						{
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								return true;
								
						} 
						else 
						{
								index=content.indexOf('k', index1);
								index++;
								buffer.position(index);
						}
						
				}
				
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				
				return false;
		}
		
		public boolean isUsernameRemembered(String username, String filename) throws Exception 
		{
				FileInputStream fin=new FileInputStream(filename);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY,0,fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[username.length()];
				
				buffer.rewind();
				
				int i=0,index=0,index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b',index);
						
						if(index1-index>username.length()) 
						{
								index1++;
								index=index1;
								buffer.position(index1);
								continue;								
						}
						
						buffer.get(user,0,index1-index);
						
						for( i=0;i<user.length;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}					
						
						if((new String(user)).equals(username)) 
						{		
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								return true;							
						} 
						else 
						{								
								index1++;
								index=index1;
								
								buffer.position(index1);
						}						
				}
				
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				
				return false;				
		}
		
		public boolean isUserGuest(String username, String filename) throws Exception
		{
				FileInputStream fin=new FileInputStream(filename);
				FileChannel fchan=fin.getChannel();
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY,0,fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				byte[] user =new byte[username.length()];
				
				buffer.rewind();
				
				int i=0,index=0,index1=0;
				
				while(buffer.position()!=buffer.capacity()) 
				{						
						index1=content.indexOf('b',index);
						
						if(index1-index>username.length())
						{
								index1++;
								index=index1;
								
								buffer.position(index1);
								continue;
								
						}
						buffer.get(user,0,index1-index);
						
						for( i=0;i<user.length;i++)
						{
								user[i]=(byte)(128-user[i]);								
						}						
						
						if((new String(user)).equals(username)) 
						{
								fchan.close();
				
								fin.close();
				
								buffer=null;
								System.gc();
								return true;								
						} 
						else
						{
								index1++;
								index=index1;
								
								buffer.position(index1);
						}						
				}
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
				return false;				
		}
		
		public void deleteUserAccount(String Username, String UserAccountsFile, String QuestionsFile, String AnswersFile, String RememberFile, String GuestFile) throws Exception 
		{
				String  filecontent;
				
				filecontent = removeFile(UserAccountsFile);
				copyFile(UserAccountsFile, filecontent, Username,"aud");
				
				filecontent = removeFile(QuestionsFile);
				copyFile(QuestionsFile, filecontent, Username,"aud");
				
				filecontent = removeFile(AnswersFile);
				copyFile(AnswersFile, filecontent, Username,"aud");
				
				if(isUsernameRemembered( Username,RememberFile) == true)
				{
						filecontent = removeFile(RememberFile);
						copyOtherFile(RememberFile, filecontent, Username,"bud");						
				}	
				
				if(isUserGuest(Username, GuestFile))
				{
						filecontent = removeFile(GuestFile);
						copyOtherFile(GuestFile, filecontent, Username,"bud");	
				}
		}
		
		public void editUserAccount(String CurrentUsername, String UserAccountsFile, String QuestionsFile, String AnswersFile, String RememberFile, String GuestFile, String NewUsername, String NewPassword, String NewQuestion, String NewAnswer) throws Exception 
		{
				String content1,content2,content3,content4;
				
				boolean guest = isUserGuest(CurrentUsername, GuestFile);
				boolean remember = false;
				
				if(!guest)
				{
						content1=removeFile(UserAccountsFile);
						content2=removeFile(QuestionsFile);
						content3=removeFile(AnswersFile);
						
						if(isUsernameRemembered(CurrentUsername,RememberFile) == true) 
						{
								remember = true;
								content4 = removeFile(RememberFile);
								copyOtherFile(RememberFile, content4, CurrentUsername, "bud");
						}
						
						addNewAccount(NewUsername, NewPassword, NewQuestion, NewAnswer, UserAccountsFile, QuestionsFile, AnswersFile, RememberFile, GuestFile, remember);
						
						copyFile(UserAccountsFile, content1, CurrentUsername, UserAccountsFile);
						copyFile(QuestionsFile, content2, CurrentUsername,QuestionsFile);
						copyFile(AnswersFile, content3, CurrentUsername,AnswersFile);								
				} 
				else
				{
						if(isUsernameRemembered(CurrentUsername,RememberFile) == true) 
						{
								remember = true;
								content4 = removeFile(RememberFile);
								copyOtherFile(RememberFile, content4, CurrentUsername, "bud");
						}
						
						addNewAccount(NewUsername, NewPassword, NewQuestion, NewAnswer, UserAccountsFile, QuestionsFile, AnswersFile, RememberFile, GuestFile, remember);
						
						content1=removeFile(UserAccountsFile);
						content2=removeFile(QuestionsFile);
						content3=removeFile(AnswersFile);
						
						copyFile(UserAccountsFile, content1, CurrentUsername, "aud");
						copyFile(QuestionsFile,content2, CurrentUsername, "aud");
						copyFile(AnswersFile, content3, CurrentUsername, "aud");
						
						content4 = removeFile("gues.sec");
						
						copyOtherFile(GuestFile, content4, CurrentUsername, "bud");								
				}				
		}
		
		public String[] getGuestList(String GuestFile) throws Exception 
		{
				String b[]=new String[300];
				
				FileInputStream fin=new FileInputStream(GuestFile);
				FileChannel fchan=fin.getChannel();
				
				int index1=0,index=0,i,j=0;
				byte[] user =new byte[1024];
				if(fchan.size()==0)
				{
						fchan.close();
						fin.close();
						return null;
				}
				
				MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_ONLY,0,fchan.size());
				
				byte stringBuffer[]=new byte[(int)fchan.size()];
				
				buffer.get(stringBuffer);
				
				String content=new String(stringBuffer);
				
				buffer.rewind();
				
				while(buffer.position()!=buffer.capacity()) 
				{
						index1=content.indexOf('b',index);
						buffer.get(user,0,index1-index);
						
						for( i=0;i<index1-index;i++) 
						{
								user[i]=(byte)(128-user[i]);								
						}
						
						b[j]=new String(user,0,index1-index );
						index1++;
						index=index1;
						buffer.position(index1);
						
						j++;					
				}
				
				fchan.close();
				
				fin.close();
				
				buffer=null;
				System.gc();
								
				return b;
		}
		
		public void clearPassword(String Username,String RememberFile) 
		{
				String filecontent;
				filecontent=removeFile(RememberFile);
				copyOtherFile(RememberFile, filecontent, Username, "aud");			
		}
		
		public void rememberPassword(String Username, String RememberFile) throws Exception
		{
				FileOutputStream fout=new FileOutputStream(RememberFile,true);
				
				byte write_user[]=new byte[Username.length()];
				
				for(int i=0;i<Username.length();i++)
				{
						write_user[i]=(byte)((Username.getBytes()[i]*255)-128);
				}
					
				fout.write(write_user);
				fout.write('b');
				fout.close();			
		}
		
		public void mysqlAccount(String user,String password, String MYSQLFile) throws Exception
		{
				FileOutputStream fout=new FileOutputStream(MYSQLFile);
				
				byte[] write_user=new byte[user.length()];
				byte[]write_pass=new byte[password.length()];
				
				for(int i=0;i<user.length();i++) 
				{
						write_user[i]=(byte)((user.getBytes()[i]*255)-128);
				}
				
				fout.write(write_user);
				fout.write('b');
				
				for(int i=0;i<password.length();i++) 
				{
						write_pass[i]=(byte)((password.getBytes()[i]*255)-128);
				}
				
				fout.write(write_pass);
				fout.write('k');
				fout.close();
		}
		
		public String[]	mysqlUser(String MYSQLFile) throws Exception
		{
				FileInputStream fin=new FileInputStream(MYSQLFile);
				
				byte[] store_user=new byte[1024];
				byte[]store_pass=new byte[1024];
				
				String[] mysql=new String[2];
				
				int c,i=0;
				
				while((c=fin.read())!='b') 
				{
						store_user[i]=(byte)(128-c);
						i++;
				}
				
				byte user[]=new byte[i];
				for(int j=0; j<user.length;j++)
				{
						user[j]=store_user[j];
				}
				
				mysql[0]=new String(user);
				i=0;
				
				while((c=fin.read())!='k') 
				{
						store_pass[i]=(byte)(128-c);
						i++;
				}
				
				byte pass[]=new byte[i];
				for(int j=0; j<pass.length;j++)
				{
						pass[j]=store_pass[j];
				}
				
				mysql[1]=new String(pass);
				
				fin.close();
				
				return mysql;
		}
		
		private String removeFile(String filename)
		{
				try
				{
						File f=new File(filename);
						RandomAccessFile fin= new RandomAccessFile(filename,"rw");
						
						FileChannel fchan=fin.getChannel();
						MappedByteBuffer buffer=fchan.map(FileChannel.MapMode.READ_WRITE,0,fchan.size());
						
						byte stringBuffer[]=new byte[(int)fchan.size()];
						buffer.get(stringBuffer);
						
						String content=new String(stringBuffer);
						
						buffer.clear();
						fchan.close();
						fin.close();
						buffer=null;
						
						System.gc();
						
						f.delete();
						
						return content;
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return null;
		}
		
		private void copyFile(String filename, String content, String username, String otherfile) 
		{
				File fb=new File(otherfile);
				
				byte[] string=new byte[username.length()];
				byte stringBuffer[]=content.getBytes();
				
				for(int i=0;i<username.length();i++)
				{
						string[i]=(byte)((username.getBytes()[i]*255)-128);
				}
				
				username=new String(string);
				int index=content.indexOf(username);
				
				if(index==-1) 
				{
						return;
				}
				
				try 
				{
						FileOutputStream fout=new FileOutputStream(fb,true);
						
						int indexb=content.indexOf('k',index);
						
						fout.write(stringBuffer,0,index-0);
						
						if(indexb!=stringBuffer.length-1)
						{
								fout.write(stringBuffer,indexb+1,stringBuffer.length-1-indexb);
						}
						
						fout.close();
				} 
				catch(Exception ex)
				{
						
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				
				fb.renameTo(new File(filename));						
		}
		
		private void copyOtherFile(String filename, String content, String username, String otherfile) 
		{
				File fb=new File(otherfile);
				
				byte[] string=new byte[username.length()];
				byte stringBuffer[]=content.getBytes();
				
				for(int i=0;i<username.length();i++)
				{
						string[i]=(byte)((username.getBytes()[i]*255)-128);
				}
				
				username=new String(string);
				int index=content.indexOf(username);
				
				if(index==-1) 
				{
						return;
				}
				
				try 
				{
						FileOutputStream fout=new FileOutputStream(fb,true);
						
						int indexb=content.indexOf('b',index);
						fout.write(stringBuffer,0,index-0);
						
						if(indexb!=stringBuffer.length-1)
						{
								fout.write(stringBuffer,indexb+1,stringBuffer.length-1-indexb);
						}
						
						fout.close();
				} 
				catch(Exception ex) 
				{
						
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				fb.renameTo(new File(filename));						
		}
}
