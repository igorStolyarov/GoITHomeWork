package ua.goit.gojavaonline.student.igorstolyarov.module04.temperature;

import java.util.Scanner;

public class Runner {
    static double celToFar;
    static double farToCel;

    public static void main(String[] args) {

        Converter convertCToF = new Converter();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертирую температурную шкалу");
        System.out.println("Для получения температуры в Фарингейтах, введите число по Цельсию");
        celToFar = scanner.nextDouble();
        System.out.println("Температура по Фарингейту равна: " + Converter.convertorC());



//        double cToF = convertCToF.convertorF(55);
//        System.out.println(cToF);
//
//        double fToC = convertCToF.convertorC(239);
//        System.out.println(fToC);
    }
}
