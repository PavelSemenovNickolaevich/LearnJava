package oop.java.basic.practice.taskwithmethod;

public class Main {
    public  static void main (String[] args) {
        Dog dogOne = new Dog();

        dogOne.breed = "hz";
        dogOne.name = "lucky";
        dogOne.speed = 10;

        dogOne.run();
        String info  = dogOne.info();
        System.out.println();
        System.out.println(info);
    }
}
