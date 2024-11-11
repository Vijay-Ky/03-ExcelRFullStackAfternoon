class E extends Object implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		E e1 = new E();
		E e2 =  (E) e1.clone();
		System.out.println("e1: " + e1);
		System.out.println("e2: " + e2);
	}
}
class F extends E implements Cloneable
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		F f1 = new F();
		F f2 =  (F) f1.clone();
		System.out.println("f1: " + f1);
		System.out.println("f2: " + f2);
		System.out.println("----------");
		E.main(null);
	}
}