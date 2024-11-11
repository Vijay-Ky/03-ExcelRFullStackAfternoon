class A
{
	int i;
}
class B extends A
{
	int j;

	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}

/*
1. Inheritance is one of the basic pillars of Object oriented programming language.
2. The process of aquiring the properties and behaviours of another class. 
3. Base class properties and behaviours can be inherited to the sub-class.
4. Base = parent and Sub-class = child or derived class
5. There are many types of inheritance available in Java.
   1. Single Inheritance(one class is exteding another class)
   2. Multi-level Inheritance
   3. Hirachical Inheritance
   4. Hybrid Inheritance(There might be a ambiguity)
   5. Multiple Inheritace(which is possible only through interfaces)
6. we can achieve inheritance through a keyword called 'extends' for class-to-class inheritance
7. we can achieve code reusability in case of inheritance
*/