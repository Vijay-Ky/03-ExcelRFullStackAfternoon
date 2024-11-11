import java.sql.*;
import java.util.Scanner;
class G 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/excelr", "president", "admin");
		Statement stmt = con.createStatement();
		Scanner sc = new Scanner(System.in);//creating the scanner object
		String id, name, age, sql;
		int numberOfRecords = 0;
		do
		{
			numberOfRecords += 1;
			System.out.println("Please enter id");
			id = sc.next();
			System.out.println("Please enter name");
			name = sc.next();
			System.out.println("Please enter age");
			age = sc.next();
			sql = "INSERT INTO PERSON VALUES(" + id + ", '" + name +"'," + age +")";
			stmt.execute(sql);
			System.out.println("do you want to insert one more(yes/no)?");
		}
		while ("yes".equalsIgnoreCase(sc.next()));
		System.out.println("Number of records inserted: " + numberOfRecords);
		System.out.println("done");
	}
}
