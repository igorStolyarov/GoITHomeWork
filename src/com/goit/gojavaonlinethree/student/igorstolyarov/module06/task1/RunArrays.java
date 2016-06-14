package com.goit.gojavaonlinethree.student.igorstolyarov.module06.task1;

// Runner для обработки массивов

public class RunArrays {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        // инициализируем массив из класса MyArray
        myArray.iniArray();

        System.out.println(" Массив до сортировки");
        System.out.println(myArray.toString());

        // сортировка массива
        myArray.sort();

        System.out.println(" Массив после сортировки");
        System.out.println(myArray.toString());

        // поиск минимального єлемента в массиве
        System.out.println(" Минимальное значение массива: " + myArray.searchMin());

    }
}