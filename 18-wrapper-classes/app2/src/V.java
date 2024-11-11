public class V
{
	//var-arg by default is an array
	static void test(int...x)
	{
		System.out.println("size: " + x.length);
		System.out.println("no. of indexes are availalbe: " + (x.length - 1));
	}
	public static void main(String [] args)
	{
		test();
		test(20,40,70);
		test(90,20,10,60,50);
	}
}
