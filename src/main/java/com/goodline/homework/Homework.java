package com.goodline.homework;

import com.goodline.helpers.Variables;

import java.util.*;

public class Homework {
    // В этом массиве неизвестно сколько элементов
    // Количество элементов всегда разное
    private static String[] names = Variables.names;

    // Массив с числами 
    private static int[] numbers = Variables.numbers;

    public static void main(String[] args) {
        // Здесь запускаете функции
        int[] even = printEven(numbers);
        for (int n: even) {
            System.out.print(n+" ");
        }

        printNames();

        System.out.println(getCount(numbers));

        printCounts();

    }

    public static int[] printEven(int[] numbers) {
        // Вернуть массив четных чисел меньше 100
        int[] array = new int[numbers.length];
        int i = 0;
        for (int n: numbers) {
            if(n<100 && n%2==0) {
            array[i] = n;
            i++;
            }
        }
        return  Arrays.copyOf(array, i);
    }

    private static void printNames() {
       // Вывести все элементы массива names
        for(String name: names){
            System.out.println(name);
        }
    }

    public static int getCount(int[] numbers) {
        // Вернуть количество цифр, которые делятся на 3 и 7 без остатка в массиве numbers
        int count = 0;
        for (int n: numbers) {
            if(n%3==0 && n%7==0) count++;
        }
        return count;
    }

    private static void printCounts() {
        // СЛОЖНОЕ ЗАДАНИЕ
        // Вывести количество всех цифр в массиве numbers
        // Допустим [1, 1, 1, 2, 2, 3, 3, 3, 4]
        // Значит надо вывести 1:3 2:2 3:3 4:1

        //вывод по убыванию

        List<Pair> result = new ArrayList<Pair>();

        for (int n:numbers) {
            boolean nothingFound = true;
            for (Pair p: result) {
                if(p.getNum() == n){    //если такое число уже есть увеличиваем счетчик на 1 и прекращаем поиск
                    p.inc();
                    nothingFound = false;
                    break;
                }
            }
            if(nothingFound) result.add(new Pair(n, 1)); //если не  нашли, добавляем число в список
        }

        Collections.sort(result);

        for (Pair p: result) {
            System.out.println(p.getNum()+": "+p.getCounter());
        }

    }

}


class Pair implements Comparable<Pair>{

    int num;
    int counter;

    Pair(int num, int counter){
        this.num = num;
        this.counter = counter;
    }

    public int getNum(){
        return num;
    }
    public void inc(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    @Override
    public int compareTo(Pair p) {
        return p.counter - this.counter;
    }
}
