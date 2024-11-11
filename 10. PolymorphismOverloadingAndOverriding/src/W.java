class V
{
	static int count = 0;

	V()
	{
		count++;
	}

	static int getCount()
	{
		return count;
	}
}
class W extends V  
{
	static int count = 100;

	W()
	{
		count++;
	}

	static int getCount()
	{
		return count;
	}

	public static void main(String[] args) 
	{
		V v1 = new V();
		V v2 = new V();

		System.out.println("V.getCount(): " + v1.getCount());

		W w1 = new W();
		W w2 = new W();

		System.out.println("W.getCount(): " + W.getCount());
		System.out.println("W.getCount(): " + w1.getCount());
		System.out.println("W.getCount(): " + w2.getCount());

		System.out.println("count from V class: " + W.count);
		System.out.println("count from V class: " + w1.count);
		System.out.println("count from V class: " + w2.count);

		System.out.println("-------------------------------");

		V v3 = new W();



		System.out.println("V.getCount(): " + v3.getCount());
	}
}
//count static variable in the V class is not overridden by the count static variable in the W class.