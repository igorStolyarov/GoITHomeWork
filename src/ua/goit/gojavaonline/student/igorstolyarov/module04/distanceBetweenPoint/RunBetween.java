package ua.goit.gojavaonline.student.igorstolyarov.module04.distanceBetweenPoint;

import java.util.Scanner;


public class RunBetween {

    public  static double getNumber1, getNumber2, getNumber3, getNumber4;;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(TextWorking.youWelcome);
        getNumber1 = scanner.nextDouble();
        System.out.println(TextWorking.nextEnterValue);
        getNumber2 = scanner.nextDouble();
        System.out.println(TextWorking.nextEnterValue);
        getNumber3 = scanner.nextDouble();
        System.out.println(TextWorking.nextEnterValue);
        getNumber4 = scanner.nextDouble();
        System.out.println(TextWorking.textResult + CoordinateAxis.calculate);
    }
}
