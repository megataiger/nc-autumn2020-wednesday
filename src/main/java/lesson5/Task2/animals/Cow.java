package lesson5.Task2.animals;

public class Cow extends Animal {
    public Cow() {
        super(false, true, 30);
    }

    @Override
    public void chewingSound() {
        System.out.println("Chew-chew");
    }

    @Override
    public void voice() {
        System.out.println("Mooooooooo");
    }
}
