class E
{
	int i;
	E(int k)
	{
		System.out.println("E(int)");
		i = k;
	}
	public static void main(String[] args)
	{
		E e1 = new E(9);
		System.out.println("-----");
		E e2 = new E(9);
		System.out.println("-----");
		E e3 = new E(9);
		System.out.println("-----");
		System.out.println(e1.i);
		System.out.println(e2.i);
		System.out.println(e3.i);
	}
}