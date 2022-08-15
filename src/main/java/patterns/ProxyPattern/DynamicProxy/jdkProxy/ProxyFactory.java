package patterns.ProxyPattern.DynamicProxy.jdkProxy;

import patterns.ProxyPattern.StaticProxy.SellTickets;
import patterns.ProxyPattern.StaticProxy.TrainStation;

import java.lang.reflect.Proxy;

public class ProxyFactory {

    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        return (SellTickets) Proxy.newProxyInstance(trainStation.getClass().getClassLoader(), trainStation.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("proxy point will charge some commission");
                    Object invoke = method.invoke(trainStation, args);
                    return invoke;
                });
    }

}
