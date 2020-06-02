package javaBasics.practice;

public class Cycle {
    public static void main(String[] args) {
//       exampleCycleOne();
//      exampleCycleTwo();
//        exampleCycleThird();
        exampleCycleForth();


    }

    private static void exampleCycleForth() {
        for (int i = 100; i <=1000; i++) {
            if( i % 2 != 0 &&  i % 5 == 0)  {
                System.out.println(i);
            }
        }
    }

    private static void exampleCycleThird() {
        int a = 0;
        do {
            System.out.println("hello");
        }
        while (a > 0);
    }


    private static void exampleCycleOne() {
        int i = 1000;
        while (i >= 0) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }

    private static void exampleCycleTwo() {
        int sum = 0;
        int i = 1;
        float result;
        while (i <= 100) {
            sum += i;
            i++;
        }
        result = sum / i;
        System.out.println(result);
    }
}
