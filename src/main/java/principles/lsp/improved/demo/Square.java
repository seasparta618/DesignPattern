package principles.lsp.improved.demo;

public class Square implements Quadrilateral {

    private double side;

    @Override
    public double getLength() {
        return this.side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }
}
