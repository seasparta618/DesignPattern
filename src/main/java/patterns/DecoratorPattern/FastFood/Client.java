package patterns.DecoratorPattern.FastFood;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        // I want to order 1 fried rice
        FastFood fastfood = new FriedRice();
        System.out.println(fastfood.getDescription() + " $" + fastfood.getCost());
    }

    @Test
    public void testAddEgg() {
        FastFood myFood = new FriedRice();

        myFood = new Egg(myFood);
        System.out.println(myFood.getDescription() + " $" + myFood.getCost());

        myFood = new Egg(myFood);
        System.out.println(myFood.getDescription() + " $" + myFood.getCost());

        myFood = new Bacon(myFood);
        System.out.println(myFood.getDescription() + " $" + myFood.getCost());

    }
}
