package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<>();
        Random random = new Random();
        String s = "Л";
        for (int i = 0; i < 20; i++)
        {
            s = s+(char)(random.nextInt(21));
            set.add(s);
        }
        //напишите тут ваш код
        return set;
    }
}
