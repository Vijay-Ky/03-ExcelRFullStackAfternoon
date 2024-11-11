import java.io.File;

public class F15
{
	public static void main(String[] args)
	{
		//absolute path
		File file = new File("D:/FileHandling/directory1");
		//File file = new File("D:/FileHandlingConcept/directory1");
		System.out.println("a: " + file.exists());
		System.out.println("b: " + file.mkdir());
		System.out.println("c: " + file.exists());
		System.out.println("done");
	}
}
