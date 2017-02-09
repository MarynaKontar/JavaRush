package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());
        int c=Integer.parseInt(reader.readLine());
        int m=0;
        if ((a>b&&a<c)||(a>c&&a<b))
            m=a;
        else if ((b>a&&b<c)||(b>c&&b<a))
            m=b;
        else if ((c>a&&c<b)||(c>b&&c<a))
            m=c;
        System.out.println(m);
    }
}
