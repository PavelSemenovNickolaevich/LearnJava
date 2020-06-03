package Interface.hometask;

public class Programmer extends Worker implements Programming {


    public Programmer(String name) {
        super(name);
    }

    @Override
    public void programming() {
        System.out.println("Write code");

    }
}
