import java.util.Scanner;
import java.lang.System;
import java.lang.String;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("enter one complete token or word or character...");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(s1);
	}
}
/*
- We use Scanner class object to get the input from the user.
- Scanner is a inbuilt class
- Scanner is available in the util package
- if any members are available in the java.lang package, there is no need to import those members for ex: System, String
- Streams 
  1. input stream
  2. output stream
  3. error stream
*/