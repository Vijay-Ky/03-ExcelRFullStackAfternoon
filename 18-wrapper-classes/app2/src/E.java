public class E
{
	@SuppressWarnings("removal")
	public static void main(String [] args)
	{
		Character c1 = new Character('a');
		char c2 = c1;//auto-unboxing
		System.out.println(c2);
		System.out.println("done");
	}
}
 