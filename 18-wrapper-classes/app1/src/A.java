class A 
{
	public static void main(String[] args) 
	{
		int i = 0;
		Integer obj = new Integer(i);//explicite-boxing
		int k = obj.intValue();//explicite-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}

//Object Oriented -> Java, C++, Python
//Object Based -> Javascript, Python
//Java is not 100% Object oriented since the usage of primitive datatypes.
//In order to represent primitives also in the form of objects we need wrapper classes.
//for all the 8 primitive datatypes we have the corresponding wrapper classes.
/* primitive datatype______________________Corresponding Wrapper class
	byte                                    Byte
	short                                   Short
	int										Integer
	long									Long
	float									Float
	double									Double
	char									Charater
	boolean									Boolean
*/
//All the wrapper classes are final classes 
   //-> we can't extend wrapper classes further by using another class
   //wrapper class cant become a super-class or parent class
/*final class A extends Object
{
}
class B extends A
{
}*/
//In all the wrapper classes except Character wrapper class there are two constructors are available
  //1. constructor which takes corresponding primitive as the argument
  //2. constructor which takes String as the argument

  //"In the Character wrapper class we have only
  //1. constructor which takes corresponding primitive as the argument

  //"We cant convert from String to character"
  //"But we cant convert from character to String"