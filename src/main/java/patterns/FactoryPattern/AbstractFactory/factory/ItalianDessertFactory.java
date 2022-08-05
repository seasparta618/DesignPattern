package patterns.FactoryPattern.AbstractFactory.factory;

import patterns.FactoryPattern.AbstractFactory.bean.Dessert;
import patterns.FactoryPattern.AbstractFactory.bean.ItalianPudding;
import patterns.FactoryPattern.AbstractFactory.bean.Coffee;
import patterns.FactoryPattern.AbstractFactory.bean.LatteCoffee;

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
