package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1,
вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //int a=Integer.parseInt(reader.readLine());
        //int b=Integer.parseInt(reader.readLine());
        boolean isExit = false;
        int A=0;
        while (!isExit)
        {
            String s = reader.readLine();
            int a=Integer.parseInt(s);
            A+=a;
            isExit = s.equals("-1");
        }
        System.out.println(A);
    }
}
