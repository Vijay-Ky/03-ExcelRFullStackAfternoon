import java.util.ArrayList;
import java.util.Iterator;
class M36
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println("initial list: " + list);
		System.out.println("--------------");

		Iterator iterator = list.iterator();

		while (iterator.hasNext())
		{
			System.out.println(iterator.next());
			iterator.remove();
			System.out.println(list);
		}

		System.out.println("final list: " + list);
	}
}
