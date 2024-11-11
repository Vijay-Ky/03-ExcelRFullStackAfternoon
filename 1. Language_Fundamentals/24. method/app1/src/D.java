class D
{
	public static void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args)
	{
		System.out.println("from main begin");
		D.test();
		System.out.println("from main end");
	}
}
/*
- method can have(accept) 0 no. of arguments.(no-argument) method.
- in order to call the no-argument method we dont have to supply any value.
- for calling static methods we dont have to create the object.
- static methods can be called directly by there name within the same class.
- within the same class itself we can call the static method by class reference.
- static methods can be called with class reference.
- while you are calling the static method outside of the declared class then compulsary we need to give the containing class reference.
*/