package lesson5.Task2.animals;

public class Rabbit extends Animal {
    public Rabbit() {
        super(false, true, 6);
    }

    @Override
    public void chewingSound() {
        System.out.println("Hrum-hrum");
    }

    @Override
    public void voice() {
        System.out.println("Pi-pi");
    }
}
