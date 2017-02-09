package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public Solution()
    {
        super();
    }

    /*public static void main(String[] args)
    {
        //HashMap<String, Date> map = new HashMap<String, Date>();
        HashMap<String, Date> map = createMap();
        System.out.println(map);
        removeAllSummerPeople(map);
        System.out.println(map.toString());
    }
    */
    public static HashMap<String, Date> createMap()
    {
        //SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 6 1980"));
        map.put("Makarone", new Date("JULY 6 2012"));
        map.put("MacCartny", new Date("AUGUST 23 987"));
        map.put("Degory", new Date("OCTOBER 20 1450"));
        map.put("Potter", new Date("JULY 17 1659"));
        map.put("Graindger", new Date("NOVEMBER 19 1787"));
        map.put("Capuletty", new Date("DECEMBER 10 1880"));
        map.put("Dambldor", new Date("MAY 4 1945"));
        map.put("Black", new Date("APRIL 29 1967"));
        map.put("Snegg", new Date("MARCH 30 1998"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            int m = iterator.next().getValue().getMonth() + 1;//в map записані дати (в Value).
            // Щоб из дати отримати місяць, треба iterator.next().getValue().getMonth().
            // Але нумерація місяців іде з 0 (2 - березень, наприклад). Тому додаємо 1, и літні місяці
            //можна писати у зручному вигляді(6-8)
            if ((m >= 6 && m <= 8))
                iterator.remove();
        }
        //напишите тут ваш код

    }
}





//правильное удаление из HashMap https://dev64.wordpress.com/2013/03/11/how-to-deal-with-concurrent-modification-exception/
                /*
                Iterator it = map.entrySet().iterator();
   while (it.hasNext())
   {
      Entry item = it.next();
      it.remove(item);
   }
                 */
