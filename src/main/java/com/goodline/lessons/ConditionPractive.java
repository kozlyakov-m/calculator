package com.goodline.lessons;

import java.util.Scanner;

public class ConditionPractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        try{
            int num = Integer.parseInt(input);
        }
        catch(Exception e){
            System.out.println("not a number");
        }



        // Узнаем что ввел пользователь и сохраняем в переменную

        // Если то, что ввел пользователь меньше 5, то выводим "Маленькое число"
        // В другом случае если больше 15, то выводим "Большое число"
        // Во всех других случаях выводим "То, что надо!"
    }
}
