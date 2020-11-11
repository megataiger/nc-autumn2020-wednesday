package lesson5.Task1.fruits;

//Груша

public class Pear extends Fruit {

    private final int calorie = 175;

    public Pear() {
        setName("pear");
        setWeight(0.15);
    }

    public int eat() {
        return calorie;
    }
}
