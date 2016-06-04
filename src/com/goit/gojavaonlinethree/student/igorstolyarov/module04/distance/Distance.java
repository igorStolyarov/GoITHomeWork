package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distance;

import java.lang.Math;

public class Distance {

    double x1;
    double x2;

    double y1;
    double y2;



    double dist (double x2, double x1, double y2, double y1) {
        return Math.sqrt((x2 - x1)*2 + (y2 -y1)*2);
    }
 }
