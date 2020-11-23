package com.syntax.class30;

public abstract class Car {
    /*Create a Class Car that would have the following fields:
    carPrice and color and method calculateSalePrice()
    which should be returning a price of the car.
    Create 2 subclasses: Sedan and Truck.
    The Truck class has field as weight and has its own implementation of calculateSalePrice() method
    in which returned price calculated as following: if weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is > 20 feet then returned car price should include 5% discount, otherwise 10% discount*/
    double carPrice;
    String color;
    public Car(double carPrice) {
        this.carPrice = carPrice;
    }
    abstract double calculateSalePrice();
}
class Sedan extends Car {
    double length;
    Sedan(double carPrice, double length) {
        super(carPrice);
        this.length = length;
    }
    @Override
    double calculateSalePrice() {
        if (length > 20) {
            carPrice *= 0.95;
        } else {
            carPrice *= 0.9;
        }
        return carPrice;
    }
}
class Truck extends Car {
    double weight;
    Truck(double carPrice, double weight) {
        super(carPrice);
        this.weight = weight;
    }
    @Override
    double calculateSalePrice() {
        if (weight > 2000) {
            carPrice *= 0.9;
        } else {
            carPrice *= 0.8;
        }
        return carPrice;
    }
}
class CarTester {
    public static void main(String[] args) {
        Car car1 = new Sedan(50000, 15);
        Car car2 = new Sedan(80000, 21);
        Car car3 = new Truck(250000, 1500);
        Car car4 = new Truck(300000, 2100);
        System.out.println(car1.calculateSalePrice());
        System.out.println(car2.calculateSalePrice());
        System.out.println(car3.calculateSalePrice());
        System.out.println(car4.calculateSalePrice());
    }
}
