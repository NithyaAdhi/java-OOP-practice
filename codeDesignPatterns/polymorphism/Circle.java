package codeDesignPatterns.polymorphism;

public class Circle extends Shape{
    //polymorphism
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * Math.sqrt(radius);
    }

}
