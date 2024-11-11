class U <A extends Number>
{
}
class M13
{
	public static void main(String[] args)
	{
		
		U <Integer> u1 = new U <Integer> ();
		U <Double> u2 = new U <Double> ();
		//U <String> u3 = new U <String> ();
		U <Number> u4 = new U <Number> ();
		System.out.println("done");
	}
}