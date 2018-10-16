package acme.tests.chapter8.test17;

public class Boat {
    public int travel() throws Exception { return 4; }; // j1
    public static void main(String... distance) throws Exception{
        try {
            System.out.print(new Boat().travel());
        } catch (Exception e) { //(
            System.out.print(8);
        }   //)
    }
}