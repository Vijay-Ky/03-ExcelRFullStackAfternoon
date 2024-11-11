import java.util.ArrayList;
import java.util.Collections;
class M31
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(4);
		System.out.println("initlial: " +  list);
		Collections.sort(list);
		System.out.println("sorted: " +  list);
		int i = Collections.binarySearch(list, 6);

		System.out.println(i);
	}
}
