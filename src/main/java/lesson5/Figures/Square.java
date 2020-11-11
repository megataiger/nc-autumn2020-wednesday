package lesson5.Figures;

public class Square extends Figure implements Drawable {

    private double side;

    public Square(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Введены некорректные значения для " +
                    this.getClass().getName());
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return  4 * side;
    }

    public void draw() {
        System.out.println("Square drawn");
    }
}
