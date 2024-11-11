package app1;
import java.util.Arrays;
public class U
{
	U(String...args)
	{
		for(int i = 0; i <= args.length; i++)
		{
			int j = args.length;
			String[] array = new String[j];
			if(!(args.length == 0))
			{
				array[i] = args[i];
			}
			System.out.println(Arrays.toString(array));
		}
	}
	public static void main(String [] args)
	{
		U u1 = new U();
		U u2 = new U("abc");
		U u3 = new U("msg1", "xyz", "hello");
		U u4 = new U("msg1", "xyz", "hello","abc");
	}
}

