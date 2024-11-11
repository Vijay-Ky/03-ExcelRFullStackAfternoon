import java.util.ArrayList;

public class M4
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(9.0);
		list.add(190);
		list.add(910);
		list.add("abc");
		System.out.println(list);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i) + ",");
		}
		System.out.println();
		System.out.println("--------");
		for (Object obj : list)
		{
			System.out.print(obj + ",");
		}
	}
}
