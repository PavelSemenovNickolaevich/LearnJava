package Interface.hometask;

public class Cooker extends  Worker implements Cooking {


    public Cooker(String name) {
        super(name);
    }

    @Override
    public void cook() {
        System.out.println("Cook food");

    }
}
