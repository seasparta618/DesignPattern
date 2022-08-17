package patterns.DecoratorPattern.Drinks;


/**
 * This is the bubble tea, which is a kind of drink
 */
public class MilkTea extends Drink {

    public MilkTea() {
        super(7.5, "MilkTea", "MilkTea");
    }

    /**
     * the price of the milk tea should be 7.5, which is from the constructor
     *
     * @return
     */
    @Override
    public double getCost() {
        return this.getPrice();
    }
}
