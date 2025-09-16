abstract class Shape {
    abstract void draw(); // abstract method (must be implemented)

    void info() { // concrete method
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw(); // Drawing Circle
        s2.draw(); // Drawing Rectangle
        s1.info(); // Concrete method from abstract class
    }
}

// E:\Karan_codes\Java>cd "e:\Karan_codes\Java\cogPrac\oop\Abstraction\" &&
// javac AbstractDemo.java && java AbstractDemo && del AbstractDemo.class
// Drawing circle
// Drawing rectangle
// This is a shape
