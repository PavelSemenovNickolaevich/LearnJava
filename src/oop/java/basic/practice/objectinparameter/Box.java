package oop.java.basic.practice.objectinparameter;

public class Box {
    private double width;
    private double height;
    private double length;
//    private double weigth;

//    public double getWeigth() {
//        return weigth;
//    }
//
//    public void setWeigth(double weigth) {
//        this.weigth = weigth;
//    }

    public void showInfo() {
        System.out.println(width + ", " + height + ", " + length );
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

//    public Box(double width, double height, double length, double weigth) {
//        this.width = width;
//        this.height = height;
//        this.length = length;
//        this.weigth = weigth;
//    }

    public Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    //Ваше решение может отличаться, я сделал так: если мы просто у новой коробки укажем длину и ширину и высоту равную сумме двух коробок,
    //то получившаяся коробка по объему однозначно получится больше суммы тех двух коробок.
    public Box(Box box1, Box box2) {
        this.width = box1.width + box2.width;
        this.length = box1.length + box2.length;
        this.height = box1.height + box2.height;
    }

    public void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    public Box sumBox(Box box) {
        return new Box(this.width + box.width, this.height + box.height, this.length + box.length);
    }

    public double volume() {
        return width * height * length;
    }

    public void showVolume() {
        System.out.println(volume());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
