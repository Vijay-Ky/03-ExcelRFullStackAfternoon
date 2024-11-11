class E <A, B, C, D>
{
	A i, j;
	B m, n;
	String p, q;
	C r, s;
	D t, u;
}
class M5
{
	public static void main(String [] args)
	{
		E <String, String, Double, Boolean> e1 = new E <String, String, Double, Boolean> ();
		E <String, String, Double, Boolean>e2 = new E <String, String, Double, Boolean> ();
		e1.i = "abc";
		e1.j = "abc";
		e1.m = "abc";
		e1.n = "abc";
		e1.p = "abc";
		e1.q = "abc";
		e2.i = "90";
		e2.j = "100";
		e2.m = "abc";
		e2.n = "abc";
		e2.p = "abc";
		e2.q = "abc";


		e1.i = "abc";
		e1.j = "abc";
		e1.m = "abc";
		e1.n = "abc";
		e1.p = "abc";
		e1.q = "abc";
		e1.r = 20.0;
		e1.s = 20.0;
		e1.t = true;
		e1.u = false;
		System.out.println("done");
	}
}