public class DoubleTest {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.check();
    }

}

class Singleton {

    public static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {

            synchronized (Singleton.class) {

                if (instance == null) {
                    return new Singleton();
                }
            }

        }
        return instance;
    }

    public void check() {
        System.out.println("one instance");
    }

}