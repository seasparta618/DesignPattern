package patterns.DecoratorPattern.FastFood;

public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2.5, "Bacon");
    }

    @Override
    public double getCost() {
        return super.getPrice() + getFastFood().getCost();
    }

    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
}
