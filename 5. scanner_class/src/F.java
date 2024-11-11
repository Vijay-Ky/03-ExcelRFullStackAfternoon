import java.util.Scanner;
class F
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter one int value");
		int i = sc.nextInt();

		System.out.println("enter one double value");
		double j = sc.nextDouble();
		
		System.out.println("enter one float value");
		float k = sc.nextFloat();
		
		System.out.println("enter one byte value");
		byte l = sc.nextByte();
		
		System.out.println("enter one short value");
		short m = sc.nextShort();
		
		System.out.println("enter one long value");
		long n = sc.nextLong();

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		

		//close the resource
		sc.close();
	}
}