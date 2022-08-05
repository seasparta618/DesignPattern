package patterns.SingletonPattern.enum_way;

import org.junit.Test;

public class test {
    @Test
    public void test() {
        Singleton singleton = Singleton.INSTANCE;
        Singleton singleton1 = Singleton.INSTANCE;
        assert singleton == singleton1;
    }
}
