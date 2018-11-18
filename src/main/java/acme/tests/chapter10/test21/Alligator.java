package acme.tests.chapter10.test21;

public class Alligator {
    static int teeth;
    double scaleToughness;
    public Alligator() {
        teeth++;
    }
    public void snap(int teeth) {
        System.out.print(teeth+" ");
        teeth--;
    }
    public static void main(String[] unused) {
        new Alligator().snap(teeth);
        new Alligator().snap(teeth);
    }
}