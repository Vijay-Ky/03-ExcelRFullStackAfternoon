class I 
{
	public static void main(String[] args) 
	{
		//adding 4 characters
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		sb.append("12345678911234567");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println("---------------------------");
		//removes extra capacity 
		//length and capacity becomes same
		//unoccupied locations will be removed and length and capacity bcms same 
		sb.trimToSize();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}
