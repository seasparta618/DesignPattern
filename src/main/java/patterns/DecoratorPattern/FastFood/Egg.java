package patterns.DecoratorPattern.FastFood;

public class Egg extends Garnish {

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "Egg");
    }

    @Override
    public double getCost() {
        return super.getPrice() + getFastFood().getCost();
    }

    public String getDescription() {
        return super.getDescription() + getFastFood().getDescription();
    }
}
