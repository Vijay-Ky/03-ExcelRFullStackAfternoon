class MinimumOfThree 
{
	public static void main(String[] args) 
	{
		int i = 300, j = 300, k = 300, min = 0;
		
		if(i < j && i < k)
		{
			min = i;
		}
		else if(j < k)
		{
			min = j;
		}
		else if((i == j) && (i == k) && (j == k))
		{
			System.out.println("All values are equal!");
		}
		else
		{
			min = k;
		}

		System.out.println("minimum: " + min);
	}
}
