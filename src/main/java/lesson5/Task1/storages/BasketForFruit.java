package lesson5.Task1.storages;

import lesson5.Task1.fruits.Fruit;

/**
 * Корзина для фруктов
 */

public class BasketForFruit extends Storage {

    /**
     * Конструктор для корзины фруктов
     * @param fruits массив фруктов, который не может содержать больше 20 фруктов,
     *               а также их общий вес не должен превышать 5.000 кг.
     */
    public BasketForFruit(Fruit[] fruits) {
        super(fruits);
        if (getSumWeightOfFruits() > 5.000 || fruits.length > 20) {
            throw new IllegalArgumentException();
        }
    }
}
