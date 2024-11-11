import java.io.File;

public class F16
{
	public static void main(String[] args)
	{
		//absolute path
		//default is project folder
		//path and directory
		File file = new File("D:/FileHandling", "directory2");
		System.out.println("a: " + file.exists());
		System.out.println("b: " + file.mkdir());
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}
