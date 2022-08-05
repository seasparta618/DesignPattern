package patterns.PropertyPattern.FactoryPattern.AbstractFactory.factory;

import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.AmericanCoffee;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.AmericanPancake;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Coffee;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Dessert;

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
