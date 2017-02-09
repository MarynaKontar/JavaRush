package com.javarush.test.level08.lesson08.task05;

import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
        ///*
        public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        System.out.println(map);
        removeTheFirstNameDuplicates(map);
        System.out.println(map.toString());
    }
    //*/



    public static HashMap<String, String> createMap()
    {
        HashMap<String , String> map = new HashMap<String , String >();
        map.put("Stallone", "Дима");
        map.put("Makarone", "Лена");
        map.put("MacCartny", "Саша");
        map.put("Degory", "Александр");
        map.put("Potter", "Александра");
        map.put("Graindger", "Лена");
        map.put("Capuletty", "Дима");
        map.put("Dambldor", "Лена");
        map.put("Black", "Лена");
        map.put("Snegg", "Дим");
        return map;


        //напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        /*
        //HashMap<String, String> map1 = map;
        //Iterator<Map.Entry<String, String>> iterator1 = map1.entrySet().iterator();
        Iterator<Map.Entry<String, String>> iterator1 = map.entrySet().iterator();
        //while (iterator1.hasNext()) System.out.print(iterator1.next() + " ");
        //System.out.println("");
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();
        //while (iterator2.hasNext()) System.out.print(iterator2.next() + " ");
        //System.out.println("");
        //Iterator<Map.Entry<String , String >> iterator = map.entrySet().iterator();
        while (iterator1.hasNext())
        {
            Map.Entry<String, String> it1 = iterator1.next();
            System.out.println(it1.getKey() + " : " + it1.getValue());
            while (iterator2.hasNext())
            {
                Map.Entry<String, String> it2 = iterator2.next();
                System.out.println(it2.getKey() + " : " + it2.getValue());
                if (it1.getValue() == it2.getValue() && !(it1.getKey() == it2.getKey()))
                    removeItemFromMapByValue(map, it2.getValue());
            }
        }
        while (iterator1.hasNext()) System.out.println(map);
        while (iterator2.hasNext()) System.out.println(map);
        */

        ArrayList<String> names = new ArrayList<String>(map.values());
        for (String name : names)
        {
            int fr = Collections.frequency(names, name);
            System.out.println(fr);
            if (fr > 1) {
                removeItemFromMapByValue(map, name);
                //names.remove(name);
            }
            System.out.println(map);
        }
        /*
         HashMap<String, String> copy = new HashMap<String, String>(map);
         for (String value : copy.values())
        if (Collections.frequency(copy.values(), value) > 1)
            removeItemFromMapByValue(map, value);
         */


        //напишите тут ваш код
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        /*
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
        */
        ///*
        Iterator<Map.Entry<String , String >> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            if (iterator.next().getValue().equals(value))
                iterator.remove();
        }
        //*/
    }
}


/*

       HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> s : copy.entrySet())
        {
            for (Map.Entry<String, String> s2 : copy.entrySet())
            {
                if(s.getValue().equals(s2.getValue()) && !s.getKey().equals(s2.getKey())) removeItemFromMapByValue(map,s.getValue());
            }
        }
 */