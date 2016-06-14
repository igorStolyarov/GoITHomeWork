package com.goit.gojavaonlinethree.student.igorstolyarov.module05;
import java.util.Random;
   /**
    * Задача 1. Создать класс, который осуществляет поиск максимального
    * и минимального элемента в массиве из целых чисел (int[]).
    * Задача 2. Выбрать один из алгоритмов сортировки массивов и реализовать его
    */

    public class MyArray implements InterfaceArray {

        // создаем массив из 12 элементов (через переменную)
        private int sizeArray = 12;
        int[] myArray = new int[sizeArray];
        Random rand = new Random();

        void iniArray() {
            // заполняем массив рандомом с числами до 99
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = rand.nextInt(99);
            }
        }

         // бульбашки
         public void sort(){
             /* после каждого прохода сортировки усекаем последний элемент
              * для того, чтобы его, в будущем не трогать. Увеличивается
              * скорость сортировки больших массивов. Начинаем с конца.
              */
             for (int i = myArray.length - 1; i >= 2; i--) {
                 // поверяем была ли сортировка выполнена ранее
                 boolean checkPreviousSorting = true;
                 // Начинаем с начала
                 for (int j = 0; j < i; j++) {
                     //создаем временную переменную для запоминания числа перед перестановкой
                     if (myArray[j] > myArray[j+1]) {
                         int temp = myArray[j];
                         myArray[j] = myArray[j+1];
                         myArray[j+1] = temp;
                         checkPreviousSorting = false;
                     }
                 }

                 //Если с массивом не происходило никаких операций, можно выходить из цикла
                 if(checkPreviousSorting) {
                     break;
                 }
             }
         }

         @Override
         // выводим массив в одну строку, чтобы было красивее для глаз
         public String toString(){
             String arrayToStr = "";
             for (int i = 0; i < myArray.length; i++) {
             arrayToStr += "[" + myArray[i] + "]";
             }
             return arrayToStr;
         }

         public int searchMin () {
             // ищем минимальное значение в массиве
             int minValue;
             minValue = myArray[0];
             for (int i = 0; i < myArray.length; i++) {
             /*если i-тый  элемента массива меньше минимального значения
               минимальное становится i-тым
              */
                 if (myArray[i] < minValue) {
                     minValue = myArray[i];
                     }
                 }
             return minValue;
         }
    }