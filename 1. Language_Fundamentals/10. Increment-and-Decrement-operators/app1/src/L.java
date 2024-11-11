class L
{
	public static void main(String[] args)
	{
		int i = 0;
		//       0  + 1 + 1   + 0
		int j = i++ + i + i-- + i +
	//   0  + -1  + 0  + -1
 		i-- + i++ + i-- + i +
	//  -1  + 0   + -1 + -1
		i++ + i-- + i + i++;
		System.out.println(i);
		System.out.println(j);
	}
}

//i = 0, 1, 0, -1, 0, -1, 0, -1, 0