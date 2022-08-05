package patterns.SingletonPattern.lazy.way3;

import java.io.Serial;
import java.io.Serializable;

public class Singleton implements Serializable {
    private Singleton() {

    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    @Serial
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
