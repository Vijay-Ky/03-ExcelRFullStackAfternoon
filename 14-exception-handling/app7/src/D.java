class C
{
	C() throws ClassNotFoundException
	{
	}
}
class D extends C
{
	D()
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
