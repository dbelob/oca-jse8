package acme.tests.chapter3.test42;

public class TestGame {
    public String runTest(boolean spinner, boolean roller) {
        if (spinner = roller) return "up";
        else return roller ? "down" : "middle";
    }

    public static final void main(String pieces[]) {
        final TestGame tester = new TestGame();
        System.out.println(tester.runTest(false, true));
    }
}