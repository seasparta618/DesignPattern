package patterns.FactoryPattern.AbstractFactory.factory;

import patterns.FactoryPattern.AbstractFactory.bean.Coffee;
import patterns.FactoryPattern.AbstractFactory.bean.Dessert;

public interface IDessertFactory {
    Coffee produceCoffee();

    Dessert produceDessert();
}
