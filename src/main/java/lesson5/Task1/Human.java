package lesson5.Task1;

public class Human {

    /**
     * Метод для употребления в пищу съедобных объектов человеком
     * @param edibles объекты, которые являются съедобными
     */
    public void eat(Edible[] edibles){
        int sum = 0;
        for (Edible ed:
             edibles) {
            sum += ed.eat();
        }

        System.out.println("I eat " + sum + " calorie");
    }
}
