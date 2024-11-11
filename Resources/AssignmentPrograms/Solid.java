class Solid
{
    public static void main(String[] args)
	{
        int i = 0;
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 5;
        int e = 6;
		 //i = 0, 1, 2, 1, 0, 1
		 //a = 2, 3
		 //b = 3, 2
		 //c = 4, 5
		 //d = 5, 4
		 //e = 6, 7
         //      (0   +  2   -  1   *  1  + 0   + 3  -  2  +  4   * 4   + 6)
		 //      (0   +  2   -  1  + 0   + 3  -  2  +  16   + 6)
		 //      (0   +  1  + 0   + 1 +  22)
		 //      ( 1 + 1 + 22) == 24 
		 // j = 24
        int j = (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++);/* +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                (i++ + ++i - --i * i-- + i++ + ++a - --b + c++ * --d + e++) +
                i-- + i++ + i-- + i + i++ + i-- + i + i++ + i-- + i + i++ + i;
        
        int k = ++i + --i + ++i + i +
                --i + i + --i + i +
                ++i + ++i + --i + i +
                --i + i + --i + i;*/
        System.out.println(i);
        System.out.println(j);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //System.out.println(k);
    }
}

