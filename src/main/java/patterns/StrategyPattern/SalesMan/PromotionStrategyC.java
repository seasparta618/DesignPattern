package patterns.StrategyPattern.SalesMan;

public class PromotionStrategyC implements PromotionStrategy {
    @Override
    public void show() {
        System.out.println("buy 2 get 1");
    }
}
