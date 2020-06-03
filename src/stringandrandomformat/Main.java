package stringandrandomformat;

public class Main {
    public static void main(String[] arg) {
        String result = String.valueOf( "Случайное число " + (int)(10 + Math.random() * 1000) + "." +
                "Попробуйте еще раз");
        System.out.println(result);
        //or another way
//        int random = (int) (Math.random() * 90 + 10);
//        String result = String.format("Случайное число %s. Попробуйте еще раз...", random);
//        System.out.println(result);
    }
}
