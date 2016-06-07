package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint;

import java.util.Scanner;

import static com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint.CoordinateAxis.calculate;
import static com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint.TextWorking.nextEnterValue;
import static com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint.TextWorking.textResult;

public class WorkScanner {

    public  static double getNumber1, getNumber2, getNumber3, getNumber4;

    public static void main(String[] args) {
        Scanner runBetween = new Scanner(System.in);

        System.out.println(TextWorking.youWelcome);
        getNumber1 = runBetween.nextDouble();
        System.out.println(nextEnterValue);
        getNumber2 = runBetween.nextDouble();
        System.out.println(nextEnterValue);
        getNumber3 = runBetween.nextDouble();
        System.out.println(nextEnterValue);
        getNumber4 = runBetween.nextDouble();
        System.out.println(textResult + calculate);
    }

}
