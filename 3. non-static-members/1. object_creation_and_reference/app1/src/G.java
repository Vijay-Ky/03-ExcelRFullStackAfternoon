class G
{
	int i;
	public static void main(String[]args)
	{
		G g1 = new G();
		System.out.println(g1.i);
	}
}

/*
- non-static members are going to be loaded to the memory while we are creating an object to that class.
- in case of variables, they are going to load with their default values.
- for one class we can able to create any no. of objects.
- each and every time while creating the object everytime all the non-static members are going to be loaded to the memory.
- each every object will be having different copies of the same non-static members of that class.
*/