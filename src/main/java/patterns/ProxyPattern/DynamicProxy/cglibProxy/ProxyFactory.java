package patterns.ProxyPattern.DynamicProxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import patterns.ProxyPattern.StaticProxy.TrainStation;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private final TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(TrainStation.class);
        enhancer.setCallback(this);
        TrainStation trainStation = (TrainStation) enhancer.create();
        return trainStation;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("proxy point will charge some commission");
        Object invoke = method.invoke(trainStation, objects);
        return invoke;
    }
}
