package patterns.DecoratorPattern.FastFood;

public class FriedNoodle extends FastFood {

    public FriedNoodle() {
        super(8, "FriedNoodle");
    }

    @Override
    public double getCost() {
        return super.getPrice();
    }
}
