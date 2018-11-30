package acme.enthuware.standard_tests.test3.test16;

public class Operators {
    public static int operators() {
        int x1 = -4;
        int x2 = x1--;
        int x3 = ++x2;
        if (x2 > x3) {
            --x3;
        } else {
            x1++;
        }
        return x1 + x2 + x3;
    }

    public static void main(String[] args) {
        System.out.println(operators());
    }
}