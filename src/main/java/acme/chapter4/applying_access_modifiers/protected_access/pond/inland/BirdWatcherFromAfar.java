package acme.chapter4.applying_access_modifiers.protected_access.pond.inland;

import acme.chapter4.applying_access_modifiers.protected_access.pond.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater(); // DOES NOT COMPILE
//        System.out.println(bird.text); // DOES NOT COMPILE
    }
}