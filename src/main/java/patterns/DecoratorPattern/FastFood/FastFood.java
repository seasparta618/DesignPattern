package patterns.DecoratorPattern.FastFood;

public abstract class FastFood {

    private double price;
    private String description;

    public FastFood() {
    }

    public FastFood(double price, String description) {
        this.price = price;
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getCost();
}
