package com.goit.gojavaonlinethree.student.igorstolyarov.module05.arraysMinToMax;

import java.util.Random;

public class SortValueOnArrayMinToMax {

    Random rand = new Random();

    private int[] arrMinToMax = new int[13];



    public int getArrMinToMax() {
        int minimum = arrMinToMax[0];
        for (int i = 0; i <= arrMinToMax.length - 1; i++) {
            arrMinToMax[i] = rand.nextInt(20);
            System.out.println(arrMinToMax[i]);

        }
        return minimum;
   }
}



