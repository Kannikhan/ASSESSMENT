// Abstraction: Define an abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate area (no implementation details)
    public abstract double calculateArea();
}

// Encapsulation: Create a concrete class representing a Circle
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Encapsulated method to set the radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    // Encapsulated method to get the radius
    public double getRadius() {
        return radius;
    }

    // Implement the abstract method to calculate area for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionEncapsulationExample {
    public static void main(String[] args) {
        // Create a Circle object
        Circle circle = new Circle(5.0);

        // Get and set the radius using encapsulated methods
        System.out.println("Radius: " + circle.getRadius());
        circle.setRadius(7.0);
        System.out.println("Updated Radius: " + circle.getRadius());

        // Calculate and display the area using abstraction
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
