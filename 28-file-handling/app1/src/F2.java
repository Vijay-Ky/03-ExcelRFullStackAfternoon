import java.io.File;
class F2
{
	public static void main(String[] args) throws Exception
	{
		//empty file abc.txt - No.
		//its not going to create a physical file
		//it creates Java file object to represent name abc.txt
		//does not create a new file. Instead, it creates a new File object named file that represents a file named "abc.txt".
		//public File(String pathname) - NullPointerException - If the pathname argument is null
		File file = new File("abc.txt");
		System.out.println(file.exists());
		System.out.println("done");
	}
}