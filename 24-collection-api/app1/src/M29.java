import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class A
{
	int i;
	int j;

	A(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public String toString()
	{
		return "[" + i + ", " + j + "]";//Integer.toString(i);
	}
}
class compareBasedOnIValue implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		 A a1 = (A)obj1;
		 A a2 = (A)obj2;
		 return a1.i - a2.i;
	}
}
class compareBasedOnJValue implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		A a1 = (A)obj1;
		A a2 = (A)obj2;
		return a1.j - a2.j;
	}
}

class M29
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		//ArrayList class toString method internally calls the toString method on each element while inserting.
		list.add(new A(110, 9));
		list.add(new A(20, 8));
		list.add(new A(30, 7));
		list.add(new A(410, 6));
		list.add(new A(40, 5));
		list.add(new A(4, 3));
		System.out.println(list);
		Collections.sort(list, new compareBasedOnIValue());
		System.out.println("Sort based on i value: " + list);
		Collections.sort(list, new compareBasedOnJValue());
		System.out.println("Sort based on j value: " + list);
	}
}
