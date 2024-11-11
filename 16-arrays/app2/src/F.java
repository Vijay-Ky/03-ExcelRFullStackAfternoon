public class F {

	public static void main(String[] args) {
		int[] x = new int[10];
		byte[] y = new byte[10];
		x = y;// these are array objects not variables widening not possible in case of array objects
		System.out.println("done");
	}
	//type casting is not possibe wrt to array object references
}
