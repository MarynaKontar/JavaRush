package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        /*int a[] = array;
        for (int i = array.length-1; i >= 0; i--)
        {
            array[array.length-i-1] = a[i];
            System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);

        }*/

        //int temp;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length-i-1; j++)
            {
                if (array[j] < array[j+1]) {
                   int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }


        //напишите тут ваш код
    }
}
