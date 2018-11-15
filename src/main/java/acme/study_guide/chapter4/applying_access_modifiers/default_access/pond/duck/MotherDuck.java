package acme.study_guide.chapter4.applying_access_modifiers.default_access.pond.duck;

public class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.println(noise); // default access is ok
    }

    private void makeNoise() {
        quack(); // default access is ok
    }
}