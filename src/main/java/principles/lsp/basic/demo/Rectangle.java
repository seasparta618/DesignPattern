package principles.lsp.basic.demo;

/**
 * classic case for lsp, square is not a rectangle
 * http://stg-tud.github.io/sedc/Lecture/ws13-14/3.3-LSP.html#mode=document
 */
public class Rectangle {
    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
