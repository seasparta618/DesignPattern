package patterns.SingletonPattern.hungry.way1;

import org.junit.Test;

public class test {
    @Test
    public void test() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        assert singleton.hashCode() == singleton1.hashCode();
    }
}
