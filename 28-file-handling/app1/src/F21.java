import java.io.File;

public class F21
{
	public static void main(String[] args)
	{
		File file = new File("D:\\FileHandling");
		//reading all the mebers of the directory
		File[] members = file.listFiles();
		for(File member : members)
		{
			//you will get file names with extensions
			System.out.println(member.getName());
		}
	}
}
