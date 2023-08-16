// Base class representing a geometric shape
class Shapes {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

// Derived class representing a circle (inherits from Shape)
class Circles extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Derived class representing a rectangle (inherits from Shape)
class Rectangle extends Shapes {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

public class InheritancePolymorphismExample {
    public static void main(String[] args) {
        Shapes shape1 = new Circles();     // Upcasting
        Shapes shape2 = new Rectangle();  // Upcasting

        // Polymorphism: Call overridden methods
        shape1.draw();  // Calls the draw method of Circle
        shape2.draw();  // Calls the draw method of Rectangle
    }
}

