import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter one int value");
		int i = sc.nextInt();
		

		System.out.println("enter a sentence value");
		//after the int value is readed the cursore will be in the same line
		//nextLine is consuming the entire line after the int value
		//once we press the enter key that key value will be considered by the nexLine method.
		sc.nextLine();//is consuming the enter character
		String j = sc.nextLine();//this one we can use it to read the next entire line
		
		
		System.out.println("enter one float value");
		float k = sc.nextFloat();
		

		System.out.println("enter a sentence value");
		sc.nextLine();
		String l = sc.nextLine();
		

		System.out.println("enter one byte value");
		byte m = sc.nextByte();

		System.out.println("----------------------------");
		
		System.out.println("int: " + i);
		System.out.println("nextLine: " + j);
		System.out.println("float: " + k);
		System.out.println("nextLine: " + l);
		System.out.println("byte: " + m);
	}
}