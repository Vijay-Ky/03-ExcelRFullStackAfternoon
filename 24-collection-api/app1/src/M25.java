import java.util.ArrayList;
class A
{
	int i;

	A(int i)
	{
		this.i = i;
	}

	public String toString()
	{
		return i + "";//Integer.toString(i);
	}
}
class M25
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		//ArrayList class toString method internally calls the toString method on each element while inserting.
		list.add(90);
		list.add("abc");
		list.add(new A(10));
		list.add(new A(20));
		list.add(new A(30));
		list.add(new A(40));
		System.out.println(list);
	}
}
