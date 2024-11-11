import java.io.File;

class F4
{
	public static void main(String[] args) throws Exception
	{
		//if file is already exists then it wont create another file in the same directory.
		File file = new File("abc.txt");
		System.out.println(file.exists());
		boolean flag = file.createNewFile();
		System.out.println(flag);
		System.out.println(file.exists());
		System.out.println("done");
	}
} 