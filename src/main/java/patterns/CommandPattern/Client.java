package patterns.CommandPattern;

import org.junit.Test;

import java.nio.file.Watchable;

public class Client {

    @Test
    public void test() {
        Order order1 = new Order();
        order1.setTableNumber(1);
        order1.addFood("Fries", 3).addFood("Fried fish", 1).addFood("Hamburger", 1)
                .addFood("Coke", 1).addFood("BBQ sauce", 2);

        Order order2 = new Order();
        order2.setTableNumber(2);
        order2.addFood("Pizza", 5).addFood("7up", 1);

        Chef receiver = new Chef();
        Command cmd1 = new OrderCommand(receiver, order1);
        Command cmd2 = new OrderCommand(receiver, order2);

        Waiter invoke = new Waiter();
        invoke.setCommand(cmd1).setCommand(cmd2);
        invoke.orderUp();
    }
}
