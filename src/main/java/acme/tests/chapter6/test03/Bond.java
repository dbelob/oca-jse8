package acme.tests.chapter6.test03;

public class Bond {
    private static int price = 5;

    public boolean sell() {
        if (price < 10) {
            price++;
            return true;
        } else if (price >= 10) {
            return false;
        }

        return true; // is added
    }

    public static void main(String[] cash) {
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        System.out.print(price);
    }
}