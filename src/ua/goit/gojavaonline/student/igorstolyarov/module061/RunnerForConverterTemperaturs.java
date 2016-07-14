package ua.goit.gojavaonline.student.igorstolyarov.module061;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerForConverterTemperaturs extends ConverterTemperaturs {

    public static void main(String[] args) {

          /* ДЗ модуль 7
          необходимо:
          Найти и описать анти-паттерны в своём коде и предложить вариант их исправления.
          Формат описания - комментарии в исходном коде с предложениями их решения.
          Решение обсудить с ментором и только ПОСЛЕ этого изменять код.

             1. В классе runner
                1.1. Выносим scanner в отдельный класс
                1.2. Для exception создаем отдельный класс
                1.3. Зацикливаем пользователя до введения корректного значения

             2. В классе text
                2.1 Переименовать строковую переменную hi

             3. Онаруженные у себя недостатки в коде
                3.1 Не всегда названия методов отображают суть того, что они делают
                3.2 Есть проблема с пониманием когда работать через статический импорт,
                    а когда через геттеры/сеттеры
           */

        Scanner scanner = new Scanner(System.in);

        // вместо кучи текста в main создал строки в отдельном классе
        System.out.println(Text.getFirstMessage());
        // начинаем отлавливать ошибку

        // делаем do wile
        boolean isDigit = false;
        do {
            try {
                if(scanner.hasNextDouble()) {
                    celsiyToPharinghate = scanner.nextDouble();
                    scanner.reset();
                    isDigit = true;
                    System.out.println(Text.getRezultText() + "\n" + getAndReturn());

                } else {
                    System.out.println(Text.getErrorMessage());
                    System.out.println(Text.getErrorMessage());
                }
                /*
        если введена не цифра, то вылазит InputMismatchException
         */
            } catch (InputMismatchException e) {


            }

        } while (!isDigit);
    }
}