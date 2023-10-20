package common;

import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Algorithm {

    Validation validation = new Validation();

    public Triangle displayTriangle() {
        System.out.println("-----Triangle-----");
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double a = validation.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double b = validation.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double c = validation.checkInputDouble();
            if (a + b > c && b + c > a && a + c > b) {
                Triangle triangle = new Triangle(a, b, c);
                triangle.printResult();
                return triangle;
            } else {
                System.out.println("Re-input");
            }
        }
    }

    public Rectangle displayRectangle() {
        System.out.println("-----Rectangle-----");
        System.out.print("Please input side width of Rectangle: ");
        double width = validation.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = validation.checkInputDouble();
        Rectangle rectangle = new Rectangle(width, length);
        rectangle.printResult();
        return rectangle;
    }

    public Circle displayCircle() {
        System.out.println("-----Circle-----");
        System.out.print("Please input radius of Circle: ");
        double radius = validation.checkInputDouble();
        Circle circle = new Circle(radius);
        circle.printResult();
        return circle;
    }
}
