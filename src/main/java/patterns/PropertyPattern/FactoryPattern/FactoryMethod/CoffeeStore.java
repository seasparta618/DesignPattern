package patterns.PropertyPattern.FactoryPattern.FactoryMethod;

public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addCoffeePowder(0.366);
        return coffee;
    }
}
