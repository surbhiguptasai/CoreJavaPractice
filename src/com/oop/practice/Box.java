package com.oop.practice;

public class Box {
    // the properties or fields
    private int length;
    private int width;
    private int height;
    public Box(){
        length = -1;
        width = -1;
        height = -1;
    }
    public Box(int l, int w, int h){
        length= l;
        width= w;
        height= h;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int CalcVolume(){
        return width*length*height;
    }
}
