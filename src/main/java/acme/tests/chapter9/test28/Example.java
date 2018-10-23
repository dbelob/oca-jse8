package acme.tests.chapter9.test28;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
//        Predicate dash = c -> c.startsWith("-");
        Predicate<String> dash = c -> c.startsWith("-");
        System.out.println(dash.test("–"));
    }
}