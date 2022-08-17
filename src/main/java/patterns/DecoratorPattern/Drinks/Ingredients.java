package patterns.DecoratorPattern.Drinks;

public abstract class Ingredients extends Drink {

    private Drink drink;

    public Ingredients(double price, String description, Drink drink) {
        super(price, description, description);
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
