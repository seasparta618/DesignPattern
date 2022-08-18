package patterns.CommandPattern;

import java.util.Map;

public class OrderCommand implements Command {
    private Chef receiver;

    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println("Table " + order.getTableNumber() + "'s order is preparing");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (Map.Entry<String, Integer> foodEntry : foodDir.entrySet()) {
            receiver.makeFood(foodEntry.getKey(), foodEntry.getValue());
        }
        System.out.println("Table " + order.getTableNumber() + "'s order are all cooked");
    }
}
