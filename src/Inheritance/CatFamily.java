package Inheritance;

public class CatFamily {


    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    private int ears;
    private int legs;
    private boolean bigClaws;


//    public CatFamily() {
//        ears =2;
//        legs = 4;
//        bigClaws = true;
//    }
    public void showInfo() {
        System.out.println("Count ears " + ears + " Count legs " + legs +  " Exist big claws  " + bigClaws);

    }

    public void eat() {
        System.out.println("Eat");
    }
}
