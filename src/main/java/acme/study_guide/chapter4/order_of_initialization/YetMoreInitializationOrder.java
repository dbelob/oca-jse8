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
public class YetMoreInitializationOrder {
    // Number 1
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    // Number 5
    YetMoreInitializationOrder() {
        add(5);
    }

    // Number 2
    static {
        add(4);
    }

    // Number 3
    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }

    // Number 4
    {
        add(8);
    }

    // 2 4 6 8 5
    public static void main(String[] args) {
    }
}