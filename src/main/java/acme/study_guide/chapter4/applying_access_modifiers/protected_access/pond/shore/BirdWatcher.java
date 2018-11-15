package acme.study_guide.chapter4.applying_access_modifiers.protected_access.pond.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
}