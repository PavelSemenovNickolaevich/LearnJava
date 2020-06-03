package oop.java.basic.practice.objectinparameter;

public class Main {

    public static void main(String[] args) {
//        Box box1 = new Box(5);
//        Box box2 = new Box(10,10,10);
//        Box box3 = box1.sumBox(box2);
//        Box box4 = new Box(box1, box3);
//        box1.showVolume();
//        box2.showVolume();
//        box3.showVolume();
//        double volumeSum = box1.volume() + box3.volume();
//        System.out.println("box1 + box3 = " + volumeSum);
//        box4.showVolume();
//
//        Box box5 = new Box(3);
//        box5.setLength(10);
//        box5.showVolume();
//        System.out.println(box5.getLength());

        Box box = new Box(5);
        BoxWeight boxWeight = new BoxWeight( 10, 10 ,10, 10);
        boxWeight.showInfo();
        box.showInfo();


    }
}
