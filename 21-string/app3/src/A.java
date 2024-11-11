class A
{
	public static void main(String[] args)
	{
		String s1 = "abc SEPERATOR xyz SEPERATOR hello SEPERATOR 123";
		String[] splits = s1.split(" SEPERATOR ");
		for(String split : splits)
		{
			System.out.println(split);
		}
	}
}
/*
 * String class contains split method
 * it splits main string into number of strings by making use of a common seperator.
 * we can supply any sepearator it will split string into sub strings
 * */
