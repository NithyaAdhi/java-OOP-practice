package codeDesignPatterns.polymorphism;

public class Rectangle extends Shape{

    public Rectangle (double length, double width){
        this.length= length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length*width;
    }
}
