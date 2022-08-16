package patterns.AdaptorPattern.demo.square;

public class SquarePeg {
    private double width;

    public SquarePeg() {

    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSquare() {
        return Math.pow(width, 2);
    }
}
