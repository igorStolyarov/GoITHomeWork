package com.goit.gojavaonlinethree.student.igorstolyarov.module062;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        boolean isDigit = false;

        do {
            try {
                System.out.println("Для перевода из Цельсия в Фарингейты введите цифру");
                Scanner scanner = new Scanner(System.in);
                double getKeyb = scanner.nextDouble();
                isDigit = true;
                double result = getKeyb * 9.0d / 5.0d + 32;
                System.out.println("Температура в Фарингейтах = " + result);
            }
            catch (InputMismatchException e) {
                System.out.println("Символы не распознаны. Повторите ввод ");
            }
        } while (!isDigit);
    }
}


