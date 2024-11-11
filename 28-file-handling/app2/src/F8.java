import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F8
{
	public static void main(String[] args)
	{
		File f1 = new File("test1.txt");
		FileReader fin = null;
		System.out.println("no of characters in this file: "  + (int)f1.length());

		char[] chars = new char[(int)f1.length()];
		try
		{
			fin = new FileReader(f1);
			fin.read(chars);
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if(fin != null)
			{
				try
				{
					fin.close();
				}
				catch(IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
