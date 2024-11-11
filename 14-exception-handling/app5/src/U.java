import java.sql.DriverManager;
import java.sql.SQLException;
class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			DriverManager.getConnection("");
			Thread.sleep(1000);
			Class.forName("");
		}
		catch (SQLException ex)
		{
		}
		catch (InterruptedException ex)
		{
		}
		catch (ClassNotFoundException ex)
		{
		}
		System.out.println("main end");
	}
}
