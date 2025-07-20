public class BlockOrder {
    // Static block: runs once when class is loaded
    static {
        System.out.println("Static block executed");
    }

    // Instance initializer block: runs before constructor
    {
        System.out.println("Initializer block executed");
    }

    // Constructor
    BlockOrder() {
        System.out.println("Constructor executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method starts");
        BlockOrder obj1 = new BlockOrder();
        BlockOrder obj2 = new BlockOrder();
    }
}
