package patterns.ProxyPattern.StaticProxy;

public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("Proxy point will charge some commission");
        trainStation.sell();
    }
}
