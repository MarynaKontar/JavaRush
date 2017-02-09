package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Введіть перше число:");
        int a=Integer.parseInt(reader.readLine());
        //System.out.println("Введіть друге число:");
        int b=Integer.parseInt(reader.readLine());
        //System.out.println("Введіть третє число:");
        int c=Integer.parseInt(reader.readLine());
        //System.out.println("Введіть четверте число:");
        int d=Integer.parseInt(reader.readLine());
        int m=max2(max2(a,b),max2(c,d));
        System.out.println(m);

    }
    public static int max2(int a, int b){
        int m;
        if (a>b)
            m=a;
        else m=b;
        return m;
    }
}
