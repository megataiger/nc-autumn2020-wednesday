package lesson5.Figures;

public class Circle extends Figure implements Drawable {

    private double radius;

    private static final double pi = 3.14;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Введены некорректные значения для " +
                    this.getClass().getName());
        }
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    public void draw() {
        System.out.println("Circle drawn");
    }
}
