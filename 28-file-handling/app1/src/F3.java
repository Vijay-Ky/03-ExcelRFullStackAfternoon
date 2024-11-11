import java.io.File;

class F3
{
	//to address both NullPointerExcpetion and IOException we can use Exception
	public static void main(String[] args) throws Exception
	{
		//by default creates file in the project folder
		//its a relative path reperesents the current working folder
		//throws NullPointerException
		File file = new File("abc.txt");
		//checks that file is there or not in the current working folder
		System.out.println(file.exists());
		//A physical file is going to be created
		//file reference will be pointing to this file
		//throws IOException - checked exception
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println("done");
	}
} 