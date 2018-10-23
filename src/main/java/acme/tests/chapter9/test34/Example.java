package acme.tests.chapter9.test34;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate clear = c -> c.equals("clear");
        System.out.println(clear.test("pink"));
    }
}