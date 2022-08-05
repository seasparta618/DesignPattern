package patterns.SingletonPattern.lazy.way3;

import org.junit.Test;
import patterns.SingletonPattern.lazy.way1.Singleton;

public class test {
    @Test
    public void test() {
        Singleton singleton = patterns.SingletonPattern.lazy.way1.Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        assert singleton == singleton1;
    }
}
