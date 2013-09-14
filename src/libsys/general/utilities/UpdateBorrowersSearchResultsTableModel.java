package libsys.general.utilities;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;
import libsys.general.LIBSYSSystem;
public class UpdateBorrowersSearchResultsTableModel extends AbstractTableModel
{
		ResultSet rs;
		ResultSetMetaData rsmd;
		LIBSYSSystem LibrarySystem;
		public UpdateBorrowersSearchResultsTableModel(LIBSYSSystem LibrarySystem, ResultSet rs)
		{
				this.rs = rs;
				this.LibrarySystem = LibrarySystem;
				try
				{
						rsmd = rs.getMetaData();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
		}
		
		public String getColumnName(int c)
               {
				String ColumnName = "Column " + c;
				
				switch(c)
				{
						case 0 : ColumnName =  "Account Number";
								break;
						case 1 : ColumnName =  "Borrower Name";
								break;
						case 2 : ColumnName =  "E-Mail";
								break;
						case 3 : ColumnName =  "Phone Number";
								break;
						case 4 : ColumnName =  "Address";
								break;
						case 5 : ColumnName =  "Sex";
								break;
				}				
				
				return ColumnName;
               }
		
		public Object getValueAt(int r, int c)
		{
				try
				{
						rs.absolute(r + 1);
						return rs.getObject(c+ 1);
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return -1;
		}
		
		public int getRowCount()
		{
				try
				{
						rs.last();
				
						return rs.getRow();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}	
				
				return -1;
		}
		
		public int getColumnCount()
		{
				try
				{
						return rsmd.getColumnCount();
				}
				catch(Exception ex)
				{
						LibrarySystem.errorLogWriter.addErrorLog(ex.toString(), LibrarySystem.ErrorLogFile);
				}
				
				return -1;
		}
}
