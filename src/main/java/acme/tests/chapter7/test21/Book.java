package acme.tests.chapter7.test21;

abstract class Book {
    protected static String material = "papyrus";

    public Book() {
    }

    public Book(String material) {
        this.material = material;
    }
}