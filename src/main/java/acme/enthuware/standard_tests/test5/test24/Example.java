package acme.enthuware.standard_tests.test5.test24;

// Which of the following statements will evaluate to true?
// You had to select 1 option:
public class Example {
    public static void main(String[] args) {
        System.out.println("String".replace('g', 'G') == "String".replace('g', 'G'));
        System.out.println("String".replace('g', 'g') == new String("String").replace('g', 'g'));
        System.out.println("String".replace('g', 'G') == "StrinG");
        System.out.println("String".replace('g', 'g') == "String");
        System.out.println("String".replace("g", "g") == "String");
    }
}