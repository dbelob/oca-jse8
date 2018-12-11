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
// 5 and 20
// 6 and 515
// 6 and 20
// 6 and 615
// It will not compile.