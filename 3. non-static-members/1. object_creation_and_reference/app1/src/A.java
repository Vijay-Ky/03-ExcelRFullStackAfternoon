class A
{
	int i;
	public static void main(String[] args)
	{
		System.out.println(i);
	}
}

/*
- non-static variable == instance(Object) variable
- non-static members cant be referenced from a static context without a reference variable.
- while creating the object we get the reference variable.
- By using that reference variable only we can access non static members of that class.
*/