package acme.study_guide.chapter4.applying_access_modifiers.protected_access.pond.duck;

import acme.study_guide.chapter4.applying_access_modifiers.protected_access.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater(); // DOES NOT COMPILE
    }
}