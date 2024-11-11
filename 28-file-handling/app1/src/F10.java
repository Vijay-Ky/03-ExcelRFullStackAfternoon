import java.io.File;
import java.io.IOException;	

class F10
{
	public static void main(String[] args)
	{
		//constructors takes two arguments 
		//one takes path, another creates file
		//the path should be available
		//1st constructor
		//File(File parent, String child)
		//Creates a new File instance from a parent abstract pathname and a child pathname string:
		File file = new File("D:\\FileHandling", "test3.txt");
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

/*
1st constructor
File(File parent, String child)
Creates a new File instance from a parent abstract pathname and a child pathname string:
File parentDirectory = new File("D:\\ParentDirectory");
String childFileName = "test.txt";
File file = new File(parentDirectory, childFileName);

2nd constructor
File(String parent, String child)
Creates a new File instance from a parent pathname string and a child pathname string:
String parentPath = "D:\\ParentDirectory";
String childFileName = "test.txt";
File file = new File(parentPath, childFileName);

*/