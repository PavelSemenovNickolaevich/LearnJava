package Multithreading.homework;

public class Main {

    // static int num1;
    static int num2;
    private static boolean win = false;

    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 100000000);
        System.out.println(num1);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!win) {
                    System.out.println(i);
                    i++;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        timer.start();

        Thread guess = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int i = (int) (Math.random() * 10);
                    if (i == num1) {
                        win = true;
                        System.out.println(i);
                        try {
                            Thread.sleep(100000000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
        guess.start();

    }
}
