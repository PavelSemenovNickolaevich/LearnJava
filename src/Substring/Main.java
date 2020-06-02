package Substring;

public class Main {

    public static void main(String[] args) {
//        byte c;
//        Byte c1;
//        short s;
//        Short s1;
//        long l;
//        Long l1;
//        char ch;
//        Character ch1;
//        int a;
//        Integer b;
//        float f;
//        Float f1;
//        double d;
//        Double d1;
//        boolean bool;
//        Boolean bool1;
//        String s = "1000";
//        String test = "2000";
//        int a = Integer.parseInt(s);
//        int b = Integer.parseInt(test);
//        System.out.println(a + b);

        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист.";
        String name = s.substring(4,8);
        String ageString = s.substring(14,16);
        int age = Integer.parseInt(ageString);
        String heightString = s.substring(32,37);
        double height = Double.parseDouble(heightString);
        String position = s.substring(53, 65);

        Man man  = new Man(name, position, age, height);

        System.out.println(man.getName() + " " + man.getPosition() + " " + man.getAge() + " года " + man.getHeight() + "см.");





    }
}
