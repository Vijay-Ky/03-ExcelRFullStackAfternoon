import java.io.File;
import java.io.IOException;	

class F8
{
	public static void main(String[] args)
	{
		//if you want to create a file in specific location 
		//you should provide absolute path
		//public File(String pathname)
		File file = new File("D:\\FileHandling\\test1.txt");
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
