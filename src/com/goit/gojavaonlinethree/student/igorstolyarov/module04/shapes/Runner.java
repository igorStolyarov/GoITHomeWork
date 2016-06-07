package com.goit.gojavaonlinethree.student.igorstolyarov.module04.shapes;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class Runner {
    public static double getKeyboard;

    public static void main(String[] args) {



        Shapes shapes = new Shapes();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Расчитаем площадь треугольника");
        System.out.println("Введите длинну стороны");
        getKeyboard = scanner.nextDouble();
        System.out.println("Площадь треугольника равна: " + LineSegment.ls);




        // Triangle
//        float mathTriangle = shapes.areaTriangle(3,3);
//
//        System.out.println("Area of triangle = " + mathTriangle);
//
//        // RectAngle
//        int mathRectangle = shapes.areaRectAngle(5,5);
//
//        System.out.println("Area of rectangle = " + mathRectangle);
//
//        // Circle
//        double radiusCircle = shapes.radius(9);
//
//        System.out.println("Area of circle = " + radiusCircle);
    }
}
