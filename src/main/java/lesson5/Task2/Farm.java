package lesson5.Task2;

import lesson5.Task2.animals.Animal;
import lesson5.Task2.animals.Chicken;
import lesson5.Task2.animals.Cow;
import lesson5.Task2.animals.Rabbit;

import java.time.LocalDateTime;
import java.time.Month;

public class Farm {
    private final Animal[] animals = new Animal[]{
            new Cow(),
            new Chicken(),
            new Rabbit()
    };

    private int storageFood = 100;

    public Farm() {
    }

    public void action(LocalDateTime dateTime) {
        if (dateTime.getHour() >= 21 || dateTime.getHour() < 7) {
            for (Animal a:
                 animals) {
                a.goSleep();
            }
        } else if (dateTime.getHour() >= 8 || dateTime.getHour() < 19) {
            l1:
            for (Animal a:
                 animals) {
                a.wakeUp();
                while (a.eat(new Food()) == null){
                    if (storageFood > 0) {
                        storageFood--;
                    } else {
                        System.out.println("Нужно больше еды!");
                        break l1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Farm farm = new Farm();

        farm.action(LocalDateTime.of(2020, Month.JUNE, 1, 8,0));
        farm.action(LocalDateTime.of(2020, Month.JUNE, 1, 22,0));
        farm.action(LocalDateTime.of(2020, Month.JUNE, 2, 8,0));
        farm.action(LocalDateTime.of(2020, Month.JUNE, 2, 23,0));
        farm.action(LocalDateTime.of(2020, Month.JUNE, 3, 9,0));
        farm.action(LocalDateTime.of(2020, Month.JUNE, 3, 21,0));

    }
}
