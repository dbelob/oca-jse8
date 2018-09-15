package acme.assessment.test03;

public class Cougar extends Puma {
    public static void main(String[] args) {
        Puma puma = new /* Puma() */ Cougar();
        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 2;
    }
}