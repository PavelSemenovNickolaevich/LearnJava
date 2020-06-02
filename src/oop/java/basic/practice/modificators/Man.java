package oop.java.basic.practice.modificators;

public class Man {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age > 0 ");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
