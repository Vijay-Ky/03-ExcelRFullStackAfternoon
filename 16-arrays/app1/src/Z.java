import java.util.Arrays;
class Z
{
	public static void main(String[] args)
	{
		int[] x = new int[2];
		
		x[0] = 10;
		x[1] = 20;

		System.out.println("x array: " + Arrays.toString(x));
		test(x);
		System.out.println("x array: " + Arrays.toString(x));
	}

	public static void test(int[] z)
	{
		int i = z[0];
		z[0] = z[1];
		z[1] = i;
	}
}