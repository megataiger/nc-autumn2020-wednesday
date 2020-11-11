package lesson5.Task1;

import lesson5.Task1.fruits.Banana;
import lesson5.Task1.fruits.Fruit;
import lesson5.Task1.fruits.Orange;
import lesson5.Task1.fruits.Pear;
import lesson5.Task1.storages.BasketForFruit;
import lesson5.Task1.storages.PlasticContainer;

public class TaskMain {
    public static void main(String[] args) {

        //Создание массива фруктов
        Fruit[] fruits = new Fruit[19];

        //Заполнение массива конкретными фруктами
        for (int i = 0; i < 19; i++) {
            if (i == 0) {
                fruits[i] = new Orange();
            } else if (fruits[i-1].getClass() == Orange.class) {
                fruits[i] = new Banana();
            } else if (fruits[i-1].getClass() == Banana.class) {
                fruits[i] = new Pear();
            } else {
                fruits[i] = new Orange();
            }
        }

        //Собираем фрукты в корзину
        BasketForFruit basketForFruit = new BasketForFruit(fruits);

        //Отдаём фрукты из корзины человеку на завтрак/обед/ужин
        //Получаем информацию о съеденных калориях
        new Human().eat(basketForFruit.getFruits());

        //Пытаемся переложить наши фрукты в контейнер
        PlasticContainer plasticContainer = new PlasticContainer(fruits);
    }
}
