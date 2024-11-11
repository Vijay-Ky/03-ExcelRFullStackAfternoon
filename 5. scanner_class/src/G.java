import java.util.Scanner;
class G
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter one int value");
		System.out.println("enter one double value");
		System.out.println("enter one float value");
		System.out.println("enter one byte value");
		System.out.println("enter one short value");
		System.out.println("enter one long value");
		
		int i = sc.nextInt();
		double j = sc.nextDouble();
		float k = sc.nextFloat();
		byte l = sc.nextByte();
		short m = sc.nextShort();
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