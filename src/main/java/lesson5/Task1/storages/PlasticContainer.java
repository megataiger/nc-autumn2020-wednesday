package lesson5.Task1.storages;

import lesson5.Task1.fruits.Fruit;

/**
 * Пластиковый контейнер для фруктов
 */

public class PlasticContainer extends Storage {

    /**
     * Конструктор для пластикового контейнера
     * @param fruits массив фруктов, который не может содержать больше 5 фруктов,
     *               а также их общий вес не должен превышать 1.000 кг.
     */
    public PlasticContainer(Fruit[] fruits) {
        super(fruits);
        if (getSumWeightOfFruits() > 1.000 || fruits.length > 5) {
            throw new IllegalArgumentException();
        }
    }
}
