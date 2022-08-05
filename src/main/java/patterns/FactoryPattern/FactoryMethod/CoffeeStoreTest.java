package patterns.FactoryPattern.FactoryMethod;

import org.junit.Test;

public class CoffeeStoreTest {

    @Test
    public void test() {
        CoffeeStore coffeeStore = new CoffeeStore();
        AmericanCoffeeFactory americanCoffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setFactory(americanCoffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getCoffeeName());
    }
}
