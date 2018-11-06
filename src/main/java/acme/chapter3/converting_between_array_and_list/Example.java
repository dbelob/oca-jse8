package acme.chapter3.converting_between_array_and_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        // from ArrayList to array
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2

        // from array to ArrayList
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        /* List<String> */ list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test");    // [hawk, test]
        array[0] = "new";       // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1); // throws UnsupportedOperation Exception
    }
}