package com.oop.practice;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle obj= new Rectangle();
        obj.setHeight(3.5);
        obj.setWidth(4.8);
        System.out.println("Rectangle Details: ");
        System.out.println("Height = "+ obj.getHeight());
        System.out.println("Width = "+ obj.getWidth());
        System.out.println("Area  = "+ obj.getArea());

        Circle c = new Circle();
        c.setRadius(2.25);
        System.out.println("Circle Details: ");
        System.out.println("Radius = "+ c.getRadius());
        System.out.println("Area = "+ c.getArea());

        Rectangle r1 = new Rectangle(2.5,3.5);
        Rectangle r2 = new Rectangle(1.75,2.93);
        Rectangle r3 = new Rectangle(3.12,6.46);
        //Rectangle arr1[] = {r1,r2,r3};

        Circle c1 = new Circle(1.65);
        Circle c2 = new Circle(4.23);
        //Circle arr2[] = {c1,c2};

        Shape shapes[] = {r1,c1,r2,r3,c1,obj,c2,c};
        System.out.println("------------------------");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shapes["+i+"]: " + shapes[i].getClass());
            System.out.println("Shapes["+i+"]: " + shapes[i].getArea());
        }
    }
}
