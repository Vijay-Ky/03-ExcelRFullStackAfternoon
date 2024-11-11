import java.io.File;

public class F19
{
	public static void main(String[] args)
	{
		//if you want to check for these files and folders it should be available otherwise simply you will get false.
		File file = new File("xyz.txt");
		File directory = new File("directory");
		//to check whether file object is file or folder
		System.out.println("file.isFile(): " + file.isFile());
		System.out.println("directory.isFile(): " + directory.isFile());
		System.out.println("file.isDirectory: " + file.isDirectory());
		System.out.println("directory.isDirectory: " + directory.isDirectory());		
	}
}
