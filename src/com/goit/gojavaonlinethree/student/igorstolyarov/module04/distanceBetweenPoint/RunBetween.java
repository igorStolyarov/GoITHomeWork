package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint;

import java.util.Scanner;

import static com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint.CoordinateAxis.*;
import static com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint.TextWorking.*;


public class RunBetween {

    public  static double getNumber1, getNumber2, getNumber3, getNumber4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(TextWorking.youWelcome);
        getNumber1 = scanner.nextDouble();
        System.out.println(nextEnterValue);
        getNumber2 = scanner.nextDouble();
        System.out.println(nextEnterValue);
        getNumber3 = scanner.nextDouble();
        System.out.println(nextEnterValue);
        getNumber4 = scanner.nextDouble();
        System.out.println(textResult + calculate);
    }
}
