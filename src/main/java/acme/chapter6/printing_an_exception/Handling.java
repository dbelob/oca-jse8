package acme.chapter6.printing_an_exception;

public class Handling {
    public static void main(String[] args) {
        try {
            hop();
        } catch (
                Exception e) {
            System.out.println(e);
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void hop() {
        throw new RuntimeException("cannot hop");
    }
}