class E 
{
	static int count;
	E()
	{
		count++;
	}
	E(int i)
	{
		count++;
	}
	E(int i, int j)
	{
		count++;
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 = new E(10);
		E e3 = new E(10, 20);
		E e4 = new E(20);
		E e5 = new E();
		System.out.println(e1.count);
		System.out.println(e2.count);
		System.out.println(e3.count);
		System.out.println(e4.count);
		System.out.println(e5.count);
	}
}
