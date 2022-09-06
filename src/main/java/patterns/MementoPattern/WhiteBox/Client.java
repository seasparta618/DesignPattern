package patterns.MementoPattern.WhiteBox;

import org.junit.Test;

public class Client {
    @Test
    public void test() {
        System.out.println("----------------before fighting----------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("----------------after fighting----------------");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("----------------role died, recover to the state before fighting----------------");
        gameRole.recoverState(roleStateCareTaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
