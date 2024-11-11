import java.util.ArrayList;
class M14
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
		System.out.println(list1);
		list1.removeRange(2, 5);
		System.out.println("----------------");
		System.out.println(list1);
	}
}