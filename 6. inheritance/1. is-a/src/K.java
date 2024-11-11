class J
{
	static int m;
	int n;

	static void test1()
	{
		System.out.println("from test1");
	}

	void test2()
	{
		System.out.println("from test2");
	}
}
class K extends J
{
	public static void main(String[] args) 
	{
		System.out.println(K.m);
		K.test1();

		K k1 = new K();
		System.out.println(k1.n);
		k1.test2();
	}
}


	

