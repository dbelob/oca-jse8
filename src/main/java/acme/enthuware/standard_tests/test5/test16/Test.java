package acme.enthuware.standard_tests.test5.test16;

// Consider the following code:
class Super {
    static String ID = "QBANK";
}
class Sub extends Super {
    static {
        System.out.print("In Sub");
    }
}
public class Test {
    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
// What will be the output when class Test is run?