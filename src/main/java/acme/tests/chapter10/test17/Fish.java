package acme.tests.chapter10.test17;

class Fish {
    Fish getFish() throws BubbleException {
        throw new RuntimeException("fish!");
    }
}