import java.io.File;

public class F22
{
	public static void main(String[] args)
	{
		File src = new File("D:\\FileHandling");
		File[] members = src.listFiles();		
		for(File member : members)
		{
			//print whether file or directory
			System.out.println(member.getName() + ":" + (member.isFile() ? " a file " : " a directory ")) ;
		}
	}
}
