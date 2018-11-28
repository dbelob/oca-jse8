package acme.enthuware.standard_tests.test2.test19;

public class Example {
    void crazyLoop() {
        int c = 0;
        JACK:
        JILL:
        while (c < 8) {
//            JILL:
            System.out.println(c);
            if (c > 3) break JILL;
            else c++;
        }
    }
}