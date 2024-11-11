class L 
{
	L()
	{
		System.out.println("L()");
	}
}
class M extends L
{
	M()
	{
		System.out.println("M()");
	}
	public static void main(String[] args) 
	{
		M obj = new M();
	}
}
/*
- constructors are not going to be inherited but they involve in the execution.
- in each and every constructor body if there is no 'this()' calling statement then compiler only keeps the 'super()' calling statement in the very beggining of the constructor body. 
- Object class is the super most class in java
- each and every class whether directly or indirectly extends Object class.
- all the in-built classes and all the user-defined classes are going to inherit Object class whether it can be directly or indirectly
*/
