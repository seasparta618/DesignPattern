package patterns.DecoratorPattern.demo1;

public abstract class Garnish extends FastFood {

    private FastFood fastFood;

    public Garnish(FastFood fastFood,double price, String description) {
        super(price, description);
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
