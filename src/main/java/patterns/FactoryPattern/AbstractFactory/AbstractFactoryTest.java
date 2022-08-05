package patterns.FactoryPattern.AbstractFactory;

import org.junit.Test;
import patterns.FactoryPattern.AbstractFactory.factory.IDessertFactory;
import patterns.FactoryPattern.AbstractFactory.factory.ItalianDessertFactory;

public class AbstractFactoryTest {

    @Test
    public void test() {
        IDessertFactory factory = new ItalianDessertFactory();
        System.out.println(factory.produceCoffee().getCoffeeName());
        factory.produceDessert().show();
    }
}
