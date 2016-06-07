package com.goit.gojavaonlinethree.student.igorstolyarov.module05;

import java.util.Random;
import java.util.Arrays;

public class RunForMyFirstArray {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myArray = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = random.nextInt(99);
            Arrays.sort(myArray);
            System.out.println(myArray[i]);

        }
    }
}
