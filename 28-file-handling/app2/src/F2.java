import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F2
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("D:/FileHandling/test2.txt");
		FileWriter out = new FileWriter(f1);
		//write(int ch) - to write a single character to the file
		out.write(97);
		out.flush();
		out.close();
		System.out.println("done");
	}
}


/*
We can use File Writer Object to write characters(text data) to the file

constructors:

1. FileWriter fw = nw FileWriter(String name);
2. FileWriter fw = new FileWriter(File f);

The above 2 constructors meant for overriding existing data
instead of overriding, if we want to perform append operation then we have to use the following two constructors

1. FileWriter fw = nw FileWriter(String name, boolean append);
2. FileWriter fw = new FileWriter(File f, boolean append);

Note: if the specified File is not already available then all the above constructors will create that file.

Methods of FileWriter class:

1. write(int ch) - to write a single character to the file

2. write(char[] ch) - to write an array of characters to the file

3. write(String s) - to write a String to the file.

4. flush() - to give the guarantee that total datat including last character written properly to the file

5 close()


*/
