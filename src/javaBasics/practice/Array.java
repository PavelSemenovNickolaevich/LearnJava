package javaBasics.practice;

public class Array {
    public static void main (String[] args) {

        int[] arrayOne = new int[901];
        for (int i = 0; i <arrayOne.length; i++) {
           arrayOne[i] = 100 + i;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        int[] arrayTwo = new int[arrayOne.length];
        for (int i = 0, j = arrayOne.length -1; i < arrayOne.length; i++, j--) {
            arrayTwo[j] = arrayOne[i];
        }

        for (int j : arrayTwo) {
            System.out.println(j);
        }



//        arrayChar();
    }











    private static void arrayChar() {
        char[] chars =new char[10];
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
