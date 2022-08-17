package patterns.DecoratorPattern.Drinks;

public abstract class Drink {
    private double price;
    private String description;

    private String item;

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Drink(double price, String description, String item) {
        this.price = price;
        this.description = description;
        this.item = item;
    }

    public Drink() {
    }

    public abstract double getCost();

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
}
