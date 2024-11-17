public class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton instance;

    // Step 2: Make the constructor private to prevent instantiation
    private Singleton() {
        // Private constructor
    }

    // Step 3: Provide a public static method to get the instance
    public static Singleton getInstance() {
        // Create the instance if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method
    public void displayMessage() {
        System.out.println("Hello from Singleton!");
    }
}

 class Demo {
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();
    }
}
