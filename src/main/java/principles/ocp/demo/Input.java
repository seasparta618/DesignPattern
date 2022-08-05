package principles.ocp.demo;

public class Input {

    private AbstractSkin skin;

    public AbstractSkin getSkin() {
        return skin;
    }

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        this.skin.display();
    }
}
