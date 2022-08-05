package patterns.PropertyPattern.FactoryPattern.AbstractFactory.factory;

import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Coffee;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Dessert;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.ItalianPudding;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.LatteCoffee;

public class ItalianDessertFactory implements IDessertFactory {
    @Override
    public Coffee produceCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert produceDessert() {
        return new ItalianPudding();
    }
}
