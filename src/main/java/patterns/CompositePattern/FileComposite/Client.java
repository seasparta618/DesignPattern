package patterns.CompositePattern.FileComposite;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        MenuComponent menu1 = new Menu("Menu management", 2);
        menu1.add(new MenuItem("item1", 3));
        menu1.add(new MenuItem("item2", 3));
        menu1.add(new MenuItem("item3", 3));
        menu1.add(new MenuItem("item4", 3));
        menu1.add(new MenuItem("item5", 3));
        MenuComponent menu2 = new Menu("Privilege management", 2);
        menu2.add(new MenuItem("Privilege item1", 3));
        menu2.add(new MenuItem("Privilege item2", 3));
        MenuComponent menu3 = new Menu("Role management", 2);
        menu3.add(new MenuItem("add role item1", 3));
        menu3.add(new MenuItem("remove role item2", 3));
        MenuComponent mainMenuComponent = new Menu("System management", 1);
        mainMenuComponent.add(menu1);
        mainMenuComponent.add(menu2);
        mainMenuComponent.add(menu3);

        mainMenuComponent.print();

    }
}
