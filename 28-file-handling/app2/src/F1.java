import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F1 
{
	public static void main(String[] args) throws IOException
	{
		//it wont create physical file
		//File f1 = new File("D:/FileHandlingNew/test1.txt");
		File f1 = new File("D:/FileHandling/test1.txt");
		//now it create physical file 
		//if the file not available file will be created
		//folder must be existing otherwise you will get FileNotFoundException
		FileWriter out = new FileWriter(f1);
		//starts writing doesnt give any space or line break
		out.write("Hello");
		out.write("test");
		out.write("\n");
		out.write("abc");
		out.write("xyz");
		out.write("end");
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

4. flush() - to give the guarantee that total data including last character written properly to the file

5 close()


*/
