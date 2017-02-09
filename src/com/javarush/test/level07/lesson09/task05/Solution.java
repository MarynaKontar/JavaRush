package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list= new ArrayList<String>();
        int n = 10;
        for (int i = 0; i < n; i++){ list.add(reader.readLine()); }
        //Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> result = doubleValues(list);

        for (String s : result) {System.out.println(s);}  //цикл foreach перебирает все элементы массива ArrayList
        //Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        /*// Подвоює букви в строках масиву строк list
        String s = "";
        for (int i = 0; i < list.size(); i++)
        {
            char[] ch = list.get(i).toCharArray();// кожну строку переробили на масив символів ch
            for (int j = 0; j < ch.length; j++)
                s = s + ch[j] + ch[j];// створюємо строку,  в якій кожен символ повторюється (ch[j] + ch[j])
            list.set(i, s);// записуємо цю строку в масив строк
            s = "";
        }*/

        /* // Також Подвоює букви в строках масиву строк list, але у вигляді [t, t, y, y, u, u, h, h, i, i, j, j].
        //Треба розібратися
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            ArrayList<Character> c = new ArrayList<Character>();
            for (int j = 0; j < s.length(); j++)
            {
                c.add(s.charAt(j));
                c.add(s.charAt(j));
            } //переробили строку в масив символів (ArrayList<Character>)
            list.set(i, c.toString());// перезаписали подвоєний масив символів в і-ую ячейку масиву строк (list)
        }
        */


        /* // Також Подвоює букви в строках масиву строк list, але у вигляді [t, t, y, y, u, u, h, h, i, i, j, j].
        //Треба розібратися
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            ArrayList<Character> c = new ArrayList<Character>();
            for (int j = 0; j < s.length(); j++)
            {
                c.add(s.charAt(j));
            }
            //char[] c = s.toCharArray();
            for (int k = 0; k < c.size(); k = k + 2)
            {
                c.add(k, c.get(k));
            }  // подвоїли усі символи
            //for (int k = 0; k < c.length; k=k+2){c[k+1]=c[k]+c[k]);}  // подвоїли усі символи
            list.set(i, c.toString());
        }
        */


        for (int i = 0; i < list.size(); i+=2)
        {
            list.add(i,list.get(i));
        }
        //напишите тут ваш код
        return list;
    }
}
