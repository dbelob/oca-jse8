package acme.enthuware.standard_tests.foundation_test.test65;

public class Example {
    public static void main(String[] args) {
        boolean a, b = false;
        if (a = b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (false) ; else ;
    }
}