package ua.goit.gojavaonline.student.igorstolyarov.module06.task1;

import java.util.Scanner;

public class Runner {
    public static double distanceX2, distanceX1, distanceY2, distanceY1;

    public static void main(String[] args) {

        // Calculate the distance between two points

        Scanner scanner = new Scanner(System.in);

        System.out.println(ForText.info);
        distanceX2 = scanner.nextDouble();
        distanceX1 = scanner.nextDouble();
        if (distanceX1 >= distanceX2) {
            return ;
        }
        distanceY2 = scanner.nextDouble();
        distanceY1 = scanner.nextDouble();
        System.out.println("Расстояние между двумя точками = " + Distance.distBetweenPoint);
    }
}
