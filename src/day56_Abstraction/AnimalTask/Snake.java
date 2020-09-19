package day56_Abstraction.AnimalTask;

public class Snake extends Animal {
    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is sleeping");
    }
}
