package patterns.DecoratorPattern.Drinks;

public class MilkFoam extends Ingredients {

    public MilkFoam(Drink drink) {
        super(1.0, "MilkFoam", drink);
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
