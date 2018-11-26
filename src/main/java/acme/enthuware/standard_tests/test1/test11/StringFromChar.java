package acme.enthuware.standard_tests.test1.test11;

public class StringFromChar {
    public static void main(String[] args) {
        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd'};
        String newStr = null;
        for (char ch : myCharArr) {
            newStr = newStr + ch;
        }
        System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));
    }
}