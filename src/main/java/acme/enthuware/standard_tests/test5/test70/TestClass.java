package acme.enthuware.standard_tests.test5.test70;

// Consider the following code:
public class TestClass{
    public void method(Object o){
        System.out.println("Object Version");
    }
    public void method(java.io.FileNotFoundException s){
        System.out.println("java.io.FileNotFoundException Version");
    }
    public void method(java.io.IOException s){
        System.out.println("IOException Version");
    }
    public static void main(String args[]){
        TestClass tc = new TestClass();
        tc.method(null);
    }
}
// What would be the output when the above program is compiled and run?
// (Assume that FileNotFoundException is a subclass of IOException, which in turn is a subclass of Exception)
// You had to select 1 option:
//
// A. It will print Object Version
// B. It will print java.io.IOException Version
// C. It will print java.io.FileNotFoundException Version
// D. It will not compile.
// E. It will throw an exception at runtime.
