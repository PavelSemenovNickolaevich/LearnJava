package oop.java.basic.practice.overload;

public class Main {
    public static void main(String[] args) {

        Monstr monstr = new Monstr(1, 3, 4);
        Monstr monstrOne = new Monstr();
        // monstr.voice();
        System.out.println();
        monstr.voice(3);
        System.out.println();
        //  monstrOne.voice(2,"Hello");


    }
}
