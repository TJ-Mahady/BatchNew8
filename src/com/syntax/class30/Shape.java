package com.syntax.class30;

public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
   Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
   Test your code.*/
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape {
    double radius;
    double area, perimeter;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        area = Math.PI * (radius * radius);
        return area;
    }
    @Override
    public double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
class Square implements Shape {
    double width;
    double area, perimeter;
    Square(double width) {
        this.width = width;
    }
    @Override
    public double calculateArea() {
        area = width * width;
        return area;
    }
    @Override
    public double calculatePerimeter() {
        perimeter = 4 * width;
        return perimeter;
    }
}
class ShapeTester {
    public static void main(String[] args) {
        Shape shape = new Square(8);
        System.out.println(shape.calculateArea());
        System.out.println(shape.calculatePerimeter());
        Shape shape1 = new Circle(3.8);
        System.out.println(shape1.calculateArea());
        System.out.println(shape1.calculatePerimeter());
    }
}
