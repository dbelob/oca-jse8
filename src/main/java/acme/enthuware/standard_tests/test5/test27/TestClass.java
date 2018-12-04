package acme.enthuware.standard_tests.test5.test27;

public class TestClass{
    public static void main(String args[]){
        A[] a, a1;
        B[] b;
        a = new A[10]; a1  = a;
        b =  new B[20];
        a = b;  // 1
        b = (B[]) a;  // 2
        b = (B[]) a1; // 3
    }
}
class A { }
class B extends A { }
