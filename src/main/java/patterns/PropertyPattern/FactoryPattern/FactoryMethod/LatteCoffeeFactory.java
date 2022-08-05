package patterns.PropertyPattern.FactoryPattern.FactoryMethod;

public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        LatteCoffee latteCoffee = new LatteCoffee();
        latteCoffee.setCoffeeName("Latte Coffee");
        return latteCoffee;
    }
}
