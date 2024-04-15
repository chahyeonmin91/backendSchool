package study.day07;

import java.awt.*;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 5);
        System.out.println("triangle.calculateArea() = " + triangle.calculateArea());

        Shape rectangle = new Rectangle(10, 20);
        System.out.println("rectangle.calculateArea = " + rectangle.calculateArea);

    }
}
