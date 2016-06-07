package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distanceBetweenPoint;

public class CoordinateAxis {
    double coorX1, coorX2, coorY1, coorY2;
    String firstEnterValue = "Please, enter value";
    String nextEnterValue = "Please, enter next value";

    //temps variable

    double coorX = coorX2 - coorX1;
    double coorY = coorY2 - coorY1;

    double getNumberKeypad(){
        return Math.sqrt(((coorX) * 2) + (coorY)*2);
    }
}
