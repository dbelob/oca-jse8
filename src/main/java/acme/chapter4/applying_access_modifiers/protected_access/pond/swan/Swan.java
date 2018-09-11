package acme.chapter4.applying_access_modifiers.protected_access.pond.swan;

import acme.chapter4.applying_access_modifiers.protected_access.pond.shore.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater(); // package access to superclass
        System.out.println(text); // package access to superclass
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater(); // package access to superclass
        System.out.println(other.text);// package access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater(); // DOES NOT COMPILE
//        System.out.println(other.text); // DOES NOT COMPILE
    }
}