package by.it.serzhanovich.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;
import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args)


    {
        ArrayList <String>list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
       String a= scanner.next();
       String b= scanner.next();
       String c= scanner.next();
       String d= scanner.next();
       String e= scanner.next();
       list.add(a);
       list.add(b);
       list.add(c);
       list.add(d);
       list.add(e);

        System.out.println(a+""+b+" "+c+" "+d+" "+e+" ");
        }

    }

