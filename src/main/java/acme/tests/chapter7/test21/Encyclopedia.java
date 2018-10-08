package acme.tests.chapter7.test21;

public class Encyclopedia extends Book {
    public static String material = "cellulose";

    public Encyclopedia() {
        super();
    }

    public String getMaterial() {
        return super.material;
    }

    public static void main(String[] pages) {
        System.out.print(new Encyclopedia().getMaterial());
    }
}