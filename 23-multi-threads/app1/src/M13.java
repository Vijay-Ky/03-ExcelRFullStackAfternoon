public class M13
{
	public static void main(String[] args)
	{
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);

		System.out.println("------------------------");

		Thread t1 = Thread.currentThread();
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());

		t1.setPriority(9);
		
		//Exception - IAE
		//t1.setPriority(0);
	}
}
