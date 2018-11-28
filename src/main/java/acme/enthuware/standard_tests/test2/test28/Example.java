package acme.enthuware.standard_tests.test2.test28;

public class Example {
    public static void main(String[] args) {
        System.out.println("new Boolean(\"false\") == false:      " + (new Boolean("false") == false));
        System.out.println("new Boolean(\"true\") == true:        " + (new Boolean("true") == true));
        System.out.println();
        System.out.println("new Integer(42) == 42:              " + (new Integer(42) == 42));
        System.out.println("new Integer(42) == new Integer(42): " + (new Integer(42) == new Integer(42)));
    }
}