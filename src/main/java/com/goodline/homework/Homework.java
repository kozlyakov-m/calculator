package com.goodline.homework;

import com.goodline.helpers.Variables;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    static String[] names = Variables.names;

    // Массив с числами
    static int[] numbers = Variables.numbers;

    private static void main(String[] args) {
        // Здесь запускаете функции
    }

    public static int[] printEven() {
        // Вернуть массив четных чисел меньше 100
        return null;
    }

    private static void printNames() {
       // Вывести все элементы массива names
    }

    private static int getCount() {
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        return 0;
    }

    private static void printCounts() {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1
    }
}
