package patterns.ProxyPattern.StaticProxy;

public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("Train station sells train ticket");
    }
}
