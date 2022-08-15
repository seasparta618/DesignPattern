package patterns.ProxyPattern.DynamicProxy.cglibProxy;

import org.junit.Test;
import patterns.ProxyPattern.StaticProxy.TrainStation;

public class CglibProxyTest {
    @Test
    public void test() {
        ProxyFactory proxyFactory = new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
    }
}
