package by.it.serzhanovich.lesson02;

import by.it._examples_.demo03.Summator;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(("Dec:")+(( a+"+"+b)+"="+(a+b)));
        System.out.println(("Bin:")+(Integer.toBinaryString(a)+"+"+Integer.toBinaryString(b)+"="+Integer.toBinaryString(a+b )));
        System.out.println(("Hex:")+(Integer.toHexString(a)+"+"+Integer.toHexString(b)+"="+Integer.toHexString(a+b)));
        System.out.println(("Oct:")+(Integer.toOctalString(a)+"+"+Integer.toOctalString(b)+"="+Integer.toOctalString(a+b)));


    }
}
