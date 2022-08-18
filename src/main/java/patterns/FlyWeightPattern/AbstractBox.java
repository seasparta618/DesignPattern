package patterns.FlyWeightPattern;

public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color) {
        System.out.println("box shape: " + getShape() + ", color: " + color);
    }

}
