package acme.chapter4.applying_access_modifiers.protected_access.pond.goose;

import acme.chapter4.applying_access_modifiers.protected_access.pond.shore.Bird;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
}