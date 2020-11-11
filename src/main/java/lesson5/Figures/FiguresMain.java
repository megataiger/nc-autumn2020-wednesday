package lesson5.Figures;

/**
 * Первое задание из лекции
 * Создать класс lesson5.Figures.Figure и унаследовать от него другие фигуры.
 * Реализовать функции расчёта плащди и периметра.
 * @author Ilya Nemolyaev
 * @version 1.0
 */

public class FiguresMain {
    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Rectangle(-1, 2);
        figures[1] = new Triangle(2, 2, 3);
        figures[2] = new Circle(0);
        figures[3] = new Square(2);

        double sum = 0;

        for (Figure f:
             figures) {
            sum += f.area();
        }

        System.out.println(sum);

        Drawable[] drawables = new Drawable[]{(Drawable) figures[1], (Drawable) figures[2]};

        for (Drawable dr:
             drawables) {
            dr.draw();
        }
    }
}