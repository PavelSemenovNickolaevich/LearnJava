package oop.java.basic.practice.constructot;

public class Main {
    public static void main (String[] args) {
        Worker worker = new Worker("one", "qa", 120000);

        System.out.println( worker.info(10));
    }
}
