//equals method
class A
{
	int i;
}
class Driver1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;

		A a2 = new A();
		a2.i = 10;

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));

		A a3 = a1;

		System.out.println(a3 == a1);
		System.out.println(a3.equals(a1));
	}
}
