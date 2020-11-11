package lesson5.Task1.storages;

import lesson5.Task1.fruits.Fruit;

/**
 * Хранилище для фруктов
 */

public class Storage {
    private final Fruit[] fruits;

    /**
     * Конструктор хранилища для фруктов
     * @param fruits массив фруктов
     */
    public Storage(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public Fruit[] getFruits() {
        return fruits;
    }

    protected double getSumWeightOfFruits() {
        double sumWeight = 0;
        for (Fruit fruit:
             fruits) {
            sumWeight += fruit.getWeight();
        }

        return sumWeight;
    }
}
