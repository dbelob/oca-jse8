package acme.enthuware.standard_tests.test4.test59;

class ScopeTest {
    static int x = 5;

    public static void main(String[] args) {
        int x = (x = 3) * 4;  // 1
        System.out.println(x);
    }
}