package acme.enthuware.standard_tests.test2.test58;

class TestClass{
    public static void main(String args[]){
        int i = 0;
        loop :         // 1
        {
            System.out.println("Loop Lable line");
            try{
                for (  ;  true ;  i++ ){
                    if( i >5) break loop;       // 2
                }
            }
            catch(Exception e){
                System.out.println("Exception in loop.");
            }
            finally{
                System.out.println("In Finally");      // 3
            }
        }
    }
}