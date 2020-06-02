package oop.java.basic.practice;

public class AvgAge {
    public static void main (String[] args) {
        Man manOne = new Man();
        Man manTwo = new Man();
        Man manThee = new Man();
        Man manFour = new Man();
        Man manFive = new Man();


        manOne.age = 12;
        manOne.weight = 12.6;
        manOne.name = "ivan";

        manTwo.name = "Vasia0";
        manTwo.weight = 60;
        manTwo.age = 40;

        manThee.name = "Vasia1";
        manThee.weight = 60;
        manThee.age = 40;

        manFour.name = "Vasia2";
        manFour.weight = 60;
        manFour.age = 40;

        manFive.name = "Vasia3";
        manFive.weight = 60;
        manFive.age = 40;

        double avgAge = (manOne.age + manTwo.age + manThee.age + manFour.age + manFive.age)/5;
        System.out.println(avgAge);
    }
}
