package patterns.SingletonPattern.hungry.way1;

public class Singleton {
    private Singleton() {

    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
