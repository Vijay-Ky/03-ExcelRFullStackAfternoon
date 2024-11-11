class C
{
	public static void main(String[] args) 
	{
		Double obj = new Double(10);//explicite-boxing
		double k = obj.doubleValue();//explicite-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}