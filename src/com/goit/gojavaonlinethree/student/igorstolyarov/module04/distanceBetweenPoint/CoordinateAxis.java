package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint;



public class CoordinateAxis {

    static double coorX2 = RunBetween.getNumber1;
    static double coorX1 = RunBetween.getNumber2;
    static double coorY2 = RunBetween.getNumber3;
    static double coorY1 = RunBetween.getNumber4;

    //temps variable

    static double coorX = coorX2 - coorX1;
    static double coorY = coorY2 - coorY1;

   static double calculate = CoordinateAxis.res();


    public static double res(){
        return Math.sqrt(((CoordinateAxis.coorX) * 2) + (CoordinateAxis.coorY)*2) ;
    }
}
