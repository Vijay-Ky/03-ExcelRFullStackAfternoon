class F
{
	@SuppressWarnings("removal")
	public static void main(String[] args) 
	{
		Boolean obj1 = new Boolean(true);
		Boolean obj2 = new Boolean(false);
		Boolean obj3 = new Boolean(!true);
		Boolean obj4 = new Boolean(!false);
		boolean x = true, y = false;
		Boolean obj5 = new Boolean(x);
		Boolean obj6 = new Boolean(y);

		boolean b1 = obj1.booleanValue();
		boolean b2 = obj2.booleanValue();
		boolean b3 = obj3.booleanValue();
		boolean b4 = obj4.booleanValue();
		boolean b5 = obj5.booleanValue();
		boolean b6 = obj6.booleanValue();

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6);
		System.out.println("done");
	}
}