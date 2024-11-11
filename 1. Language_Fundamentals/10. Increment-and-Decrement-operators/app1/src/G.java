class G
{
	public static void main(String[] args)
	{
		int i = 0;
		//       0  + 1 + 1   + 2
		int j = i++ + i + i++ + i;//
		System.out.println(i);//2
		System.out.println(j);//4
	}
}
//i = 0, 1, 2