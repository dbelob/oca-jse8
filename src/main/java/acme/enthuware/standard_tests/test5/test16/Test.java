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
// You had to select 1 option:
//
// A. It will print In Sub and QBANK
// B. It will print QBANK
// C. Depends on the implementation of JVM
// D. It will not even compile
// E. None of the above
