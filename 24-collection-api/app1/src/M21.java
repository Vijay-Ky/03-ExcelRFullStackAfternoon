import java.util.Arrays;
class M21 
{
	public static void main(String[] args) 
	{
		int[] array = {10, 5, 2, 4, 8, 10};

		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + ", ");
		}
		
		System.out.println("\n -----------------------");

		int counter = 1;
		for (int i = 0; i < array.length; i++)
		{
			if (counter != array.length)
			{
				System.out.print(array[i] + ", ");
			}
			else if(counter == array.length)
			{
				System.out.print(array[i]);
			}
			counter++;
		}
		//System.out.println("final order ");
		//Arrays.sort(array, Collections.reverseOrder());
	}
}
