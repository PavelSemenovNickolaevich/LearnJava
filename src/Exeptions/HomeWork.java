package Exeptions;

import java.util.SortedMap;

public class HomeWork {
    public static void main(String[] ars) {
        int[] array =  new int[10];

        try {
            for (int i = 0; i <= array.length; i++) {
                array[i] = i;
                System.out.println(i);

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вышел за пределы массива. 10");
        }

    }
//    try {
//        int[] array = new int[10];
//        System.out.println(array[25]);
//    } catch (IndexOutOfBoundsException e) {
//        System.out.println("Выход за пределы массива");
//    }
}
