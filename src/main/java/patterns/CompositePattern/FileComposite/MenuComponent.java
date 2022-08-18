package patterns.CompositePattern.FileComposite;

import java.awt.*;

public abstract class MenuComponent {
    // menu component name
    protected String name;
    // menu component depth
    protected int level;

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return this.name;
    }

    public abstract void print();
}
