package patterns.StrategyPattern.SalesMan;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        SalesMan salesMan = new SalesMan(new PromotionStrategyA());
        salesMan.showPromotionPolicy();

        salesMan.setPromotionStrategy(new PromotionStrategyB());
        salesMan.showPromotionPolicy();

        salesMan.setPromotionStrategy(new PromotionStrategyC());
        salesMan.showPromotionPolicy();
    }

}
