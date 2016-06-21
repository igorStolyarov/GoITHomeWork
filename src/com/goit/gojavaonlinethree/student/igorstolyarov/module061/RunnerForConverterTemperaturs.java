package com.goit.gojavaonlinethree.student.igorstolyarov.module061;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.goit.gojavaonlinethree.student.igorstolyarov.module061.Text.hi;
import static com.goit.gojavaonlinethree.student.igorstolyarov.module061.Text.rezultText;

public class RunnerForConverterTemperaturs extends ConverterTemperaturs {

    public static void main(String[] args) throws Exception {

          /* ДЗ модуль 7
          необходимо:
          Найти и описать анти-паттерны в своём коде и предложить вариант их исправления.
          Формат описания - комментарии в исходном коде с предложениями их решения.
          Решение обсудить с ментором и только ПОСЛЕ этого изменять код.


             1.В классе runner
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
        System.out.println(hi);
        // начинаем отлавливать ошибку

        // делаем do wile
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