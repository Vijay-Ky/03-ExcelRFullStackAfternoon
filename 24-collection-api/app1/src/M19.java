import java.util.ArrayList;
import java.util.Collections;
class M19
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(0);
		list.add(4.0);
		list.add(2);
		list.add(8);
		list.add(6);
		list.add(10);
		System.out.println("intial list before sort: " + list);
		
		Collections.sort(list);

		System.out.println("final list after sort: " + list);
	}
}
