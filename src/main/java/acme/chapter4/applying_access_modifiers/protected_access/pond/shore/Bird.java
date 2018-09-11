package acme.chapter4.applying_access_modifiers.protected_access.pond.shore;

public class Bird {
    protected String text = "floating"; // protected access

    protected void floatInWater() { // protected access
        System.out.println(text);
    }
}