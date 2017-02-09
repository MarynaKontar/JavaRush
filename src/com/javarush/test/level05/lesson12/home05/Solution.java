package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        //double s=0;
        int s=0;
        //String sss;
        //boolean tr=true;
        while (true){
            String sss=reader.readLine();
            if (sss.equals("сумма")){
                //tr=false;
                break;
            }
            //double ss=Double.parseDouble(sss);
            //s=s+Double.parseDouble(sss);
            s=s+Integer.parseInt(sss);
        }
        System.out.println(s);

        //напишите тут ваш код
    }
}
