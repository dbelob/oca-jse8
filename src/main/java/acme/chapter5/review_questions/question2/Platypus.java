package acme.chapter5.review_questions.question2;

class Mammal {
    public Mammal(int age) {
        System.out.print("Mammal");
    }
}

public class Platypus extends Mammal {
    public Platypus() {
        super(1);   // added line
        System.out.print("Platypus");
    }

    public static void main(String[] args) {
        new Mammal(5);
    }
}