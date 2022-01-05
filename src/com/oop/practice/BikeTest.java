package com.oop.practice;

public class BikeTest {
    public static void main(String[] args) {
        // Create two different Bike objects
        Bike v1 = new Bike();
        Bike v2 = new Bike();
        // Invoke methods on those objects
        v1.speedUp(80);
        v1.changeGear(2);
        System.out.println("Bike v1 Details as follows:");
        v1.printStates();
        System.out.println();

        v2.changeColor("Red");
        v2.changeGear(4);
        v2.speedUp(100);
        v2.applyBrakes(30);
        System.out.println("Bike v2 Details as follows:");
        v2.printStates();
    }
}
