import java.sql.DriverManager;
import java.sql.SQLException;
class L
{
	public static void main(String[] args) throws SQLException 
	{
		System.out.println("main begin");
		DriverManager.getConnection("");
		Thread.sleep(1000);
		Class.forName("");
		System.out.println("main end");
	}
}
