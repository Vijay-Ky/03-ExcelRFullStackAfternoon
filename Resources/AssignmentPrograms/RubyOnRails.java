class RubyOnRails 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int k = 0;
		int l = 2;
		int j =
	//  0 + 0   + 0 +  1  +  2  + 3 + 3 + ==> 9
		i + i++ + k + i++ + i++ + i + i + 
	//  3   + 0 + 4   + 3 + 2 + 3   + ==> 15
		i++ + k + i-- + i + l + i++ +
	//  4   + 5   +  2  + 0   +  4  + 5   + 1   + 1 ==>22
		i++ + i-- + l-- + k++ + i++ + i-- + l-- + k++ +
	//  4   + 0   + 3   + 2   + 4   + 5 + 5   + 4   + 3 + 3   + -1 ==>32
		i-- + l-- + i++ + k++ + i++ + i + i-- + i++ + k + k++ + l--; 
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}
//
