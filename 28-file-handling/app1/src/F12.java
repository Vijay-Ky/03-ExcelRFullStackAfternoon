import java.io.File;
import java.io.IOException;	

class F12
{
	public static void main(String[] args)
	{
		File directory = new File("D://FileHandling");
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
		System.out.println("done");
	}
}
