package javaBasics.practice;

public class ArrayTwo {
    public static void main(String[] args) {
//        array();
//        month();
        String month = "december";
        switch (month) {
            case "january":
                System.out.println("Winter");
            case "february":
                System.out.println("Winter");
            case "december":
                System.out.println("Winter");
                break;


            default:
                System.out.println("Wrong month");
        }



    }






    private static void month() {
        String[] month = {"january", "february", "march", "april", "may", "june", "jule", "august", "september",
                "october", "november", "december "};
        String result = "";
        for (int i = 0; i < month.length; i++) {
            result += month[i];
            if (i == month.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
//            System.out.println(result);
        }
        System.out.println(result);
    }


    private static void array() {
        int[] dayOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i : dayOfMonth) {
            System.out.println(i);
        }
    }

}
