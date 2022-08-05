package patterns.SingletonPattern.hungry.way2;

import org.junit.Test;

public class test {
    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        assert singleton == singleton1;
    }
}
