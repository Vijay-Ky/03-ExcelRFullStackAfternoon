import java.sql.DriverManager;
class W
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
		catch (Throwable ex)
		{
		}
		System.out.println("main end");
	}
}
