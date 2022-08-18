package patterns.StrategyPattern.SalesMan;

public class PromotionStrategyB implements PromotionStrategy {
    @Override
    public void show() {
        System.out.println("buy 1 get 2nd 50% off");
    }
}
