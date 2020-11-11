package lesson8;

import java.util.Random;

public class RandomProvider {

    private int iterator;

    private int[] numbers;

    public RandomProvider(int n){
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = new Random().nextInt();
        }
        iterator = 0;
    }

    public int getElement(){
        if (iterator > numbers.length) {
            numbers = null;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i = iterator;
        iterator++;
        return numbers[i];
    }

    public static void main(String[] args) {
        RandomProvider randomProvider = new RandomProvider(3);
        for (int i = 0; i < 4; i++) {
            System.out.println(randomProvider.getElement());
        }
    }
}
