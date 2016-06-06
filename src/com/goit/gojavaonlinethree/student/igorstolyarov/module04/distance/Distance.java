package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distance;

import java.lang.Math;

public class Distance {

    static double distX1 = Runner.distanceX1;
    static double distX2 = Runner.distanceX2;
    static double distY1 = Runner.distanceY1;
    static double distY2 = Runner.distanceY2;
    static double distBetweenPoint = dist();

    protected static double dist() {
        return Math.sqrt((Distance.distX2 - Distance.distX1)*2 + (Distance.distY2 - Distance.distY1)*2);
    }
}
