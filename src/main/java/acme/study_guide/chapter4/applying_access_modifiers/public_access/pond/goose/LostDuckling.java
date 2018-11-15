package acme.study_guide.chapter4.applying_access_modifiers.public_access.pond.goose;

import acme.study_guide.chapter4.applying_access_modifiers.public_access.pond.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.println("Thanks" + teacher.name); // allowed
    }
}