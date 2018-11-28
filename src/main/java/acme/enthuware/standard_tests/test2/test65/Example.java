package acme.enthuware.standard_tests.test2.test65;

public class Example {
    public static void main(String[] args) {
        int m = 32;

        switch (m) {
            default:
                System.out.println("default");
            case 32:
                System.out.println("32");
                break;
            case 64:
                System.out.println("64");
                break;
            case 128:
                System.out.println("128");
                break;
        }
    }
}