class L
{
	public static void main(String[] args)
	{
		int i, j;
		for(i = 0, j = 10; j > 2; j--, i++)
		{
			System.out.println(i + ":" + j);
		}
		System.out.println(i + ":" + j);
	}
}
/*
0:10
1:9
2:8
3:7
4:6
5:4
6:5
7:3
8:2
*/