import java.sql.DriverManager;
class V
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
		catch (Exception ex)
		{
		}
		System.out.println("main end");
	}
}
