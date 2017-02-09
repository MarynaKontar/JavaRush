package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //1.
        ArrayList<String> list = new ArrayList<String>();
        //2.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        //3.
        int max = list.get(0).length();
        ArrayList<Integer> j = new ArrayList<Integer>();//створюємо список для запису індексів найдовших строк в list
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() >= max){
                max = list.get(i).length();//знаходимо максимальну довжину строки
            }
        }

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).length() == max){
                j.add(i);//записуємо індикси самих довгих строк в список j
            }
        }


        //int s = j.get(0);//індекс строки з максимальною довжиною (буде обов'язково хоча б одна)
        //4.
        //System.out.println(list.get(s));//виводить першу найбільшу строку в списку list
        //5.
        for (int i = 0; i < j.size(); i++)
        {
            System.out.println(list.get(j.get(i)));//виводить усі найбільші строки у списку list (якщо є однакові)
        }

        //напишите тут ваш код

    }
}
