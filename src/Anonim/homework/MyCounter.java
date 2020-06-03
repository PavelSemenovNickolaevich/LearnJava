package Anonim.homework;

public class MyCounter implements Counter {
    @Override
    public String report(int month) {
        return "Report for  " +  month;
    }
}
