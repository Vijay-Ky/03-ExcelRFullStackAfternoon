class Driver12
{
	public static void main(String[] args)
	{
		A a1 = (A) new B();//doing explicitly
		A a2 = new B();
		C c1 = new D();
		C c2 = (C) new D();//doing explicitly
		System.out.println("done");

		System.out.println("-------Just for reference---------");
		Class class1 = a1.getClass();
		Class class2 = a2.getClass();
		Class class3 = c1.getClass();
		Class class4 = c2.getClass();

		System.out.println(class1.getName());
		System.out.println(class2.getName());
		System.out.println(class3.getName());
		System.out.println(class4.getName());
	}
}