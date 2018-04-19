package by.it.serzhanovich.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ввод :");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Вывод :");
        System.out.println ("Sum"+" "+"="+" "+ (a+b));

    }





}
