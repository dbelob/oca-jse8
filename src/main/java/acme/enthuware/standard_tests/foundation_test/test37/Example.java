package acme.enthuware.standard_tests.foundation_test.test37;

public class Example {
    public static void main(String[] args) {
        Short k = 9;
        Integer i = 9;
        Boolean b = false;
        char c = 'a';
        String str = "123";

        i = (int) k.shortValue();
        str += b;
        b = !b;

        System.out.println(c);
        c *= i;
        System.out.println(c);
    }
}