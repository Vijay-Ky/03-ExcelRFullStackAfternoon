import java.sql.SQLException;
import java.sql.DriverManager;
class U
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			DriverManager.getConnection("");		
		}
		catch (SQLException ex)
		{
			System.out.println("from catch");	
		}
		System.out.println("main end");	
	}
}
