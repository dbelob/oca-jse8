package acme.enthuware.standard_tests.test2.test14;

// Which of the following code snippets will compile without any errors?
// (Assume that the statement int x = 0; exists prior to the statements below.)
public class Example {
    public static void main(String[] args) {
        int x = 0;

//        while (false) {
//            x = 3;
//        }

        if (false) {
            x = 3;
        }

        do {
            x = 3;
        } while (false);

        for (int i = 0; i < 0; i++)
            x = 3;

//        for (int i = 0; false; i++)
//            x = 3;
    }
}