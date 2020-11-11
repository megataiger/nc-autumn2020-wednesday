package lesson5.Figures;

public class Rectangle extends Figure implements Drawable {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        if (length > 0 && width > 0) {
            this.length = length;
            this.width = width;
        } else {
            System.out.println("Введены некорректные значения для " +
                    this.getClass().getName());
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2*(length + width);
    }

    public void draw() {
        System.out.println("Rectangle drawn");
    }
}
