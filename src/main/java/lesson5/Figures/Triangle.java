package lesson5.Figures;

public class Triangle extends Figure implements Drawable {

    private double sideA;

    private double sideB;

    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        if (sideA > 0 && sideB > 0 && sideC > 0) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            System.out.println("Введены некорректные значения для " +
                    this.getClass().getName());
        }
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA > 0) {
            this.sideA = sideA;
        }
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB > 0) {
            this.sideB = sideB;
        }
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC > 0) {
            this.sideC = sideC;
        }
    }

    @Override
    public double area() {
        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt((semiPerimeter *
                (semiPerimeter - sideA) *
                (semiPerimeter - sideB) *
                (semiPerimeter - sideC)));
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public void draw() {
        System.out.println("Triangle drawn");
    }
}
