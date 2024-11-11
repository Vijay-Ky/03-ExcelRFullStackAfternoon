import java.util.ArrayList;
import java.util.ListIterator;

public class M42
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9);
		list.add(0);
		list.add(40);

		ListIterator it = list.listIterator();
		it.add(50);
		while (it.hasNext())
		{
			System.out.println(it.next() + ",");
		}
		it.add(50);
		System.out.println(it.hasNext());
		while (it.hasNext()) 
		{
			System.out.println(it.next() + ",");
		}
		System.out.println("---------");
	}
}
