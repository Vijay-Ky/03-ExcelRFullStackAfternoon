import java.io.File;

public class F18
{
	public static void main(String[] args)
	{
		File directory = new File("D:/Folders");
		//path refered through reference variable
		File file = new File(directory, "directory4");
		System.out.println("a: " + file.exists());
		//if the path didnt exists simply you get false not exception
		System.out.println("b: " + file.mkdir());
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}
