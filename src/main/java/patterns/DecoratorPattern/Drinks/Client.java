package patterns.DecoratorPattern.Drinks;

import org.junit.Assert;
import org.junit.Test;

public class Client {
    @Test
    public void drink1() {
        Drink milkTea = new MilkTea();
        double totalPrice = milkTea.getPrice();
        System.out.println(milkTea.getDescription() + " with price:" + milkTea.getCost());
        milkTea = new BrownSugar(milkTea);
        System.out.println("Added->item " + milkTea.getItem() + " with item price " + milkTea.getPrice() + "\nis " + milkTea.getDescription() + " with price:" + milkTea.getCost());
        assert (totalPrice += milkTea.getPrice()) == milkTea.getCost();
        milkTea = new MilkFoam(milkTea);
        System.out.println("Added->item " + milkTea.getItem() + " with item price " + milkTea.getPrice() + "\nis " + milkTea.getDescription() + " with price:" + milkTea.getCost());
        assert (totalPrice += milkTea.getPrice()) == milkTea.getCost();

        milkTea = new Pudding(milkTea);
        System.out.println("Added->item " + milkTea.getItem() + " with item price " + milkTea.getPrice() + "\nis " + milkTea.getDescription() + " with price:" + milkTea.getCost());
        assert (totalPrice += milkTea.getPrice()) == milkTea.getCost();

    }

    @Test
    public void drink2() {
        Drink coffee = new Coffee();
        double totalPrice = coffee.getPrice();

        System.out.println(coffee.getDescription() + " with price:" + coffee.getCost());
        coffee = new BrownSugar(coffee);
        System.out.println("Added->item " + coffee.getItem() + " with item price " + coffee.getPrice() + "\nis " + coffee.getDescription() + " with price:" + coffee.getCost());
        assert (totalPrice += coffee.getPrice()) == coffee.getCost();

    }
}
