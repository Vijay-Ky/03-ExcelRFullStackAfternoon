import java.io.File;
import java.io.IOException;	

class F11
{
	public static void main(String[] args)
	{
		File directory = new File("D://FileHandling");
		//several constructors
		//location we are supplying through another file object
		File file = new File(directory, "test4.txt");
		System.out.println("a: " + file.exists());
		try
		{
			System.out.println("b: " + file.createNewFile());
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("c: " + file.exists());
		System.out.println("done:");
	}
}
