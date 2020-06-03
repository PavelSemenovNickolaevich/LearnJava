package Interface.hometask;

import java.util.ArrayList;

public class Main {

    public static  void main (String [] args) {
        Driver driver1 = new Driver("Ivan1");
        Driver driver2 = new Driver("Ivan2");
        Driver driver3 = new Driver("Ivan3");
        Cooker cooker1 = new Cooker("Boris1");
        Cooker cooker2 = new Cooker("Boris2");
        Cooker cooker3 = new Cooker("Boris3");
        Programmer programmer1 = new Programmer("Pavel1");
        Programmer programmer3 = new Programmer("Pavel2");
        Programmer programmer2 = new Programmer("Pavel3");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);
        workers.add(cooker1);
        workers.add(cooker2);
        workers.add(cooker3);
        workers.add(programmer1);
        workers.add(programmer2);
        workers.add(programmer3);
        for (Worker work : workers){
            work.voice();
        }
        ArrayList<Driving> drivers = new ArrayList<>();
        drivers.add(driver1);
        drivers.add(driver2);
        drivers.add(driver3);
        for (Driving work: drivers) {
            work.drive();
        }

        //и добавить другие коллекции по аналогии

    }
}
