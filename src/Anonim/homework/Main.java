package Anonim.homework;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
//        MyCounter myCounter = new MyCounter();
//        director.force(myCounter, 12);

        director.force(new Counter() {
            @Override
            public String report(int month) {
                return "Report for "  +  month;
            }
        }, 12);
    }
}
