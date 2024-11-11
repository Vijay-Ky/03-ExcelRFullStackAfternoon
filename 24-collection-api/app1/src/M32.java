import java.util.ArrayList;
import java.util.Collections;
class M32 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(0);
		list.add(20);
		list.add(40);
		list.add(6);
		list.add(9);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}
}
