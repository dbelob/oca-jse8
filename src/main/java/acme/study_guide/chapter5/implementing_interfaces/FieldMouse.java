package acme.study_guide.chapter5.implementing_interfaces;

public class FieldMouse implements CanBurrow {
    @Override
    public int getMaximumDepth() {
        return 10;
    }
}