package patterns.ProxyPattern.DynamicProxy.jdkProxy;

import org.junit.Test;
import patterns.ProxyPattern.StaticProxy.SellTickets;

public class DynamicProxyTest {
    @Test
    public void test() {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();

        System.out.println(proxyObject.getClass());
    }
}
