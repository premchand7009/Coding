package Assignment2;
class Shape {
  String color;

 // Constructor to initialize the color of the shape
  Shape(String color) {
     this.color = color;
 }

 // Method to display the details of the shape
  void display() {
     System.out.println("Color: " + color);
 }
}

//Derived class Circle from Shape
class Circle extends Shape {
 // Instance variable to store the radius of the circle
 private double radius;

 // Constructor to initialize color and radius
 public Circle(String color, double radius) {
     super(color); // Call the constructor of the parent class (Shape)
     this.radius = radius;
 }

 // Method to calculate and return the area of the circle
 public double area() {
     return Math.PI * radius * radius; // Area formula: π * radius^2
 }

 // Overriding the display method to show details specific to Circle
 @Override
 public void display() {
     super.display(); // Call the display method of the parent class
     System.out.println("Shape: Circle");
     System.out.println("Area: " + area());
 }
}

//Derived class Rectangle from Shape
class Rectangle extends Shape {
 // Instance variables to store the length and width of the rectangle
 private double length;
 private double width;

 // Constructor to initialize color, length, and width
 public Rectangle(String color, double length, double width) {
     super(color); // Call the constructor of the parent class (Shape)
     this.length = length;
     this.width = width;
 }

 // Method to calculate and return the area of the rectangle
 public double area() {
     return length * width; // Area formula: length * width
 }

 // Overriding the display method to show details specific to Rectangle
 @Override
 public void display() {
     super.display(); // Call the display method of the parent class
     System.out.println("Shape: Rectangle");
     System.out.println("Area: " + area());
 }
}

//Main class to test the functionality
public class Q7 {
 public static void main(String[] args) {
     // Create objects for Circle and Rectangle
     Circle circle = new Circle("Red", 5.0); // Color is Red, radius is 5.0
     Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0); // Color is Blue, length is 4.0, width is 6.0
     
     // Display the details of the Circle and Rectangle
     System.out.println("Circle Details:");
     circle.display();
     System.out.println(); // Print a blank line between the two shapes
     
     System.out.println("Rectangle Details:");
     rectangle.display();
 }
}
