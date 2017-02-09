package com.javarush.test.level08.lesson08.task02;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    /*public static void main(String[] args) {
        System.out.println(createSet());
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }*/
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, 1, 8, 6, 21, 53, 5, 67, 18, 2 , -5 , 89 , 90 , 34 , -1 , 4 , 45, -567, 456, 78, -2);

        //set.addAll({2 , 5 , 89 , 90 , 34 , 1 , 4});// так нельзя
        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();

        while(iterator.hasNext()){
            int next = iterator.next();
            if (next > 10)
                iterator.remove();//next.remove(iterator) буде н вірно, так як з колекцій можна  видаляти через ітератор
        }
        return set;
        //напишите тут ваш код

    }
}
