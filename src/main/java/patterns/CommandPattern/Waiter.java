package patterns.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands = new ArrayList<>();


    public Waiter setCommand(Command cmd) {
        commands.add(cmd);
        return this;
    }

    public void orderUp() {
        System.out.println("Waiter said: Chef, the order is coming");
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
