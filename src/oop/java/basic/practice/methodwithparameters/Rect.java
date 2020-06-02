package oop.java.basic.practice.methodwithparameters;

public class Rect {

    int length;
    int width;

    void  setSize (int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimeter() {
        return (length + width + width + length);
    }

    int square() {
        return (length*width);
    }



}
