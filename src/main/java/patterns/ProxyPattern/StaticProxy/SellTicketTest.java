package patterns.ProxyPattern.StaticProxy;

import org.junit.Test;

public class SellTicketTest {
    @Test
    public void test() {
        ProxyPoint proxyPoint = new ProxyPoint();

        proxyPoint.sell();
    }
}
