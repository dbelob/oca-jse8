package acme.enthuware.standard_tests.test1.test13.testPackage;
import acme.enthuware.standard_tests.test1.test13.other.*;

class Test{
    public static void main(String[] args){
        String hello = "Hello", lo = "lo";
        System.out.print((acme.enthuware.standard_tests.test1.test13.testPackage.Other.hello == hello) + " ");    //line 1
        System.out.print((acme.enthuware.standard_tests.test1.test13.other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
        System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
        System.out.println(hello == ("Hel"+lo).intern());          //line 5
    }
}