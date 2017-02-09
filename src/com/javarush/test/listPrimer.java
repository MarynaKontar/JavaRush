package com.javarush.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by User on 06.12.2016.
 */
public class listPrimer
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>(3);
        System.out.println(list.size());
        list.add("роза"); //0
        System.out.println(list.size());
        list.add("лира"); //1
        System.out.println(list.size());
        list.add("лоза"); //2
        System.out.println(list.size());
        list.add("ertа"); //2
        System.out.println(list.size());
        list.add("wqert"); //2
        System.out.println(list.size());
        list.add("WRTHGY"); //2
        System.out.println(list.size());
        list.add("werfgrt"); //2
        System.out.println(list.size());
        list.add("434556"); //2
        System.out.println(list.size());
        list.add("wq34R"); //2
        System.out.println(list.size());

        //list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
        String x=list.get(0);
        System.out.println(list.get(0).contains("р"));

    }

    public static ArrayList<String> fix(ArrayList<String> list)
    {
        return null;
    }
}
