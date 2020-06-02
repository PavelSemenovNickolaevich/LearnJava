package collection;

import javaBasics.practice.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        String[] employees = {
//                "Kail",
//                "John",
//                "Sara",
//                "T-100",
//                "T-1000"
//        };
//        String[] second = new String[employees.length + 1];
//        for (int i = 0; i < employees.length; i++ ) {
//            second[i] = employees[i];
//        }
//        second[second.length - 1] = "T-2000";
//        employees = second;
//        employees[1] = null;
//        String[] newNames = new String[employees.length - 1 ];
//        for (int i = 0, j =0; i < employees.length; i++) {
//            if(employees[i] != null) {
//                newNames [j] = employees[i];
//                j++;
//            }
//        }
//        for (String name : newNames) {
//            System.out.println(name);
//        }

//        MyArrayList employees = new MyArrayList();
//        employees.add("1");
//        employees.add("2");
//        employees.add("3");
//        employees.add("4");
//        employees.add("5");
//        employees.add("6");
//        employees.add("7");
//        employees.remove(2);
//        employees.remove("7");
//        for (int i = 0; i <= 100; i++) {
//            employees.add("Position " + i);
//        }
//        for (int i = 0 ; i < employees.getSize(); i++) {
//            System.out.println(employees.get(i));
//        }

//        ArrayList<String> employees = new ArrayList<>();
//        employees.add("T-100");
//        employees.add("T-1001");
//        employees.add("T-1002");
//        employees.add("T-1003");
//        employees.add("T-1004");
//        employees.add("T-1005");
//        employees.remove(0);
////        for (int i = 0; i < employees.size(); i++) {
////            System.out.println(employees.get(i));
////        }
//        for (String name : employees) {
//            System.out.println(name);
//        }
//
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i <= 1000; i++) {
//            numbers.add(i);
//        }
//        int sum = 0;
//        for (int i : numbers) {
//            sum += i;
//        }
//        System.out.println(sum);


//        HashSet<String> newNames = new HashSet<>();
//        newNames.add("1");
//        newNames.add("2");
//        newNames.add("3");
//        newNames.add("4");
//        newNames.add("3");
//        for (String  name : newNames) {
//            System.out.println(name);
//        }

//        TreeSet<String> newNameTree = new TreeSet<>();
//        newNameTree.add("2");
//        newNameTree.add("1");
//        newNameTree.add("4");
//        newNameTree.add("3");
//        newNameTree.add("3");
//        for (String  name : newNameTree) {
//            System.out.println(name);
//        }

//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//
//
//        ArrayList<String> newNames = new ArrayList<>();
//        newNames.add("T1001");
//        newNames.add("T1002");
//        newNames.add("T1003");
//        newNames.add("T1004");
//        newNames.add("T1005");
//        newNames.add("T1006");
//        newNames.add("T1007");
//        newNames.add("T1008");
//        newNames.add("T1009");
//        newNames.add("T10010");
//        for (String  name : newNames) {
//            System.out.println(name);
//        }
//
//        ArrayList<String> unity = new ArrayList<>();
//        unity.add(numbers.get(0) + " - " + newNames.get(0));
//        unity.add(numbers.get(1) + " - " + newNames.get(1));
//        unity.add(numbers.get(2) + " - " + newNames.get(2));
//        unity.add(numbers.get(3) + " - " + newNames.get(3));
//        for (String newList: unity ) {
//            System.out.println(newList);
//        }
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesAndNumbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        names.add("Андрей");
        names.add("Катя");
        names.add("Настя");
        names.add("Антон");
        names.add("Женя");
        names.add("Дима");
        names.add("Коля");
        names.add("Мария");
        names.add("Роман");
        names.add("Павел");
        for (int i = 0; i < numbers.size(); i++) {
            String s = numbers.get(i) + " - " + names.get(i);
            namesAndNumbers.add(s);
        }
        for (String s : namesAndNumbers) {
            System.out.println(s);
        }

    }


}
