import java.io.File;
class F7
{
	public static void main(String[] args)
	{
		// Explicitly casting null to String
		// otherwise if you just supply null you wil get reference to File is ambiguous.  both constructor File(String) in File and constructor File(URI) in File match
		// for this you will get NullPointerExcpetion
		//File file = new File(null); 
		File file = new File((String)null); 
		System.out.println("done");
	}
}