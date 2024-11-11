import java.sql.*;
class M2 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM PERSON";
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())	
		{
			//we can supply column indexes rather than column name
			//column indexes are starting from 1
			//first record column id index
			System.out.print(rs.getInt(1) + ", ");
			//first record coulumn name index
			System.out.print(rs.getString(2) + ", ");
			//first record column age index
			System.out.print(rs.getInt(3) + ", ");
			System.out.println();
		}
		System.out.println("done");
	}
}
//for both DDL and DML we can use execute method
//A ResultSet object maintains a cursor pointing to its current row of data. Initially the cursor is positioned before the first row.
//java.sql.ResultSet//its an Interface
