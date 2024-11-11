public class Z6 {
    static {
        System.out.println(i); // You will get compile time error here
        // can not refer a field before it is defined
    }

    static int i;
}
