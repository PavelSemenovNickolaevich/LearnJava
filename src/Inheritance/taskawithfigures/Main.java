package Inheritance.taskawithfigures;

public class Main {

    public static  void main(String[] args) {

        Rect rect = new Rect(10, 10);
        Triangle triangle = new Triangle(5,5,5);
        System.out.println(rect.area());
        System.out.println(triangle.area());
    }
}