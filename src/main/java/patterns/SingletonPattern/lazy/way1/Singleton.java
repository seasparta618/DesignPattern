package patterns.SingletonPattern.lazy.way1;

public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    synchronized public static Singleton getInstance() {
        if (instance == null) {
            System.out.println("Initialize member instance");
            // no instance initialized, initialize the member instance
            instance = new Singleton();
        }
        return instance;
    }
}
