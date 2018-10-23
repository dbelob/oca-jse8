package acme.tests.chapter9.test47;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PrintNegative {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("-5");
        list.add("0");
        list.add("5");
        print(list, e -> e < 0);
    }

    public static void print(List<String> list, Predicate<Integer> p) {
        for (String num : list)
//            if (p.test(num))
            if (p.test(Integer.valueOf(num)))
                System.out.println(num);
    }
}