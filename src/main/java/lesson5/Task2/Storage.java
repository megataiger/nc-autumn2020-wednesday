package lesson5.Task2;

public class Storage {
    private Food[] foods = new Food[100];

    public void minus(){
        foods[99] = null;
        System.out.println(foods.length);
    }

    public static void main(String[] args) {
        new Storage().minus();
    }
}
