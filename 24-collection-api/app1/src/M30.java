import java.util.ArrayList;
import java.util.Collections;
class M30 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("blue");
		list.add("green");
		list.add("grey");
		list.add("black");
		list.add("white");
		System.out.println("initlial: " +  list);
		Collections.sort(list);
		System.out.println("sorted: " +  list);
		int i = Collections.binarySearch(list, "red");

		System.out.println(i);
	}
}
