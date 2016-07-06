package com.Test.Shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Circle {
    double getKB;
    boolean isDigit = false;

      Circle() {
        do {
            try {
                System.out.println("Введите значение");
                Scanner scanner = new Scanner(System.in);
                getKB = scanner.nextDouble();
                isDigit = true;
                double result = Math.PI * (getKB * getKB);
                System.out.println("Площадь равна " + result);
            } catch (InputMismatchException e) {
                System.out.println("Символы не распознаны. Повторите ввод " + e);
            }
        }
        while (!isDigit);
    }
}
