package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький,
вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] listbolshoy = new int[20];
        int[] listmalenkiy1 = new int[10];
        int[] listmalenkiy2 = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < listbolshoy.length; i++)
        {
            listbolshoy[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < listbolshoy.length; i++)
        {
            if (i<listbolshoy.length/2)
                listmalenkiy1[i] = listbolshoy[i];
            else
            {
                listmalenkiy2[i - 10] = listbolshoy[i];
                System.out.println(listmalenkiy2[i - 10]);
            }
        }
        //напишите тут ваш код

    }
}
