import java.util.ArrayList;
class A
{
	int i;

	A(int i)
	{
		this.i = i;
	}
}
class M24 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(new A(10));
		list.add(new A(20));
		list.add(new A(30));
		list.add(new A(40));
		System.out.println(list);
	}
}
