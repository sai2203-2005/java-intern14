abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends Shape {
    double a, b, c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double calculatePerimeter() {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        System.out.printf("Circle Area: %.2f%n", circle.calculateArea());
        System.out.printf("Circle Perimeter: %.2f%n", circle.calculatePerimeter());

        System.out.printf("%nRectangle Area: %.2f%n", rectangle.calculateArea());
        System.out.printf("Rectangle Perimeter: %.2f%n", rectangle.calculatePerimeter());

        System.out.printf("%nTriangle Area: %.2f%n", triangle.calculateArea());
        System.out.printf("Triangle Perimeter: %.2f%n", triangle.calculatePerimeter());
    }
}
