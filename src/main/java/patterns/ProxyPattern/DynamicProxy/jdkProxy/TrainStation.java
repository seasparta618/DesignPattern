package patterns.ProxyPattern.DynamicProxy.jdkProxy;

public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("Train station sells train ticket");
    }
}
