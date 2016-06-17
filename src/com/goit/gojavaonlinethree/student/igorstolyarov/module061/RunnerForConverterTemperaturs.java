package com.goit.gojavaonlinethree.student.igorstolyarov.module061;

import java.util.InputMismatchException;
import java.util.Scanner;
import static com.goit.gojavaonlinethree.student.igorstolyarov.module061.Text.*;

public class RunnerForConverterTemperaturs extends ConverterTemperaturs {

      public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // вместо кучи текста в main создал строки в отдельном классе
        System.out.println(hi);
        // начинаем отлавливать ошибку

         try {
              celsiyToPharinghate = scanner.nextDouble();
        /*
        если введена не цифра, то вылазит InputMismatchException
         */
          } catch (InputMismatchException e) {
              System.out.println("[Error:] Введите цифру");
              return;
          }
        System.out.println(rezultText + "\n" + getAndReturn());
    }
}
/*
остался вопрос. Мы в сканнере ожидаем ввода значчение типа double.
Почему вылазит ошибка, если я ввожу 14.8?
 */