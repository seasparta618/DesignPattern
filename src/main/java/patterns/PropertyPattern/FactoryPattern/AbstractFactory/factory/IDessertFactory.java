package patterns.PropertyPattern.FactoryPattern.AbstractFactory.factory;

import patterns.FactoryPattern.AbstractFactory.bean.*;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Coffee;
import patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean.Dessert;

public interface IDessertFactory {
    Coffee produceCoffee();

    Dessert produceDessert();
}
