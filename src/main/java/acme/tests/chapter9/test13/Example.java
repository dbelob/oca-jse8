package acme.tests.chapter9.test13;

import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        Predicate<StringBuilder> p = (StringBuilder b) -> {return true;};
//        Predicate<StringBuilder> p1 = () -> {return true;};
//        Predicate<StringBuilder> p2 = (StringBuilder b) {return true;};
//        Predicate<StringBuilder> p3 = (StringBuilder b) -> return true;
        Predicate<StringBuilder> p4 = (StringBuilder b) -> true;
    }
}