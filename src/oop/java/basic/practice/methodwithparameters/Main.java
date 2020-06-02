package oop.java.basic.practice.methodwithparameters;

public class Main {
    public static void main (String[] args) {

        Rect rect = new Rect();
        rect.setSize(10, 10);
        System.out.println(rect.perimeter());
        System.out.println(rect.square());
    }
}
