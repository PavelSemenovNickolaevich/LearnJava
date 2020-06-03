package Interface.hometask;

public class Driver extends Worker implements Driving {


    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Drive car");

    }
}
