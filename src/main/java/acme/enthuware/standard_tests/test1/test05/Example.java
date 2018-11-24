package acme.enthuware.standard_tests.test1.test05;

public class Example {
    public static void main(String[] args) {
        String mStr = "123";
        long m1 = new Long(mStr);
        long m2 = Long.parseLong(mStr);
//        long m3 = (new Long()).parseLong(mStr);
        long m4 = Long.valueOf(mStr).longValue();
    }
}