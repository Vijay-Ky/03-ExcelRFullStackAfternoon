class M
{
	public static void main(String[] args) 
	{
		String i = "aaa";
		switch(i)
		{
			case "xyz":
				System.out.println("from case \"xyz\" ");
				break;
			case "def":
				System.out.println("from case \"def\" ");
				break;
			case "abc":
				System.out.println("from case \"abc\" ");
				break;
			default:
				System.out.println("from case default 1 ");
				break;
			default:
				System.out.println("from case default 2 ");
				break;
		}
	}
}
