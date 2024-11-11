import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F4
{
	public static void main(String[] args) throws IOException
	{
		//true - keeps on adding the content
		//FileWriter out = new FileWriter("test1.txt", true);
		//false - it rewrites the complete file
		FileWriter out = new FileWriter("test1.txt", false);
		out.write("Hello4444444");
		out.write("test");
		out.write("abc444444");
		out.write("\n");
		out.write("xyz");
		out.write("end444444444");
		out.flush();
		out.close();
		System.out.println("done");
	}
}
