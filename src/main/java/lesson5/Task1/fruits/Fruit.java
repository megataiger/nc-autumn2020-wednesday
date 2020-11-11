package lesson5.Task1.fruits;

import lesson5.Task1.Edible;

/**
 * Абстрактный класс фрукт
 */

public abstract class Fruit implements Edible {

    private String name;

    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
