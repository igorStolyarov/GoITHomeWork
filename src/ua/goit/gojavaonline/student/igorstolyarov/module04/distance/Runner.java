package ua.goit.gojavaonline.student.igorstolyarov.module04.distance;

import java.util.Scanner;

public class Runner {
    public static double distanceX1, distanceX2, distanceY1, distanceY2;

    public static void main(String[] args) {

        // Calculate the distance between two points

        Scanner scanner = new Scanner(System.in);

        System.out.println("Эта программа считает длинну отрезка между двумя точками.");
        System.out.println("Для расчета, введите последовательно 4 цифры " +
                           "(две цифры по оси Х и две по оси Y)");
        System.out.println("");
        System.out.println("Введите первую цифру координаты х2");
        distanceX2 = scanner.nextDouble();
        System.out.println("Введите вторую цифру координаты х1");
        distanceX1 = scanner.nextDouble();
        System.out.println("Введите первую цифру координаты y2");
        distanceY2 = scanner.nextDouble();
        System.out.println("Введите вторую цифру координаты y1");
        distanceY1 = scanner.nextDouble();
        System.out.println("Выполняю расчет длинны отрезка");
        System.out.println("Расстояние между двумя точками = " + Distance.distBetweenPoint);
    }
}
