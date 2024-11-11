import java.io.File;
//Exception is a part of java.lang package but IOException we should import
import java.io.IOException;	

class F6
{
	public static void main(String[] args)
	{
		File file = null; 
		try
		{
			file = new File("xyz.txt");
		}
		catch (NullPointerException ex)
		{
			System.out.println("from catch: " + ex);
		}
		System.out.println("a: " + file.exists());
		//instead of throws
		try
		{
			System.out.println("b: " + file.createNewFile());
		}
		catch(IOException ex)
		{
			System.out.println("from catch: " + ex);
		}
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}
