package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.lang.reflect.Array;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        sort(a,b,c);

    }
    public static void sort(int a, int b,int c){
        int [] m={a, b, c};
        int temp;
        for (int i = 0; i <(m.length-1); i++){
            for (int j = 0; j < (m.length-1-i); j++)
            {
                if (m[j] < m[j + 1])
                {
                    temp = m[j + 1];
                    m[j + 1] = m[j];
                    m[j] = temp;
                }
            }
        }

        System.out.println(m[0] + " " + m[1] + " " +m[2]);
    }

}
