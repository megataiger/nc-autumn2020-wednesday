package lesson5.Task1.fruits;

//Банан

public class Banana extends Fruit {

    private final int calorie = 200;

    public Banana() {
        setName("banana");
        setWeight(0.3);
    }

    public int eat() {
        return calorie;
    }
}
