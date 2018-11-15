package acme.study_guide.chapter4.applying_access_modifiers.default_access.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        duck.quack(); // default access
        System.out.println(duck.noise); // default access
    }
}