package com.goodline.homework;


import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Type expression like this (three lines required): \n123\n+\n4321\n");
        int a = 0, b = 0;
        char operation = 'ツ';
        try {
            a = Integer.parseInt(scanner.next());
            operation = scanner.next().charAt(0);
            b = Integer.parseInt(scanner.next());
        }
        catch (Exception e){
            System.out.println("I don't understand you, meatbag");

        }
        switch (operation){
            case '+':
                System.out.println(sum(a,b)); break;
            case '-':
                System.out.println(sub(a,b)); break;
            case '*':
                System.out.println(mult(a,b)); break;
            case '/':
                try{
                    System.out.println(div(a,b));
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
                break;
            case '^':
                try {
                    System.out.println(pow(a, b));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("This operation is unsupported yet");
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a*b;
    }
    public static double div(int a, int b) throws Exception {
        if(b==0) throw new Exception("Division by zero!");
        double result = (double)a/(double)b;
        result = Math.round(result*100)/100.0;
        return result;
    }
    public static double pow(int a, int b) throws Exception{
        if(a==0 && b<0) throw new Exception("Division by zero!");
        double result = 1;
        while(b>0){
            result*=a;
            b--;
        }
        while(b<0){
            result/=a;
            b++;
        }
        return result;
    }
}
