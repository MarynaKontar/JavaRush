package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна
пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три
числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введіть перше число: ");
        String a1=reader.readLine();
        int a=Integer.parseInt(a1);
        //System.out.println("Введіть друге число: ");
        String a2=reader.readLine();
        int b=Integer.parseInt(a2);
        //System.out.println("Введіть третє число: ");
        String a3=reader.readLine();
        int c=Integer.parseInt(a3);
        //int k=0;
        if ((a==b)&&(a==c))
            System.out.println(a+" "+b+" "+c);
        //else if ((a==b)||(a==c))
        //    System.out.println(a+" "+a);
        else if (a==b)
            System.out.println(a+" "+b);
        else if (a==c)
            System.out.println(a+" "+c);
        else if (b==c)
            System.out.println(b+" "+c);
        //else System.out.println("Числа не рівні між собою");
        else System.out.println("");

    }
}