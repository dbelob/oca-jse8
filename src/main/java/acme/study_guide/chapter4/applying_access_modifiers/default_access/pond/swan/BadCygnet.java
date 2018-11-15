package acme.study_guide.chapter4.applying_access_modifiers.default_access.pond.swan;

import acme.study_guide.chapter4.applying_access_modifiers.default_access.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
//        duck.quack(); // DOES NOT COMPILE
//        System.out.println(duck.noise); // DOES NOT COMPILE
    }
}