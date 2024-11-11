class G
{
	int i;
	public boolean equals(Object obj)//
	{
		return this.i == ((Z)obj).j;//g1.i == z1.i
	}
}
class Z
{
	int j;
}
class Driver2
{
	public static void main(String[] args) 
	{
		G g1 = new G();		
		g1.i = 10;

		G g2 = new G();
		g2.i = 10;

		System.out.println(g1 == g2);//false
		//System.out.println(g1.equals(g2));//true

		G g3 = g1;

		System.out.println(g3 == g1);//true
		//System.out.println(g3.equals(g1));//true

		Z z1 = new Z();
		z1.j = 20;
		System.out.println(g1.equals(z1));

	}
}
/*
1. "==" operator always checking for the memory location.if both reference pointing to same object == operator returns true
2. if both the references pointing to different object returns false.
3. By default equals method compares two references. Object obj is g2.i and i is this.i. how to use equals method in our class i,e, we can use == operator between attributes.
*/
