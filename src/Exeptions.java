public class Exeptions {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
//            String s = "123kk";
//            int i = Integer.parseInt(s);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        } catch (NumberFormatException e1) {
            System.out.println("Ошибка преобразования");
        } catch (Exception e2) {

        } finally {
            System.out.println("Finally");
        }
        System.out.println("Hello");

    }
}
