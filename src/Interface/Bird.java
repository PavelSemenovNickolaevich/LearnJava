package Interface;

public class Bird extends Animal implements  CanRun, Flyable {
    @Override
    public void run() {
        System.out.println("Birds runs");
    }

    @Override
    public void eat() {
        System.out.println("Bird worms");


    }

    @Override
    public void fly() {
        System.out.println("Birsd flys");
    }
}
