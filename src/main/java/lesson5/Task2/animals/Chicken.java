package lesson5.Task2.animals;

public class Chicken extends Animal {
    public Chicken() {
        super(false, true, 4);
    }

    @Override
    public void voice() {
        System.out.println("Co-co-co");
    }

    @Override
    public void chewingSound() {
        System.out.println("Tuck-tuck");
    }
}
