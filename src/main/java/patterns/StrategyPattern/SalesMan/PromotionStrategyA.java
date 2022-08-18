package patterns.StrategyPattern.SalesMan;

public class PromotionStrategyA implements PromotionStrategy {
    @Override
    public void show() {
        System.out.println("buy 1 get 1");
    }
}
