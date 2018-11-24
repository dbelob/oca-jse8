package acme.enthuware.standard_tests.foundation_test.test71;

public class Conversion {
    public static void main(String[] args) {
        int i = 1234567890;
        float f = i;
        System.out.println(i - (int) f);
    }
}