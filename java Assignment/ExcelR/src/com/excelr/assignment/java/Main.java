package com.excelr.assignment.java;

//Class and Object
class Car {
 String brand;
 int year;

 // Class constructor
 public Car(String brand, int year) {
     this.brand = brand;
     this.year = year;
 }

 void start() {
     System.out.println("Car is starting...");
 }
}

//Polymorphism
class SportsCar extends Car {
 public SportsCar(String brand, int year) {
		super(brand, year);
		// TODO Auto-generated constructor stub
	}

@Override
 void start() {
     System.out.println("Sports car is starting with a roar!");
 }
}

//Method overloading
class Calculator {
 int add(int a, int b) {
     return a + b;
 }

 double add(double a, double b) {
     return a + b;
 }
}

//Inheritance
class Animal {
 void speak() {
     System.out.println("Animal speaks");
 }
}

class Dog extends Animal {
 @Override
 void speak() {
     System.out.println("Dog barks");
 }
}

//Interface
interface Shape {
 double area();
}

class Circle implements Shape {
 double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Abstract class
abstract class Shape2D {
 abstract double area();
}

class Rectangle extends Shape2D {
 double length;
 double width;

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 double area() {
     return length * width;
 }
}

//Abstraction and Encapsulation
class BankAccount {
 private double balance;

 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
     }
 }

 public double getBalance() {
     return balance;
 }
}

//Composition and Aggregation
class Engine {
 void start() {
     System.out.println("Engine is starting...");
 }
}

class Car2 {
 private final Engine engine;

 public Car2() {
     engine = new Engine();
 }

 void start() {
     engine.start();
     System.out.println("Car is starting...");
 }
}

//Generalization and Specialization
class Vehicle {
 void move() {
     System.out.println("Vehicle is moving");
 }
}

class Bicycle extends Vehicle {
 void pedal() {
     System.out.println("Bicycle is pedaling");
 }
}

public class Main {
 public static void main(String[] args) {
     // Class and Object
     Car myCar = new Car("Toyota", 2023);

     // Polymorphism
     Car sportsCar = new SportsCar(null, 0);

     // Method overloading
     Calculator calc = new Calculator();
     int sumInt = calc.add(5, 3);
     double sumDouble = calc.add(5.5, 3.3);

     // Inheritance
     Animal myDog = new Dog();

     // Interface
     Circle circle = new Circle(5.0);
     double circleArea = circle.area();

     // Abstract class
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     double rectangleArea = rectangle.area();

     // Abstraction and Encapsulation
     BankAccount account = new BankAccount();
     account.deposit(1000.0);
     double accountBalance = account.getBalance();

     // Composition and Aggregation
     Car2 myCar2 = new Car2();
     myCar2.start();

     // Generalization and Specialization
     Bicycle myBicycle = new Bicycle();
     myBicycle.move();
     myBicycle.pedal();
 }
}
