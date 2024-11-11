class G implements Cloneable
{
	int i;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		G obj1 = new G();
		obj1.i = 10;
		G obj2 = (G) obj1.clone();//downcasting return value of clone method to D type 
		System.out.println("a: " + obj2.i);//10
		obj2.i = 20;
		System.out.println("b: " + obj1.i);//10
		obj1.i = 30;
		System.out.println("c: " + obj2.i);//20
		System.out.println("d: " + obj1.i);//30
	}
}
/*
1. while cloning, data of the original object copied into cloned object.
2. After that the changes are independent. i,e if we do change in the original
that will not be reflecting to duplicate and, if we do change in
the duplicate that is also not reflecting to the original object. Both
are independent objects.
3. This type of cloning operation we call it as a
deep copy operation, why because no link between original and
duplicate. changes in the original not reflecting back to
duplicate, changes in the duplicate not reflecting back to
original. That is why it is called deep copy operation. 
4. object class clone method providing a deep copy operation. changes in
the original not reflecting back to duplicate, changes in the
duplicate not reflecting back to original.

The opposite to deep copy operation is shallow copy operation
*/
