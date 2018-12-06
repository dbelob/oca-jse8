package acme.enthuware.standard_tests.test7.test09;

class Test{
    public static void main(String[] args){
        for (int i = 0; i < 10; i++) System.out.print(i + " ");  //1
        for (int i = 10; i > 0; i--) System.out.print(i + " ");  //2
        int i = 20;                  //3
        System.out.print(i + " ");   //4
    }
}