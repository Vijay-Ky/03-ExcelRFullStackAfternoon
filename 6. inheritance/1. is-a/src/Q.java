class N
{
	N()
	{
		System.out.println("N()");
	}
}
class O extends N
{
	O()
	{
		System.out.println("O()");
	}
}
class P extends O
{
	P()
	{
		System.out.println("P()");
	}
}
class Q extends P
{
	public static void main(String[] args) 
	{
		N n1 = new N();
		System.out.println("----------");
		O o1 = new O();
		System.out.println("----------");
		P p1 = new P();
		System.out.println("----------");
		Q q1 = new Q();
		System.out.println("----------");
	}
}
