package javaBasics.practice;

import java.util.Scanner;

public class BasicJava {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int money = sc.nextInt();
//        if (money > 300 && money <= 500) {
//            System.out.println("Шаурма");
//        } else if (money >= 100 && money <= 300 ) {
//            System.out.println("Гамбургер");
//        } else if (money < 100) {
//            System.out.println("Доширак");
//        }
//        long a = 14;
//        byte b = (byte) a;
//        System.out.println(b);
//        theoremPifagor();
//        action(false, false);
        whatToDo(19);
    }

    public static void theoremPifagor() {
        System.out.println("Enter catet a  and catet b");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c;
        c = Math.sqrt(a * a + b * b);
        System.out.println("Gipotenuza " + c);
    }

    public static void action(boolean night, boolean goodWeather) {
        if (!night && goodWeather) {
            System.out.println("Walk");
        }
        if (!night && !goodWeather) {
            System.out.println("read book");
        }
        if ((night && !goodWeather) || (night && goodWeather)) {
            System.out.println("sleep");
        }
    }

    public static void whatToDo(int time) {

        boolean isGoodWeather = true;
        boolean late = time >= 23 || time <= 5;
        if (late) {
            System.out.println("sleep");
        }
        if (!late && isGoodWeather) {
            System.out.println("walk");
        }
        if (!late && !isGoodWeather) {
            System.out.println("read book");
        }

    }

}
