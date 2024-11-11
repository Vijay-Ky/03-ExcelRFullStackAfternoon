import java.util.ArrayList;
import java.util.Collections;
class A implements Comparable
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

	public int compareTo(Object obj)
	{
		int result = i - ((A)obj).i;
		return result;
	}
}
class M28
{
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
		Collections.sort(list);
		System.out.println(list);
	}
}
