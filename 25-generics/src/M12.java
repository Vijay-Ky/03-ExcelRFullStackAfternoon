class Z <A extends P>
{
	A i;
}
class M12
{
	public static void main(String [] args)
	{
		
		Z <P> t1 = new Z<P>();
		Z <Q> t2 = new Z<Q>();
		Z <R> t3 = new Z<R>();
		Z <S> t4 = new Z<S>();
		Z <T> t5 = new Z<T>();
		Z <String> t6 = new Z <String> ();
		System.out.println("done");
	}
}