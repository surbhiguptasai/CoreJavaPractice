package com.oop.practice;

public class VehicleTest {
    public static void main(String[] args) {
        // Create two different Vehicle objects
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        // Invoke methods on those objects
        v1.speedUp(10);
        v1.changeGear(2);
        System.out.println("Vehicle v1 Details as follows:");
        v1.printStates();
        System.out.println();

        v2.speedUp(10);
        v2.changeGear(2);
        v2.speedUp(20);
        v2.changeGear(3);
        v2.applyBrakes(15);
        System.out.println("Vehicle v2 Details as follows:");
        v2.printStates();
    }
}
