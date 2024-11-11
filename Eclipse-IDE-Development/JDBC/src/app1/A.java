package app1;
import java.sql.*;
class A 
{
	public static void main(String[] args) throws Exception
	{
		String sql1 = "DROP TABLE IF EXISTS JDBC11";
		String sql2 = "CREATE TABLE JDBC11(ID INTEGER, NAME VARCHAR(40))";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/excelr", "president", "admin");  
		Statement stmt = con.createStatement();
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}

