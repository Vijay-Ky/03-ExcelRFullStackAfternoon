import java.sql.*;
class I 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin");
		Statement stmt = con.createStatement();
		String sql = "UPDATE PERSON SET NAME = 'MANOHAR' WHERE ID = 5";
		stmt.execute(sql);
		System.out.println("done");
	}
}
