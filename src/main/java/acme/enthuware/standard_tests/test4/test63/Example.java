package acme.enthuware.standard_tests.test4.test63;

interface MyIface{};
class A {};
class B extends A implements MyIface{};
class C implements MyIface{};

public class Example {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        MyIface i = c;
//        c = (C) b;
    }
}