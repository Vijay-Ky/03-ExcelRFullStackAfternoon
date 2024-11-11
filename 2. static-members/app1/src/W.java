class W
{
   static int i = 10;
   static int j = test();
   static int test()
   {
		return 20;
   }
   public static void main(String[] args)
   {
	   System.out.println(i);
	   System.out.println(j);
	}
}
/*
- to suppply the value for j we are calling test() which is returning int value 20.
that value will be supplied to j.
*/