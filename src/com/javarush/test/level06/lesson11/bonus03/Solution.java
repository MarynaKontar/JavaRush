package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] a=new int[5];
        for (int i = 0; i < 5; i++)
        {
            a[i]=Integer.parseInt(reader.readLine());
        }
        int b;
        for (int i = a.length-1; i >= 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (a[j+1]<a[j]){
                    b=a[j];
                    a[j]=a[j+1];
                    a[j+1]=b;

                }
            }


        }
        //напишите тут ваш код
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }

    }
}