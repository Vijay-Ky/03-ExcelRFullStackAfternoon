class J
{
	J()
	{
		System.out.println("J()");	
	}
	J(int i)
	{
		System.out.println("J(int)");
	}
	J(int i, int j)
	{
		System.out.println("J(int, int)");
	}
	public static void main(String[] args)
	{
		J ji = new J();
		System.out.println("-----");
		J j2 = new J(20);
		System.out.println("-----");
		J j3 = new J();
		System.out.println("-----");
		J j4 = new J(50, 50);
		System.out.println("-----");
	}
}