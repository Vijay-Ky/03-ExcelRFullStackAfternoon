import java.util.ArrayList;
class M15 extends ArrayList
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		M15 list1 = new M15();
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