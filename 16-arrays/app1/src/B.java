public class B
{
	public static void main(String[] args)
	{
		/*
		1. An array is an indexed collection of fixed number of homogenious data elements.
		2. We can use an array to represent a group of values of same the type.
		3. Once we create an array we cant resize it. it is fixed.
		4. Arrays are also objects in java.
		5. Arrays has indexes and index will be starting from 0
		6. We can develop any dimentional arrays with the help of rows and columns.
		7. Array elements must be of the same type. different type not possible.
		*/
		int[] x = new int[4];
		//default values
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		//recently assigned values
		System.out.println(x.length);
		System.out.println(x[0]);//10
		System.out.println(x[1]);//20
		System.out.println(x[2]);//30
		System.out.println(x[3]);//40
	}
}