class A 
{
	String userName = "abc";
	int userRegisterNo = 123;

	public String toString()
	{
		return "" + userName + " " + userRegisterNo;
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1);
	}
}
