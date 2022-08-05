package patterns.FactoryPattern.AbstractFactory.factory;

import patterns.FactoryPattern.AbstractFactory.bean.AmericanPancake;
import patterns.FactoryPattern.AbstractFactory.bean.Dessert;
import patterns.FactoryPattern.AbstractFactory.bean.AmericanCoffee;
import patterns.FactoryPattern.AbstractFactory.bean.Coffee;

public class AmericanDessertFactory implements IDessertFactory{
    @Override
    public Coffee produceCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert produceDessert() {
        return new AmericanPancake();
    }
}
