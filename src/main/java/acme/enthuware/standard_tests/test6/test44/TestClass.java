package acme.enthuware.standard_tests.test6.test44;

// What will the following code print when run?
public class TestClass{
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
    }
}
// You had to select 1 option:
//
// A. 5 and 20
// B. 6 and 515
// C. 6 and 20
// D. 6 and 615
// E. It will not compile.
