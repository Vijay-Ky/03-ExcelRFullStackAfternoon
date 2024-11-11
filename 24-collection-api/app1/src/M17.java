import java.util.ArrayList;
class M17 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list.contains(20));
		System.out.println(list.contains(40));
		System.out.println(list.contains(80));
	}
}
