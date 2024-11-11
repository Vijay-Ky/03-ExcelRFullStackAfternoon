class MinimumOfThreeTernary  
{
	public static void main(String[] args) 
	{
		int i = 0, j = 0, k = 0, min = 0;
		min = ((i == j) && (i == k) && (j == k)) ? -1 :((i < j && i < k) ? i : ((j < k) ? j : k));
		/*if((i == j) && (i == k) && (j == k))
		{
			System.out.println("All values are equal!");
		}
		else
		{
			System.out.println("Minimum: " + min);
		}*/
		System.out.println(min);
	}
}
