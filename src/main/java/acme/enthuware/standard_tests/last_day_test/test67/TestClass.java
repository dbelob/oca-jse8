package acme.enthuware.standard_tests.last_day_test.test67;

// For what command line arguments will the following program print true?
class TestClass{

    public static void main(String[] args){
        Integer i = Integer.parseInt(args[0]);
        Integer j = i;
        i--;
        i++;
        System.out.println((i==j));

    }
}
// You had to select 3 options:
// 0
// -1
// 127
// -256
// 256
// For all the values between 0 and 255 (both included).