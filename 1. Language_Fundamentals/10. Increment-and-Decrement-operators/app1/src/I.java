class I
{
	public static void main(String[] args)
	{
		int x = 0;
		//      0   + 1   + 2  + 3
		int	y = x++ + x++ + x++ + x;
		System.out.println(x);
		System.out.println(y);
	}
}
//x = 0, 1, 2, 3