import java.io.File;

public class F13
{
	public static void main(String[] args)
	{
		//File can create both file and directory.
		//create a directory in the current working folder.
		File file = new File("directory");
		//to create the directory
		//doesnt requres try/catch or throws
		file.mkdir();
		System.out.println("done");
	}
}
