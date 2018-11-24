package acme.enthuware.standard_tests.test1.test01;

public class TestClass {
    public static void main(String[] args) {
        try {
            hello();
        } catch (MyException me) {
            System.out.println(me);
        }
    }

    static void hello() throws MyException {
        int[] dear = new int[7];
        dear[0] = 747;
        foo();
    }

    static void foo() throws MyException {
        throw new MyException("Exception from foo");
    }
}