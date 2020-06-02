package oop.java.basic.practice.overload;

public class Monstr {

    int eyes;
    int legs;
    int arms;

    public Monstr() {
        eyes = 2;
        legs = 2;
        arms = 2;
    }

    public Monstr(int eyes) {
        this.eyes = eyes;
        legs = 2;
        arms =2;

    }

    public Monstr(int eyes, int legs) {
        this.eyes = eyes;
        this.legs = legs;
        arms =2;


    }

    public Monstr(int eyes, int legs, int arms) {
        this.eyes = eyes;
        this.legs = legs;
        this.arms = arms;
    }

    void voice() {
        System.out.println("Vote");
    }

    void voice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Голос");
        }
    }

    void voice(int n, String word) {
        for (int i = 0; i < n; i++) {
            System.out.print(word + ", ");
        }

    }
}
