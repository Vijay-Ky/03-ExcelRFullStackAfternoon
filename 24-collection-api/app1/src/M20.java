import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class M20
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(0);
		list.add(4);
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(10);
		System.out.println("intial list before sort: " + list);

		Comparator ctr = Collections.reverseOrder();
		
		Collections.sort(list, ctr);

		System.out.println("final list after reverse sort: " + list);
	}
}
