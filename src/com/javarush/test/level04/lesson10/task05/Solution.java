package com.javarush.test.level04.lesson10.task05;

import java.io.*;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int i = 1, j = 1, a = 0;
        //String S="S";

        while (j <= 10)
        {
            while (i <= 10)
            {
                a = j * i;
                System.out.print(a+" ");
                i++;
            }
            System.out.println("");
            i=1;
            a=0;
            j++;
        }


    }
}
