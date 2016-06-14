package com.goit.gojavaonlinethree.student.igorstolyarov.module061;

import java.util.Scanner;

import static com.goit.gojavaonlinethree.student.igorstolyarov.module061.Text.*;

public class RunnerForConverterTemperaturs extends ConverterTemperaturs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(hi);
        celsiyToPharinghate = scanner.nextDouble();
        System.out.print(rezult + "\n" + getAndReturn());
    }
}
