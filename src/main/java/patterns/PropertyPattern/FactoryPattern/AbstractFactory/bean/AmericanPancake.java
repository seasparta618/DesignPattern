package patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean;

public class AmericanPancake extends Dessert {

    public AmericanPancake() {
        this.setDessertName("AmericanPancake");
    }

    @Override
    public void show() {
        System.out.println("This is American pancake");
    }
}
