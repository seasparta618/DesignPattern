package patterns.FactoryPattern.AbstractFactory.bean;

public abstract class Dessert {
    public String getDessertName() {
        return dessertName;
    }

    public void setDessertName(String dessertName) {
        this.dessertName = dessertName;
    }

    private String dessertName;

    public abstract void show();
}
