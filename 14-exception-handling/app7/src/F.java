class E
{
	E()
	{
		try
		{
			Class.forName("");
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
class F extends E
{
	F()
	{
		super();
	}
}
