import java.sql.*;
class C 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin"); 
		Statement stmt = con.createStatement();
		String sql0 = "ALTER TABLE EMAIL_ID DROP FOREIGN KEY MA_FK1";
		String sql1 = "DROP TABLE IF EXISTS PERSON";
		String sql2 = "CREATE TABLE PERSON (ID INTEGER, NAME VARCHAR(90), AGE INTEGER)";
		stmt.execute(sql0);
		stmt.execute(sql1);
		stmt.execute(sql2);
		System.out.println("done");
	}
}
