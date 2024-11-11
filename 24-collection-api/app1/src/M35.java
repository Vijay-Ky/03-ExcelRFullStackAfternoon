import java.util.ArrayList;
import java.util.ListIterator;
class M35
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
		System.out.println(list);
		System.out.println("--------------");

		ListIterator listIterator = list.listIterator();

		while (listIterator.hasNext())
		{
			System.out.println(listIterator.next() + ", ");
		}
	}
}
