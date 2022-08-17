package patterns.DecoratorPattern.Drinks;

public class BrownSugar extends Ingredients {

    public BrownSugar(Drink drink) {
        super(0.5, "BrownSugar", drink);
    }

    @Override
    public double getCost() {
        return super.getPrice() + this.getDrink().getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-" + this.getDrink().getDescription();
    }
}
