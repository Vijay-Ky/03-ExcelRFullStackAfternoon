import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable
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

	public int compareTo(Object obj)
	{
		int result = i - ((A)obj).i;
		return result;
	}
}
class M27
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		//ArrayList class toString method internally calls the toString method on each element while inserting.
		list.add(new A(110));
		list.add(new A(20));
		list.add(new A(30));
		list.add(new A(410));
		list.add(new A(40));
		list.add(new A(4));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
