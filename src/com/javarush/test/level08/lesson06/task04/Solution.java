package com.javarush.test.level08.lesson06.task04;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(getTimeMsOfGet(fill(new ArrayList())));//8 ms (14, 7, 7, 9)
        System.out.println(getTimeMsOfGet(fill(new LinkedList())));//34 ms (71, 31, 32, 40)
    }

    private static List fill(List list)
    {
        for(int i = 0; i < 11; i++)
        {
            list.add(new Object());
        }
        return list;
    }

    public static long  getTimeMsOfGet(List list)
    {
        Date currentTime = new Date();
        //напишите тут ваш код
        get10000(list);
        Date timeAfter10000get = new Date();
        return timeAfter10000get.getTime() - currentTime.getTime();
        //напишите тут ваш код
    }

    public static void get10000(List list)
    {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++)
        {
            list.get(x);
        }
    }
}
