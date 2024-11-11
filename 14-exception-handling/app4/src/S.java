import java.io.FileReader;
import java.io.FileNotFoundException;
class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			FileReader fileReader = new FileReader("");
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("from catch: " + ex);
		}
		System.out.println("main end");
	}
}
