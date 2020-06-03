package Interface;

public class Dog extends  Animal implements CanRun{
    @Override
    public void eat() {
        System.out.println("Bones");
    }

    public void run() {
        System.out.println("Dog runs");
    }
}
