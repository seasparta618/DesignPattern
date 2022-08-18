package patterns.StrategyPattern.SalesMan;

public class SalesMan {

    public void setPromotionStrategy(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    private PromotionStrategy promotionStrategy;

    public SalesMan(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void showPromotionPolicy() {
        this.promotionStrategy.show();
    }
}
