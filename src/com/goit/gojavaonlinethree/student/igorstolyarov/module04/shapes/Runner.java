package com.goit.gojavaonlinethree.student.igorstolyarov.module04.shapes;

public class Runner {
    public static void main(String[] args) {

        Shapes shapes = new Shapes();

        // Triangle
        float mathTriangle = shapes.areaTriangle(3,3);

        System.out.println("Area of triangle = " + mathTriangle);

        // RectAngle
        int mathRectangle = shapes.areaRectAngle(5,5);

        System.out.println("Area of rectangle = " + mathRectangle);

        // Circle
        double radiusCircle = shapes.radius(9);

        System.out.println("Area of circle = " + radiusCircle);
    }
}
