package patterns.FactoryPattern.AbstractFactory.bean;

public abstract class Coffee {
    private String coffeeName;
    private double coffeePowderPercentage;

    protected Coffee() {
    }

    public void addCoffeePowder(double coffeePowderPercentage) {
        this.coffeePowderPercentage = coffeePowderPercentage;
        System.out.println("Added coffee powder upto " + coffeePowderPercentage * 100 + " percent");
    }

    public double checkCoffeePowderPercentage() {
        return this.coffeePowderPercentage;
    }


    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }
}
