package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("кот"); //3
        list.add("рот жмот лот"); //4
        list.add("енот"); //5
        list.add("ллллл"); //6
        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
        */

        ArrayList<String> cats = new ArrayList<>();
        cats.add("Мурзик");
        cats.add("Васька");
        cats.add("Мурзик");

        int count = Collections.frequency(cats, "Мурзик"); // получим результат 2
        System.out.println(String.valueOf(count)); // выводим результат в TextView

        List<Integer> numbers = Arrays.asList(1, 2, 5, 9, 11);
        System.out.println(numbers.get(2));
        numbers.add(34);//нельзя добавлять в List, только заменять элементы (set)
        System.out.println(numbers.get(4));

    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        int i=0;
        while (i < list.size())
            if (!(list.get(i).contains("р") ^ list.get(i).contains("л")))  // XOR (^) - false, если оба опреанда true
                // или оба операнда false. Поэтому поставила НЕ (!)
                i++;
            else if (list.get(i).contains("л")){
                list.add(i+1, list.get(i));
                i = i + 2;}
            else //if (list.get(i).contains("р"))    // оставщийся вариант и есть "содержащие р, но не содержащие л"
                list.remove(i);
            //else i++;

        return list;
    }


}