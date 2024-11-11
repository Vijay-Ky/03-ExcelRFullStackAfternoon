class K2
{
     static int i = 100;
	 public static void main(String[] args)
     {
        System.out.println("a: " + i);
        int i = 10;
        System.out.println("b: " + i);
        i = 20;
        System.out.println("c: " + K2.i);
		K2.i = 200;
		System.out.println("d: " + K2.i);
		System.out.println("e: " + i);
     }
}

/*
- if global and local variables are with the same name then local variable will be given the preference.

- if local and global are with the same name if you wanted to refer to the global one then refer it along with the class name.

- by using class reference you can access the global static variables.

- static variables are also called as class variables.
*/
