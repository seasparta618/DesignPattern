package patterns.PropertyPattern.FactoryPattern.AbstractFactory;

import org.junit.Test;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.factory.IDessertFactory;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.factory.ItalianDessertFactory;

public class AbstractFactoryTest {

    @Test
    public void test() {
        IDessertFactory factory = new ItalianDessertFactory();
        System.out.println(factory.produceCoffee().getCoffeeName());
        factory.produceDessert().show();
    }
}
