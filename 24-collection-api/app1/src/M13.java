import java.util.ArrayList;
class M13
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		list1.add(70);
		ArrayList list2 = new ArrayList();
		list2.add(20);
		list2.add(40);
		list2.add(60);
		System.out.println(list1);
		System.out.println(list2);
		list1.retainAll(list2);
		System.out.println("-------------");
		System.out.println(list1);
		System.out.println(list2);
	}
}
