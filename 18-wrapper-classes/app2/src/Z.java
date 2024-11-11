public class Z
{
    //var-arg should be always the last argument.
	//maximum only one var-arg method can be there.
	//static void test(String...x)//okay
	//static void test(int i, int j, int k, int l, String... m)//okay
	static void test(int i, int j, String... m, int k, int l)//not-okay
	//static void test(int...i, int...j)//not-okay
	{
	}
}
