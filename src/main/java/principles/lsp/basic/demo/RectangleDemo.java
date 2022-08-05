package principles.lsp.basic.demo;

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLengthAndWidth(rectangle);

        // the following code will keep running until there is an overflow
        // this could tell, the normal rectangle could fit the resize(Rectangle) method, but square cannot
        // so the inheritance between square and rectangle violates the lsp, they are not inheritance relation
        // lsp: objects of a superclass should be replaceable with objects of its subclasses without breaking the application
        // thus we know, square is not rectangle
        Rectangle square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println(rectangle.getLength() + "," + rectangle.getWidth());
    }
}
