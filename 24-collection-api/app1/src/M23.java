import java.util.ArrayList;
import java.util.Collections;
class M23 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("Z");
		list.add("G");
		list.add("1");
		list.add("P");
		list.add("D");
		list.add("a");
		list.add("k");
		list.add("e");
		list.add("j");
		System.out.println("Before sort: " + list);
		//1. Numbers, Upper case Characters, Lower case Characters ==> sorted
		//Based on ASCII values
		Collections.sort(list);
		System.out.println("After sort: " + list);
	}
}
