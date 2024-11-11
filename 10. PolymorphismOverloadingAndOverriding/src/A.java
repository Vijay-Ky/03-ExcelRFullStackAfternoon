class A 
{
	int add(int i, int j)
	{
		return i + j;
	}
	int add(int i, int j, int k)
	{
		return i + j + k;
	}
	int add(int i, int j, int k, int l)
	{
		return i + j + k + l;
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.add(10, 20));
		System.out.println(a1.add(10, 20, 30));
		System.out.println(a1.add(10, 20, 30, 40));
	}
}
