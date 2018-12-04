package acme.enthuware.standard_tests.test2.test56;

// Consider the following code:
class A {
    A() {
        print();
    }

    void print() {
        System.out.println("A");
    }
}
class B extends A {
    int i = 4;

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    void print() {
        System.out.println(i);
    }
}
// What will be the output when class B is run ?