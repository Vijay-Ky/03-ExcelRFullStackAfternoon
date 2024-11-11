class M 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hellotoall");
		System.out.println(sb);          // 0123456789
		sb.delete(2, 9000);
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
