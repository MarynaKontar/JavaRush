package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        String r = reader.readLine();
        while (!(r.equals("end"))){
            list.add(r);
            r = reader.readLine();
        }


        /*
        // так нельзя, потому что проверяем мі одну строку
        // на условие, а в list записываем следующую считіваемую строку. в итоде в list будет только половина введеных
        //строк, а цикл не всегда прервется при введении end
        while (!(reader.readLine().equals("end"))){
            list.add(reader.readLine());
        }*/

        //System.out.println(list.size());

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }

        /*for (String s: list)
        {
            System.out.println(s);
        }*/
        //напишите тут ваш код
    }
}
