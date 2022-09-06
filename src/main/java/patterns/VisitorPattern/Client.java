package patterns.VisitorPattern;

import org.junit.Test;

public class Client {

    @Test
    public void test() {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());
        Person p = new Owner();
        home.action(p);
        p = new PetKeeper();
        home.action(p);
    }
}
