package acme.enthuware.standard_tests.test1.test24;

public class Example {
    public static void main(String[] args) {
        String str1 = "one";
        String str2 = "two";
        System.out.println(str1.equals(str1 = str2));
    }
}