class C
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		C c1 = new C();
		C c2 = (C) c1.clone();//downcasting return value of clone method to C type 
		System.out.println("done");
	}
}