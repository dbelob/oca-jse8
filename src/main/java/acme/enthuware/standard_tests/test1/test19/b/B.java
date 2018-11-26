package acme.enthuware.standard_tests.test1.test19.b;

import acme.enthuware.standard_tests.test1.test19.a.*;

public class B extends A {
    B() {
    }

    public void print() {
        System.out.println("B");
    }

    public static void main(String[] args) {
        new B();
    }
}