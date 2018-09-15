package acme.assessment.test16;

public interface Animal {
    public default String getName() {
        return null;
    }
}