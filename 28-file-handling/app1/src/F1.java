import java.io.File;
class F1 
{
	public static void main(String[] args) //throws Exception
	{
		//empty file abc.txt - No.
		//its not going to create a physical file
		//it creates Java file object to represent name abc.txt
		//does not create a new file. Instead, it creates a new File object named file that represents a file named "abc.txt".
		//public File(String pathname) - throws NullPointerException - If the pathname argument is null
		File file = new File("abc.txt");
		System.out.println("done");
	}
}
/*
java.io package
1. File - create file, create directory, check how many files, directories
2. FileWriter - write 
3. FileReader - read
4. BufferedWriter - to overcome problems with FileWriter
5. BufferedReader - to overcome problems with FileReader
6. PrintWriter - Advance Level

File file = new File("abc.txt");

- This line wont create any physical file, first it will check is there any physical file already available with abc.txt name or not.
- If it is already available then file will be pointing to that file.
- if it is not already available this line wont create any physical file and just it creates a Java file object to represent the name abc.txt.

File file = new File("abc.txt");
System.out.println(file.exists());//false
file.createNewFile();
System.out.println(file.exists())//true
firstrun:
false
true
secondrun:
true
true

- we can use Java file object to represent directory also
File file = new File("vijay007");
System.out.println(file.exists())//false
file.mkdir();
System.out.println(file.exists())//true

Note:
- Java file i/o concept is implemented based on UNIX operating system and in UNIX everything is treated as a File. Hence we can use Java file object to represent both files and directories
*/