package acme.enthuware.standard_tests.test6.test49;

class A {
    public int getCode(){ return 2;}
}

class AA extends A {
    public void doStuff() {
    }
}

public class Example {
    public static void main(String[] args) {
        A a = null;
        AA aa = null;

        a = (AA)aa;
    }
}