package patterns.FactoryPattern.FactoryMethod;

public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        Coffee coffee = new AmericanCoffee();
        coffee.setCoffeeName("American Coffee");
        return coffee;
    }
}
