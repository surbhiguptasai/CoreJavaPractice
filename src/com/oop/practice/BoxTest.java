package com.oop.practice;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box();
//        b1.setHeight(5);
//        b1.setLength(10);
//        b1.setWidth(6);
        System.out.println("Box b1 details ");
        System.out.println("Height = " + b1.getHeight());
        System.out.println("Width = " + b1.getWidth());
        System.out.println("Length = " + b1.getLength());
        System.out.println("Volume = " + b1.CalcVolume());

        Box b2 = new Box(3, 4, 5);
        System.out.println("Box b2 details ");
        System.out.println("Height = " + b2.getHeight());
        System.out.println("Width = " + b2.getWidth());
        System.out.println("Length = " + b2.getLength());
        System.out.println("Volume = " + b2.CalcVolume());
    }
}

