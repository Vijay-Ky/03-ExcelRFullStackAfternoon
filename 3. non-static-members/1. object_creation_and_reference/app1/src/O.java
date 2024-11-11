class O
{
	int i;	
	public static void main(String[]args)	
	{
		O o1 = new O();
		O o2 = o1;
		System.out.println(o1.i);
		System.out.println(o2.i);
		o1.i = 10;
		System.out.println(o2.i);
		o2.i = 20;
		System.out.println(o1.i);
	}
}
//one object can be refered by any no. of references.
//but one reference can only point to one object at a time.