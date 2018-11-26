package acme.enthuware.standard_tests.test1.test67;

public class EqualTest {
    public static void main(String args[]) {
        Integer i = new Integer(1);
        Long m = new Long(1);
        if (i.equals(m)) System.out.println("equal");   // 1
        else System.out.println("not equal");
    }
}