package patterns.DecoratorPattern.Drinks;

public class Pudding extends Ingredients {
    public Pudding(Drink drink) {
        super(1.5, "Pudding", drink);
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
