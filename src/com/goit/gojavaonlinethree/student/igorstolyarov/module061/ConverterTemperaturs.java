package com.goit.gojavaonlinethree.student.igorstolyarov.module061;

/**
 * полностью переделываю конвертор температур
 * решил еще раз все пропустить "через себя"
 */

public class ConverterTemperaturs {

    /*
     * создаем переменную для конвертирования из Цельсия в Фарингейты,
     * которая будет получать значение с клавиатуры
     */
    public static double celsiyToPharinghate;

    /*
     *создаем метод, который будет преобразовывать полученные данны и
     *возвращать обработанное значение в раннер
     */

    public static double getAndReturn () {
        return celsiyToPharinghate * 9.0 / 5 + 32;
        }
}
