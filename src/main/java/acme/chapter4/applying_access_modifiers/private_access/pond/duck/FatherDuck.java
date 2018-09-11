package acme.chapter4.applying_access_modifiers.private_access.pond.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
        System.out.println(noise); // private access is ok
    }

    private void makeNoise() {
        quack(); // private access is ok
    }
}