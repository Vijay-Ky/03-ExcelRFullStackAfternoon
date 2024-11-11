class Project1 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("Please provide some numbers in the command line argument");
			return;
		}

		int sum = 0;
		for(String str : args)
		{
			try
			{
				int value = Integer.parseInt(str);
				sum += value;//sum = sum + value;
			}
			catch (NumberFormatException ex)
			{
				System.out.println("from catch: " + ex);
				return;
			}
		}
		System.out.println("Addition of the numbers you have supplied: " + sum);
	}
}
