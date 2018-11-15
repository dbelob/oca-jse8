package acme.enthuware.standard_tests.foundation_test.test40;

public class Example {
    public static void main(String[] args) {
        byte by = 10;
        switch (by) {
//            case 200: //some code;
//            case 300: //some code;
        }

        int a = 123;
        switch (a) {
            case 'q':
                System.out.println("q");
                break;
            case 'w':
                System.out.println("w");
                break;
            case 'e':
                System.out.println("e");
        }

        int b = 2;
        switch (b) {
            default:
                System.out.println("default");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
        }
    }
}