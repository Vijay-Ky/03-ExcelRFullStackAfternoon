import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class F7
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("F1.java");
		char[] chars = new char[10000];
		FileReader fileReader = new FileReader(file);
		fileReader.read(chars);
		fileReader.close();
		String s1 = new String(chars);
		System.out.println(s1);
	}
}
