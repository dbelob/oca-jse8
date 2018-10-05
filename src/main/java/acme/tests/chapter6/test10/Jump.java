package acme.tests.chapter6.test10;

public class Jump {
    private int rope = 1;
    protected boolean outside;
    public Jump() {
        this(4);    // p1
        outside = true;
    }
    public Jump(int rope) {
        this.rope = outside ? rope : rope+1;
    }
    public static void main(String[] bounce) {
        System.out.print(new Jump().rope);
    }
}