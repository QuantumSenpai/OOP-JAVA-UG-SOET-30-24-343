abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double r = 5;

    void area() {
        System.out.println("Area of Circle = " + (3.14 * r * r));
    }

    void perimeter() {
        System.out.println("Perimeter of Circle = " + (2 * 3.14 * r));
    }
}

class Square extends Shape {
    int a = 4;

    void area() {
        System.out.println("Area of Square = " + (a * a));
    }

    void perimeter() {
        System.out.println("Perimeter of Square = " + (4 * a));
    }
}

class Rectangle extends Shape {
    int l = 6, b = 3;

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }

    void perimeter() {
        System.out.println("Perimeter of Rectangle = " + (2 * (l + b)));
    }
}

public class Main {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();
        s.perimeter();

        s = new Square();
        s.area();
        s.perimeter();

        s = new Rectangle();
        s.area();
        s.perimeter();
    }
}
/*
OUTPUT:
Area of Circle = 78.5
Perimeter of Circle = 31.400000000000002
Area of Square = 16
Perimeter of Square = 16
Area of Rectangle = 18
Perimeter of Rectangle = 18
*/