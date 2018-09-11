package acme.chapter5.implementing_interfaces;

public class FieldMouse implements CanBurrow {
    @Override
    public int getMaximumDepth() {
        return 10;
    }
}