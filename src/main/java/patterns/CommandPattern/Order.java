package patterns.CommandPattern;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int tableNumber;
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public Order addFood(String name, int num) {
        this.foodDir.put(name, num);
        return this;
    }
}
