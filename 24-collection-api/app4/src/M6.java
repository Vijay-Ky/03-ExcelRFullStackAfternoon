//Map
import java.util.LinkedHashMap;
class M6
{
	public static void main(String[] args) 
	{
		//order of addition go for LinkedHashMap.
		LinkedHashMap map1 = new LinkedHashMap();
		
		map1.put("abc", 777);
		map1.put("xyz", 777);
		map1.put(555, "xyz");
		map1.put(99.2, true);
		map1.put('a', false);
		//key and value as one entry.
		
		System.out.println(map1);
	}
}