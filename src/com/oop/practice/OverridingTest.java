package com.oop.practice;
class B{
    B(){
        System.out.println("B Constructor");
    }
    void show(){
        System.out.println("B - show");
    }
}
class C extends B{
    C(){
        super();
        System.out.println("C Constructor");
    }
    void show(){
        System.out.println("C - show");
    }

}
public class OverridingTest {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();

        C obj2 = new C(); //it will call constructor C and then it will call the super class constructor
        obj2.show();

        B obj3 = new C();
        obj3.show();
    }
}
//Constructors can't be overridden while only methods can be.