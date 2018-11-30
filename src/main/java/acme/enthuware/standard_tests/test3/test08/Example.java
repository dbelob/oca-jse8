package acme.enthuware.standard_tests.test3.test08;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List s1 = new ArrayList();
        try {
            while (true) {
                s1.add("sdfa");
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        System.out.println(s1.size());
    }
}