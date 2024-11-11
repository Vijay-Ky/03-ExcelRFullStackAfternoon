import java.sql.DriverManager;
import java.sql.SQLException;
class O
{
	public static void main(String[] args) throws SQLException, InterruptedException, ClassNotFoundException 
	{
		System.out.println("main begin");
		DriverManager.getConnection("");
		Thread.sleep(1000);
		Class.forName("");
		System.out.println("main end");
	}
}
