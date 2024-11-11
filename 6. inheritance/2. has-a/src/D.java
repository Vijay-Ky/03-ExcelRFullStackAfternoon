class A
{
	int i;
	void test1()
	{
		System.out.println("A-test1");
	}
}
class D
{
	//reference loading with the null
	//D dobj;
	A obj;
	void test2()
	{
		System.out.println("D-test2");
		//cant call anything on the null reference or you will get NullPointerException
		System.out.println(obj.i);
		obj.test1();
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		//System.out.println(d1.obj);
		//System.out.println(d1.dobj);
		d1.test2();
	}
}
