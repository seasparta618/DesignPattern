package patterns.PropertyPattern.FactoryPattern.AbstractFactory.bean;

public class ItalianPudding extends Dessert {
    public ItalianPudding() {
        this.setDessertName("ItalianPudding");
    }

    @Override
    public void show() {
        System.out.println("This is Italian pudding");
    }
}
