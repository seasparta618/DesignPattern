package patterns.DecoratorPattern.Drinks;

/**
 * This is the coffee, which is a kind of drink
 */
public class Coffee extends Drink {

    public Coffee() {
        super(8, "Coffee", "Coffee");
    }

    @Override
    public double getCost() {
        return this.getPrice();
    }
}
