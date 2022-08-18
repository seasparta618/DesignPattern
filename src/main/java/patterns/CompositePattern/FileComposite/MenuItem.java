package patterns.CompositePattern.FileComposite;

public class MenuItem extends MenuComponent {
    @Override
    public void print() {
        System.out.println(this.name);
    }

    public MenuItem(String name, int level) {
        this.level = level;
        this.name = name;
    }
}
