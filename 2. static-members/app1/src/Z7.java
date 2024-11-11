public class Z7 {
    static {
        i = 10; // A field can be initialized before it is defined.there is an interesting
                // point, We can initialize a field before it is defined. Have look at below
                // code. There will be no compile time errors here.
    }

    static int i;
}
