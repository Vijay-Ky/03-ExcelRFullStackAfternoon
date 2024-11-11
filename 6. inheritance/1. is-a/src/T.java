class A//super, parent, base
{
	A(int i)
	{
		System.out.println("A(int)");
	}
}
class T extends A //class T is sub, child, derived
{
	T(int i)
	{
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		T t1 = new T(90);
		System.out.println("done");
	}
}
