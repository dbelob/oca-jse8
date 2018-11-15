package acme.study_guide.chapter4.order_of_initialization;

/**
 * Check of initialization order:
 * <ul>
 * <li>If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say “no superclass” and go on to the next rule.)</li>
 * <li>Static variable declarations and static initializers in the order they appear in the file.</li>
 * <li>Instance variable declarations and instance initializers in the order they appear in the file.</li>
 * <li>The constructor.</li>
 * <ul>
 */
public class InitializationOrder {
    private String name = "Torchie";

    {
        // Number 3
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        // Number 1
        System.out.println(COUNT);
    }

    {
        // Number 4
        COUNT++;
        System.out.println(COUNT);
    }

    public InitializationOrder() {
        // Number 5
        System.out.println("constructor");
    }

    // 0
    // read to construct
    // Torchie
    // 1
    // constructor
    public static void main(String[] args) {
        // Number 2
        System.out.println("read to construct");
        new InitializationOrder();
    }
}