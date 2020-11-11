package lesson5.Task1.fruits;

//Апельсин

public class Orange extends Fruit {

    private final int calorie = 150;

    public Orange() {
        setName("orange");
        setWeight(0.2);
    }

    public int eat() {
        return calorie;
    }
}
