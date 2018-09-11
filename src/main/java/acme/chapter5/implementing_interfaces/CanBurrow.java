package acme.chapter5.implementing_interfaces;

public abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2;

    public abstract int getMaximumDepth();
}