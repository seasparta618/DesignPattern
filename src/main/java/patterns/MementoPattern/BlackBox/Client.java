package patterns.MementoPattern.BlackBox;

import org.junit.Test;

public class Client {
    @Test
    public void test(){
        System.out.println("----------------before fighting----------------");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();
        RoleStateCareTaker roleStateCareTaker = new RoleStateCareTaker();
        roleStateCareTaker.setMemento(gameRole.saveState());

        System.out.println("----------------after fighting----------------");
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("----------------role died, recover to the state before fighting----------------");
        gameRole.recoverState(roleStateCareTaker.getMemento());
        gameRole.stateDisplay();
    }
}
