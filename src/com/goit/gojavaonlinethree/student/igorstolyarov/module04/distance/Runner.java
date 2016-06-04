package com.goit.gojavaonlinethree.student.igorstolyarov.module04.distance;

public class Runner {
    public static void main(String[] args) {

        // Calculate the distance between two points

        Distance distance = new Distance();
        double distBetweenPoint = distance.dist(5,3,6,4);

        System.out.println("distance between two points = " + distBetweenPoint);
    }
}
