package acme.study_guide.chapter4.applying_access_modifiers.private_access.pond.duck;

public class BadDuckling {
    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}