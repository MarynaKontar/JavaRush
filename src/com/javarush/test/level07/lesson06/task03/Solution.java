package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //1.
        ArrayList<String> list = new ArrayList<String>(5);
        //2.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        //3.
        int min = list.get(0).length();
        ArrayList<Integer> j = new ArrayList<Integer>();//створюємо список для запису індексів найдовших строк в list
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() <= min){
                min = list.get(i).length();//знаходимо максимальну довжину строки
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == min){
                j.add(i);//записуємо індикси самих довгих строк в список j
            }
        }
        //5.
        for (int i = 0; i < j.size(); i++)
        {
            System.out.println(list.get(j.get(i)));//виводить усі найбільші строки у списку list (якщо є однакові)
        }
    }
}
