package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        System.out.println(getCountTheSameFirstName(map, "Бу3"));
        System.out.println(getCountTheSameLastName(map, "Лунтик1"));

    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Лунтик1","Бу1");
        map.put("Лунтик2","Бу2");
        map.put("Лунтик3","Бу3");
        map.put("Лунтик4","Бу3");
        map.put("Лунтик5","Бу5");
        map.put("Лунтик6","Бу6");
        map.put("Лунтик7","sdfg");
        map.put("Лунтик8","Бу2");
        map.put("Лунтик9","Бу2");
        map.put("Лунтик10","Бу2");
        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        /*
        for (String NAME : map.keySet())
        {
            //String key = pair.getKey();                      //ключ
            //String value = pair.getValue();                  //значение

            if (NAME.contains(name)) //ім'я
            {count++;}
        }
        */

        ///*

         for (Map.Entry<String, String> pair : map.entrySet())
        {
             if (name.equals(pair.getValue()))   //map.containsValue(name)
            {count = count + 1;}
        }
        //*/


        //напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        ///*
        int count = 0;
        if (map.containsKey(lastName)) //призвіще
        {count++;}
        //напишите тут ваш код
        return count;
        //*/
        //return map.containsKey(lastName) ? 1 : 0;
        //напишите тут ваш код

    }
}
