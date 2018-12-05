package acme.enthuware.standard_tests.test6.test25;

public class Example {
    public static void main(String[] args) {
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
}