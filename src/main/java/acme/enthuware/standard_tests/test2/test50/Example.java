package acme.enthuware.standard_tests.test2.test50;

public class Example {
    public void method1(int i){
        int j = (i*30 - 2)/100;

        POINT1 : for(;j<10; j++){
            boolean flag  = false;
            while(!flag){
                if(Math.random()>0.5) break POINT1;
            }
        }
        POINT2: while(j>0){
            System.out.println(j--);
//            if(j == 4) break POINT1;
            if(j == 4) break POINT2;
        }
    }
}