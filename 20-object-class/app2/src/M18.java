class F
{
	int i;
	F()
	{
	}
	F(int i)
	{
		System.out.println("constructor: Current Object: " + this +"this.i: = " + this.i + "\t" + "int i: = " + i);
		this.i = i;
	}
	public boolean equals(Object obj)
	{
       //to avoid this we can first get suggestion from instance of operatror
		
		if(! (obj instanceof F))
		{
			return false;
		}
		F ref = (F) obj;//downcasting obj into F
		System.out.println("equals: Current Object: " + this +"this.i: = " + this.i + "\t" + "ref.i: = " + ref.i);
		System.out.println("" + this.i + " " + ref.i);
		return this.i == ref.i;
	}
}
class O extends F
{
	int i;
	O()
	{
		super(900);
	}
}
class M18 
{
	public static void main(String[] args) 
	{
		F f1 = new F(900);
		F f2 = new F(900);
	
		O o1 = new O();	
		//System.out.println(f1.equals(f2));
		System.out.println(f1.equals(o1));
		System.out.println(o1.i);
		//System.out.println(f1.equals("xyz"));
		//System.out.println(f1.equals(90));
		//System.out.println(f1.equals(true));
	}
}

/*
import java.lang.reflect.Field;

class F {
    int i;

    F() {}

    F(int i) {
        System.out.println("Current Object: " + this + " this.i: = " + this.i + "\t" + "int i: = " + i);
        this.i = i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof F)) {
            return false;
        }
        F ref = (F) obj;

        try {
            Field thisI = this.getClass().getDeclaredField("i");
            Field refI = ref.getClass().getDeclaredField("i");

            thisI.setAccessible(true);
            refI.setAccessible(true);

            System.out.println("Class type of this.i: " + thisI.getType());
            System.out.println("Class type of ref.i: " + refI.getType());

            thisI.setAccessible(false);
            refI.setAccessible(false);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        return this.i == ref.i;
    }
}

class O extends F {
    int i;

    O() {
        super(900);
    }
}

class M18 {
    public static void main(String[] args) {
        F f1 = new F(900);
        F f2 = new F(900);

        O o1 = new O();
        System.out.println(o1.i);

        //System.out.println(f1.equals(f2));
        System.out.println(f1.equals(o1));
   
    }
}
*/