package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    static int n;
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        //n=N;
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> list = new ArrayList<>(N);
        //zapis(list);
        for (int i = 0; i < N; i++)
        {
            list.add(reader.readLine());
        }
        for (int i = 0; i < M; i++)
        {
            list.add(list.get(0));
            list.remove(0);
        }
        for (String s: list)
        {
            System.out.println(s);
        }
    }
        /*public static ArrayList<String> zapis(ArrayList<String> list)
        {
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < n; i++)
            {
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                list.add(i, reader1.readLine());
            }
            return list;
        }*/
        //напишите тут ваш код
    }

