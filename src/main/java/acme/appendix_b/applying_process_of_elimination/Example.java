package acme.appendix_b.applying_process_of_elimination;

public class Example {
    // Less than,5
    public static void main(String[] args) {
        int x = 0;
        while (++x < 5) {
            x += 1;
        }
        String message = x > 5 ? "Greater than" : "Less Than";
        System.out.println(message + "," + x);
    }
}