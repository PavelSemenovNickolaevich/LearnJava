package Anonim;

public class Main {
    public static  void main (String [] args) {
        Director director  = new Director();
//        Cooker cooker = new Cooker();
//        director.force(cooker);
        director.force(new Cookable() {
            @Override
            public void cook() {
                System.out.println("cook");
            }
        });

    }
}
