class B
{
	public static void main(String[] args) 
	{
		Byte obj = new Byte((byte)10);//explicite-boxing
		int k = obj.byteValue();//explicite-unboxing
		System.out.println(k);
		System.out.println("done");
	}
}