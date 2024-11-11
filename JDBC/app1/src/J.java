import java.sql.*;
class J 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin");
		Statement stmt = con.createStatement();
		String sql = "DELETE FROM PERSON WHERE ID = 5";
		stmt.execute(sql);
		System.out.println("done");
	}
}
