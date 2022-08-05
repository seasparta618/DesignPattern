package patterns.SingletonPattern.lazy.way2;

public class Singleton {
    private Singleton() {

    }

    volatile private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized ((Singleton.class)) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
