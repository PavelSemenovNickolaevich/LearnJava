package Inheritance;

public class Main {
    public static void main (String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
//        System.out.println(lion.legs);
//        System.out.println(cat.bigClaws);
        cat.showInfo();
        lion.showInfo();
        cat.eat();
        lion.eat();

    }
}
