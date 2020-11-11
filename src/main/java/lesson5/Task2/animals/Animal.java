package lesson5.Task2.animals;

import lesson5.Task2.Food;

public abstract class Animal {

    private boolean sleep;

    private boolean hungry;

    private final int hungryCount;

    private int hungryCounter;

    public Animal(boolean sleep, boolean hungry, int hungryCount) {
        this.sleep = sleep;
        this.hungry = hungry;
        this.hungryCount = hungryCount;
        this.hungryCounter = hungryCount;
    }

    public Food eat(Food food){
        if (sleep) {
            voice();
            return food;
        } else if (hungry && hungryCounter > 0) {
            hungryCounter--;
            chewingSound();
            return null;
        } else if(hungry && hungryCounter == 0) {
            hungry = false;
            return food;
        } else {
            return food;
        }
    }

    public void wakeUp(){
        if (sleep) {
            sleep = false;
            hungry = true;
            hungryCounter = hungryCount;
            voice();
        }
    }

    public void goSleep(){
        if (hungry) {
            voice();
        } else {
            sleep = true;
        }
    }

    protected abstract void chewingSound();

    protected abstract void voice();
}
