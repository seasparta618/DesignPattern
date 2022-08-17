package patterns.DecoratorPattern.FastFood;

public class FriedRice extends FastFood{

    public FriedRice() {
        super(10, "FriedRice");
    }

    @Override
    public double getCost() {
        return super.getPrice();
    }
}
